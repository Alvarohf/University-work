package fuente;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * This class is listener of a treeWalker of JSON that generates a JSON symbol table
 * 
 * @author Alvarohf
 *
 */


public class ListenerFicheroJSON extends GrammarjsonldParserBaseListener {

    // Our _symbolTable that we will fill it
    private TSimbJSON _symbolTable;

    private ListenerFicheroJSON() {
        super();
    }

    /**
     * Constructor to pass the symbol table
     * 
     * @param p_st Symbol table we will use
     */
    public ListenerFicheroJSON(TSimbJSON p_st) {
        _symbolTable = p_st;
    }

    //--------------------------GRAPH_ELEMENTS--------------------------------
    //We create here a new GRAPH and set its NAME and its TYPE

    @Override
    public void enterGraph(GrammarjsonldParser.GraphContext ctx) {
        //We create a new graph in memory
        _symbolTable.createNewGraph();
    }

    @Override
    public void exitGraph(GrammarjsonldParser.GraphContext ctx) {
        //We add the name to the graph after we leave it
        _symbolTable.getGraph().setName(ctx.value().getText());
    }

    @Override
    public void exitGraphType(GrammarjsonldParser.GraphTypeContext ctx) {
        //We assign the type to the last graph we have
        _symbolTable.getGraph().setType(ctx.GRAPHTYPE().getText());
    }


    // ---------------------------COMMON_ELEMENTS-------------------------------------
    //We set here ID, NAME, LABEL (Common in all) and PROPERTIES (Only class and relationship)

    @Override
    public void exitId(GrammarjsonldParser.IdContext ctx) {
        // We add to the last graph and last block new id that we get from value rule
        //Also we put in lowercase to avoid typo errors
        _symbolTable.getGraph().getBlock().addValue("id", ctx.value().getText().toLowerCase());
    }
    
    @Override
    public void enterName(GrammarjsonldParser.NameContext ctx) {
        // We add to the last graph and last block new name that we get from value rule
        _symbolTable.getGraph().getBlock().addValue("name", ctx.value().getText());
    }

    @Override
    public void exitLabel(GrammarjsonldParser.LabelContext ctx) {
        // Initialize of hashmap for all the values inside a label
        HashMap<String, String> values = new HashMap<String, String>();
        // We fill it with all the values we got after leaving Label rule
        for (int i = 0; ctx.reference().size() > i; i++) {
            values.put(ctx.reference(i).STRING().getText(), ctx.reference(i).value().getText());
        }
        // We add to the last graph and last block label field and the new values wich
        // is the hashmap
        _symbolTable.getGraph().getBlock().addSpecialValues("label", values);
    }
    @Override
    public void exitProperties(GrammarjsonldParser.PropertiesContext ctx) {
        // Initialize of ArrayList for all the values inside of properties
        ArrayList<String> values = new ArrayList<String>();
         // We fill it with all the values we got after leaving properties rule
        for (int i = 0; ctx.value().size() > i; i++) {
            values.add(ctx.value(i).getText().toLowerCase());
        }
         // We add to the last graph and last block properties field and the new values wich
        // is the ArrayList that we have filled
        _symbolTable.getGraph().getBlock().addValues("properties", values);
    }


    // ---------------------------PROPERTY_ELEMENTS------------------------------------- 
    // We create a new block for a PROPERTY and set TYPEOF, ISLIST, OPTIONAL, MULTIPLICITYMAX, MULTIPLICITYMIN and LANGUAGEDATA
    @Override
    public void enterProperty(GrammarjsonldParser.PropertyContext ctx) {
        //We create a new block to assign it memory
        _symbolTable.getGraph().createNewBlock();
        // We add to the last graph and last block new id that we get from value rule in id 
        //Also we put in lowercase to avoid typo errors
        _symbolTable.getGraph().getBlock().setName(ctx.id().value().getText().toLowerCase());
    }

    @Override
    public void exitTypeOf(GrammarjsonldParser.TypeOfContext ctx) {
         // We add to the last graph and last block new typeOf that we get from value rule
        _symbolTable.getGraph().getBlock().addValue("typeOf", ctx.value().getText());
    }
    
    @Override
    public void enterIsList(GrammarjsonldParser.IsListContext ctx) {
        // We add to the last graph and last block new isList that we get from value rule
        _symbolTable.getGraph().getBlock().addValue("isList", ctx.booleanValue().getText());
    }

    @Override
    public void exitOptional(GrammarjsonldParser.OptionalContext ctx) {
        // We add to the last graph and last block new optional that we get from booleanValue rule
        _symbolTable.getGraph().getBlock().addValue("optional", ctx.booleanValue().getText());
    }

