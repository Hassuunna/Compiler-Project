import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;

public class CodeGen {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Aref\\Desktop\\COOL Parser\\src\\helloworld.cl");
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        Lexer2 lexer = new Lexer2(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParsingParser parser = new ParsingParser(tokens);
        ParseTree tree = parser.program();
        ParsingBaseVisitor visitor = new ParsingBaseVisitor();
        visitor.visit(tree);
    }
}
