import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;

public class Analizador {

    public static void main(String[] args) throws Exception {
        // Inicializamos cadena
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        // Inicializo ANTLR con fichero
        ANTLRInputStream input = new ANTLRInputStream(is);
        // Creamos el lexer
        gFiboLexer lexer = new gFiboLexer(input);
        // Conectamos el canal de tokens con el lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Iniciamos el parser
        gFiboParser parser = new gFiboParser(tokens);
        // Generar el arbol a partir del axioma de la gramatica
        ParseTree tree = parser.codigo();

        // Recorremos el arbol

        // Inicializamos un recorredor
        ParseTreeWalker walker = new ParseTreeWalker();
        // Inicializamos mi escuchador
        AnalizadorListener listener = new AnalizadorListener();
        // Ponemos el nombre al fichero
        listener.setNombreFichero(args[1]);
        // Recorremos el arbol
        walker.walk(listener, tree);

    }

}