    @Override
    public void enterMultiplicityMax(GrammarjsonldParser.MultiplicityMaxContext ctx) {
        // We add to the last graph and last block new multiplicityMax that we get from value rule
        _symbolTable.getGraph().getBlock().addValue("multiplicityMax", ctx.value().getText());
    }

    @Override
    public void exitMultiplicityMin(GrammarjsonldParser.MultiplicityMinContext ctx) {
        // We add to the last graph and last block new multiplicityMin that we get from value rule
        _symbolTable.getGraph().getBlock().addValue("multiplicityMin", ctx.value().getText());
    }
    @Override
    public void exitLanguageData(GrammarjsonldParser.LanguageDataContext ctx) {
        // Initialize of ArrayList for all the values inside of LanguageData
        ArrayList<String> values = new ArrayList<String>();
          // We fill it with all the values we got after leaving LanguageData rule
        for (int i = 0; ctx.value().size() > i; i++) {
            values.add(ctx.value(i).getText());
        }
        // We add to the last graph and last block languageData field and the new values wich
        // is the ArrayList that we have filled
        _symbolTable.getGraph().getBlock().addValues("languageData", values);
    }


    // ---------------------------RELATIONSHIP_ELEMENTS-------------------------------
    // We create a new block for a RELATIONSHIP and set REVERSENAME, LABELREVERSENAME, FROM and TO 
    @Override
    public void enterRelationship(GrammarjsonldParser.RelationshipContext ctx) {
        //We create a new block to assign it memory
        _symbolTable.getGraph().createNewBlock();
        // We add to the last graph and last block new id that we get from value rule in id 
        //Also we put in lowercase to avoid typo errors
        _symbolTable.getGraph().getBlock().setName(ctx.id().value().getText().toLowerCase());
    }
    @Override
    public void exitReverseName(GrammarjsonldParser.ReverseNameContext ctx) {
         // We add to the last graph and last block new reverseName that we get from value rule
        _symbolTable.getGraph().getBlock().addValue("reverseName", ctx.value().getText());
    }
    @Override
    public void exitLabelReverseName(GrammarjsonldParser.LabelReverseNameContext ctx) {
         // Initialize of hashmap for all the values inside a Reverselabel
        HashMap<String, String> values = new HashMap<String, String>();
          // We fill it with all the values we got after leaving Reverselabel rule
        for (int i = 0; ctx.reference().size() > i; i++) {
            values.put(ctx.reference(i).STRING().getText(), ctx.reference(i).value().getText());
        }
        // We add to the last graph and last block Reverselabel field and the new values wich
        // is the hashmap
        _symbolTable.getGraph().getBlock().addSpecialValues("labelReverseName", values);
    }
    @Override
    public void exitFrom(GrammarjsonldParser.FromContext ctx) {
         // We add to the last graph and last block new from that we get from value rule
        _symbolTable.getGraph().getBlock().addValue("from", ctx.value().getText());
    }

    @Override
    public void exitTo(GrammarjsonldParser.ToContext ctx) {
         // We add to the last graph and last block new to that we get from value rule
        _symbolTable.getGraph().getBlock().addValue("to", ctx.value().getText());
    }


     // ------------------------------CLASS_ELEMENTS-------------------------------
     // We create a new block for a CLASS and set USEDBY and INHERITS
     @Override
     public void enterClassObject(GrammarjsonldParser.ClassObjectContext ctx) {
         //We create a new block to assign it memory
         _symbolTable.getGraph().createNewBlock();
        // We add to the last graph and last block new id that we get from value rule in id 
        //Also we put in lowercase to avoid typo errors
         _symbolTable.getGraph().getBlock().setName(ctx.id().value().getText().toLowerCase());
     }
    
     @Override
    public void exitUsedBy(GrammarjsonldParser.UsedByContext ctx) {
        // Initialize of ArrayList for all the values inside of usedBy
        ArrayList<String> values = new ArrayList<String>();
         // We fill it with all the values we got after leaving usedBy rule
        for (int i = 0; ctx.value().size() > i; i++) {
            values.add(ctx.value(i).getText().toLowerCase());
        }
        // We add to the last graph and last block usedBy field and the new values wich
        // is the ArrayList that we have filled
        _symbolTable.getGraph().getBlock().addValues("usedBy", values);
    }


    @Override
    public void exitInherits(GrammarjsonldParser.InheritsContext ctx) {
        // We add to the last graph and last block new inherits that we get from value rule
        //Also we put in lowercase to avoid typo errors
        _symbolTable.getGraph().getBlock().addValue("inherits", ctx.value().getText().toLowerCase());
    }

}