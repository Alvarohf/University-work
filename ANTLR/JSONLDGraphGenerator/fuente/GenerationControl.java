package fuente;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * This class is listener of a treeWalker of input that generates an input
 * symbol table
 * 
 * @author Alvarohf
 *
 */

public class GenerationControl {

    private HashMap<String, String> _parameters;
    private boolean _custom = false;

    public GenerationControl() {

    }

    public GenerationControl(HashMap<String, String> p_parameters) {
        this._parameters = p_parameters;
        this._custom = true;
    }

    public void csv(String inputFile) {
        try {
            // Error management in case of wrong file
            InputStream is = new FileInputStream(inputFile);
            // JSON Parse file
            CharStream input = CharStreams.fromStream(is);
            GrammarCsvLexer lexer = new GrammarCsvLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarCsvParser parser = new GrammarCsvParser(tokens);
            // Creation of parser tree
            parser.setBuildParseTree(true);
            ParseTree tree = parser.csv();
            // Creation of symbol table
            TSimbCSV tsimb = new TSimbCSV();
            // Listener and walker creation
            ListenerFicheroCSV listener = new ListenerFicheroCSV(tsimb);
            ParseTreeWalker walker = new ParseTreeWalker();
            JSONConversor con = new JSONConversor();
            // Walking the tree
            walker.walk(listener, tree);
            // Our symbol table after walking the tree
            // 
            //System.out.println(tsimb.toString());
            String jsonName = "default";
            String dotName = "default";
            String svgName = "default";
            for (int i = 1; i < tsimb.rowsSize() + 1; i++) {
                for (int j = 0; j < tsimb.columnSize(); j++) {
                   
                    if (tsimb.getValue(i, tsimb.getColumnName(j)) != null) {
                        if (tsimb.getColumnName(j).equals("rutafichero")) {
                            if (!(tsimb.getValue(i, tsimb.getColumnName(j)).replace(".json", "").equals(""))) {
                                jsonName = tsimb.getValue(i, tsimb.getColumnName(j));
                            } else {
                                break;
                            }
                        } else if (tsimb.getColumnName(j).equals("rutaficherosalida")) {
                            if (!(tsimb.getValue(i, tsimb.getColumnName(j)).replace(".dot", "").equals(""))) {
                                dotName = tsimb.getValue(i, tsimb.getColumnName(j)).replace(".dot", "");
                            } else {
                                dotName = jsonName.replace(".json", "").replace(".txt", "");
                            }
                        } else if (tsimb.getColumnName(j).equals("rutaficherografico")) {
                            if (!(tsimb.getValue(i, tsimb.getColumnName(j)).replace(".svg", "").equals(""))) {
                                svgName = tsimb.getValue(i, tsimb.getColumnName(j)).replace(".svg", "");
                            } else {
                                svgName = jsonName.replace(".json", "").replace(".txt", "");
                            }
                        }
                    }
                }
                json(jsonName, dotName, svgName);
            }
        } catch (FileNotFoundException fexc) {
            System.out.println("ERROR El fichero que se quiere abrir no existe: \n" + fexc);
            // fexc.printStackTrace(System.err);
        } catch (IOException io) {
            io.printStackTrace(System.err);
        }
    }

    public void json(String p_input, String p_dotOutput, String p_svgOutput) {
        System.out.println("\tParsing JSON: "+  p_input);
        try {
            JsonToDot dot = new JsonToDot();
            // Initialize String
            String inputFile = p_input;
            InputStream is = System.in;
            // JSON Parse file
            if (inputFile != null) {
                is = new FileInputStream(inputFile);
            }

            CharStream input = CharStreams.fromStream(is);
            GrammarjsonldLexer lexer = new GrammarjsonldLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarjsonldParser parser = new GrammarjsonldParser(tokens);

            // Creation of parser tree
            parser.setBuildParseTree(true);
            ParseTree tree = parser.json();
            // Creation of symbol table
            TSimbJSON tsimb = new TSimbJSON();
            // Listener and walker creation
            ListenerFicheroJSON listener = new ListenerFicheroJSON(tsimb);
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walking the tree
            walker.walk(listener, tree);
            // We converse the graphs
            JSONConversor jsonConver;
            if (_parameters != null) {
                jsonConver = new JSONConversor(tsimb, _parameters);
            } else {
                jsonConver = new JSONConversor(tsimb);
            }

            jsonConver.setDotOutput(p_dotOutput);
            jsonConver.setSvgOutput(p_svgOutput);
            jsonConver.generateAll(_custom);
            // System.out.print(tsimb.toString());
        } catch (FileNotFoundException fexc) {
            System.out.println("ERROR El fichero que se quiere abrir no existe: \n" + fexc);
            // fexc.printStackTrace(System.err);
        } catch (IOException io) {
            io.printStackTrace(System.err);
        }

    }

}