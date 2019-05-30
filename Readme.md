# Compiler's Project
A compiler of COOL (Classroom Object-Oriented Language) implemented using Java.

## Group 6:
1. Mohamed Ahmed Ezzat
1. Mohamed Aref Eldebis
1. Mohamed Salama Okasha
1. Ahmed Mahmoud Abdelkhalek
1. Abdelrahman Elsayed
1. Hassan Raafat
## Project Phases
### Phase 1 The Lexer:
In this phase, we created a lexical analyzer (scanner) using antlr as lexical analyzer generator.
In the project's main folder you will find a folder called src which contains a `Lexer2.g4` file in which our lexer grammar is written.
- there is another folder called Test Cases which contains cl files to test our lexer on these files.
- You will find another folder called out in which the results of testing the test cases will be put.

We defined every single occurence for the COOL grammar as lexemes

We started with letters as fragments
```bash
fragment A : [aA];
```
 
then we used these fragments to define the other lexemes that we use, so for example:

class is considered as a 5 fragments piece of code 
```bash
CLASS: C L A S S;
```

**Note:** *here class lexeme is case-insensitive*

Constants and literal terminals is defined as 
```bash
ADD : '+';
```

---

### Phase 2 The Parser:
In this phase, we created a Parser to get the parse tree after we separated the tokens in phase 1.
In the project's main folder you will find a folder called src which contains a `parsing.g4` file in which our parser grammar is written.
- here we define every production for COOL language, so we can apply these productions on the tokens we get from phase 1
- Also we get a name for every production rule to use it later in the code generation phase

```bash
expr      : ID ASSIGN expr # assign
```

---

### Phase 3: Three Address Code Generation
The most important part in this phase is to collect the information you need from your source code in order to generate the equivalent three address code for that source code.

There are multiple ways you can get the data you need, you can use Antlr visitors and listeners, or you can use the generated CST from Antlr parsers using Antlr's API. We prefered the visitors way where we can get the three address code for every production on its own.

This way is actually discussed in the Dragon Book.

The basic structure for Code Generation

```java
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class ParsingBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ParsingVisitor<T> {

    private int n;

    @Override public T visitStart(ParsingParser.StartContext ctx) {
        n = 1;
        return visitChildren(ctx);
    }

    @Override public T visitEveryOtherProduction(ParsingParser.ClassDefContext ctx) { 
        return visitChildren(ctx);
    }
}
```

**So let's explain what happens here**

we import the Visitor class for Antlr and extends our main `ParsingBaseVisitor` class to it

we then declare the variable n which later will determine the temporary variables counter *( t1,t2,t3,...)* 

at start production we assign 1 as a base value for temporary variables counter

**Start Production** 
```bash
program   : classDefine+ # start
```

After this we visit every other production and generate the code for it


---
---
## Example:

Let's say we want to compile this simple COOL program
```java
class Main{
    main():Int{
        return 5 + 6;
    };
};
```

Running the `CodeGen.java` file

After visiting the Start production we visit the Class definition for main class
```java
@Override public T visitClassDef(ParsingParser.ClassDefContext ctx) { 
    return visitChildren(ctx);
}
```

after that we find a stmt that matches the production `expr` mainly the *# add* one
```bash
expr : expr ADD expr # add
```

That evaluates to the Add visitor
```java
@Override public T visitAdd(ParsingParser.AddContext ctx) {
        String expr1Value = (String) visit(ctx.expr(0));
        String expr2Value = (String) visit(ctx.expr(1));
        System.out.printf("t%d = %s + %s\n", n, expr1Value, expr2Value);
        return (T) String.valueOf("t" + n++);
}    
```

**Fregmenting this block to get what's inside**

1. it defines two strings for both expressions in the production body and assigns them with the values that return from their visitors
1. later it prints the three address code for the add production from the three values of t *(the currrent value and two values from the return)*
1. Finally it returns the current value then increments it for the later functions

in step 1 we called the expression visitor and gets it seturn value so what does it exactly do?

both expressions evaluates to the production `num`
```bash
expr : NUM # num
```

That evaluates to Num visitor where we get the number as a return value with the type `T`
```java
    @Override public T visitNum(ParsingParser.NumContext ctx) {
        return (T) ctx.NUM().getText();
    }
```

after returning those values to the Add visitor and resuming execution of the rest, you should see the word program printed.
```java
t1 = 5 + 6
```

**If you get errors, it might be one of those:**
- Make sure you regenerate Antlr code recognizer each time you modify the grammar.
- Make sure you call `parser.program()` only once.

Similarly, code generation for all other operators is done, by creating a new class for each expression that extends the expression class (like visitAdd class above).







