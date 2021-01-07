import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.*;

import fuente.*;
/**
 * 
 * This class is listener of a treeWalker of input that generates an input
 * symbol table
 * 
 * @author Alvarohf
 *
 */

public class transformacion {

	public static void main(String[] args) throws Exception {
		// Reading args and opening streams
		if (args.length > 0) {
			// Input Parse file
			CharStream input = CharStreams.fromString(String.join("",args));
			GrammarInputLexer lexer = new GrammarInputLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GrammarInputParser parser = new GrammarInputParser(tokens);

			// Creation of parser tree
			parser.setBuildParseTree(true);
			ParseTree tree = parser.input();

				// Creation of symbol table
			InputTable it = new InputTable();
		
		// Listener and walker creation
			ListenerInput listener = new ListenerInput(it);
			ParseTreeWalker walker = new ParseTreeWalker();
			// Walking the tree
			walker.walk(listener, tree);

			//We need some variables for the input type
			String dotName = "";
			String svgName = "";
			GenerationControl control;
			//We create our control with custom parameters or default one
			if (!it.customIsEmpty()) {
				control = new GenerationControl(it.getCustom());
			} else {
				control = new GenerationControl();
			}
			//We will get all the json files we got as parameters
			for (int i = 0; i < it.getSizeJson(); i++) {
				//If it is empty we dont go through it
				if (!(it.jsonIsEmpty())) {
					//If dot name or svg are empty they will get json name
					if (it.dotIsEmpty()) {
						dotName = it.getJson(i).replace(".json","").replace(".txt","");
					} else {
						dotName = it.getDot(i);
					}
					if (it.svgIsEmpty()) {
						svgName = it.getJson(i).replace(".json","").replace(".txt","");
					} else {
						svgName = it.getSvg(i);
					}
					System.out.println(it.getJson(i));
					//We transform it
					control.json(it.getJson(i), dotName, svgName);

				}
			}
			//We will get all the csv files we got as parameters
			for (int i = 0; i < it.getSizeCsv(); i++) {
				if (!(it.csvIsEmpty())) {
					//We transform it
					System.out.println("Parsing CSV"+it.getCsv(i));
					control.csv(it.getCsv(i));
				}
			}
		}
	}

}
