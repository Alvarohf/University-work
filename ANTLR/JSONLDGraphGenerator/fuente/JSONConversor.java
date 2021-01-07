package fuente;

import java.io.*;
import java.util.HashMap;

/**
 * 
 * This class generates all the dot files and svg files for all the graphs
 * 
 * @author Alvarohf
 *
 */

public class JSONConversor {

    private String _dotOutput;
    private String _svgOutput;
    private TSimbJSON _tsimb;
    private StringBuffer _sb = new StringBuffer();
    private JsonToDot _dot = new JsonToDot();
    private HashMap<String, String> _parameters = new HashMap<String, String>();

    /**
     * Constructor to get the symbol table
     * 
     * @param p_tsimb symbol table to pass
     */
    public JSONConversor() {

    }

    public JSONConversor(TSimbJSON p_tsimb) {
        this._tsimb = p_tsimb;
    }

    public JSONConversor(TSimbJSON p_tsimb, HashMap<String, String> p_parameters) {
        this._tsimb = p_tsimb;
        this._parameters = p_parameters;
    }

    public void generateAll(boolean p_custom) {
        for (int j = 0; j < _tsimb.getSize(); j++) {
            System.out.println("\t    Generating graph: " + _tsimb.getGraph(j).getName());
            _sb.append(_dot.drawBasicSchema(_tsimb.getGraph(j).getName()));
            // Complete all the data
            completeData(j);
            // Nodes
            generateAllNodes(j);
            // Edgess
            generateAllBasicEdges(j);
            // TypeOf (indirect and direct relations)
            generateAllTypeOfRelation(j);
            // Inherits
            generateAllInherits(j);
            // Relationship Links
            generateAllRelationshipRelations(j);
            _sb.append("}");
            // We generate our dot file
            generateDotFile(j);
            // We reset our string buffer for the new graph
            _sb.setLength(0);
            // We generate the SVG

            generateSVGFile(j);

        }

    }

    /**
     * Completes the data in the graph using the rest of values, in this case
     * properties and usedBy
     * 
     * @param p_graphNumber number of graph to complete
     */
    public void completeData(int p_graphNumber) {
        // If we complete the data with usedBy properties our final svg seems to be
        // different to the sample the teacher gave us

        String st = "";
        /*
         * //We first complete all properties that are mentioned by a property with
         * usedBy for (int i = 0; i < _tsimb.getGraph(p_graphNumber).getSize(); i++) {
         * //We get the name of the block st =
         * _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id"); //We check if
         * it is a property if (st.startsWith("property_")) { //We check if it has
         * usedBy values if
         * (_tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayListWithNull("usedBy")
         * !=null){ //In that case we iterate all of them to find wich block could
         * complete for (int j = 0;
         * j<_tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayListWithNull("usedBy"
         * ).size();j++){ for (int k = 0; k < _tsimb.getGraph(p_graphNumber).getSize();
         * k++){ //If the block name equals with the name in usedBy and we add it if
         * (_tsimb.getGraph(p_graphNumber).getBlock(k).getName().equals(_tsimb.getGraph(
         * p_graphNumber).getBlock(i).getMapArrayListWithNull("usedBy").get(j))){ //When
         * we are adding we take in care if it exits or duplicate values
         * _tsimb.getGraph(p_graphNumber).getBlock(k).addNewAttribute("properties",st);
         * } } } }
         * 
         * } }
         */
        // We complete all usedBy that are mentioned by a class or relationship with
        // properties
        for (int i = 0; i < _tsimb.getGraph(p_graphNumber).getSize(); i++) {
            // We get the name of the block
            st = _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id");
            // We check if it is a class or a relationship
            if (st.contains("class") || st.contains("relationship")) {
                // We check if it has properties
                if (_tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayListWithNull("properties") != null) {
                    // In that case we iterate all of them to find wich block could complete
                    for (int j = 0; j < _tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayListWithNull("properties")
                            .size(); j++) {
                        for (int k = 0; k < _tsimb.getGraph(p_graphNumber).getSize(); k++) {
                            // If the block name equals with the name in properties and we add it
                            if (_tsimb.getGraph(p_graphNumber).getBlock(k).getName()
                                    .equals(_tsimb.getGraph(p_graphNumber).getBlock(i)
                                            .getMapArrayListWithNull("properties").get(j))) {
                                // When we are adding we take in care if it exits or duplicate values
                                _tsimb.getGraph(p_graphNumber).getBlock(k).addNewAttribute("usedBy", st);
                            }
                        }
                    }
                }

            }
        }
        // We will go through all of our blocks
        for (int i = 0; i < _tsimb.getGraph(p_graphNumber).getSize(); i++) {
            // We get the id of the block
            st = _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id");
            // We check if it is a class
            if (st.contains("class")) {
                // We will go through all of our blocks to get all the inherits
                for (int k = 0; k < _tsimb.getGraph(p_graphNumber).getSize(); k++) {
                    // We check that class has inherits field and if it is equal to the class name
                    // we got
                    if ((_tsimb.getGraph(p_graphNumber).getBlock(i).getMapValueWithNull("inherits") != null)
                            && (_tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("inherits")
                                    .equals(_tsimb.getGraph(p_graphNumber).getBlock(k).getName()))) {
                        // If properties from the class wich inherits arent null
                        if (_tsimb.getGraph(p_graphNumber).getBlock(k).getMapArrayListWithNull("properties") != null) {
                            // We add new attributes to the properties we had
                            _tsimb.getGraph(p_graphNumber).getBlock(i).addNewAttributes("properties",
                                    _tsimb.getGraph(p_graphNumber).getBlock(k).getMapArrayList("properties"));
                        }
                    }

                }
            }
        }

    }

    /**
     * Generates all nodes in dot
     * 
     * @param p_graphNumber number of graph to generate
     */
    public void generateAllNodes(int p_graphNumber) {
        String st = "";
        // We will use it to print only once the node style
        Boolean first = true;
        Boolean isOptional = false;
        // We order the blocks by its name to have all of them together
        _tsimb.getGraph(p_graphNumber).orderBlocks();
        // We will go through all of our blocks
        for (int i = 0; i < _tsimb.getGraph(p_graphNumber).getSize(); i++) {
            // We get the id of the block
            st = _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id");
            // We will check if it is a class, property or relationship
            if (st.contains("class")) {
                // If it is first time we add the default or custom style
                if (first) {
                    _sb.append(_dot.nodeDefaultStyle("class"));
                    first = false;
                }
                // We add the class node
                // We have to check if we have custom values to add them
                if (_parameters.get("node_class") != null) {
                    _sb.append(_dot.drawClassNode(_tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id"),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name"),
                            _parameters.get("node_class")));
                } else {
                    _sb.append(_dot.drawClassNode(_tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id"),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name")));
                }
            } else if (st.contains("property")) {
                // If it is first time we add the default or custom style
                if (!first) {
                    _sb.append(_dot.nodeDefaultStyle("property"));
                    first = true;
                }
                // We have to get if it is an optional property
                isOptional = _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValueWithNull("optional") != null;
                // If it is optional it will be dashed
                // We have to check if we have custom values to add them
                if (_parameters.get("node_property") != null) {
                    _sb.append(_dot.drawPropertyNode(_tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id"),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name"),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("typeOf"), isOptional,
                            _parameters.get("node_property")));
                } else {
                    _sb.append(_dot.drawPropertyNode(_tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id"),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name"),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("typeOf"), isOptional));
                }

            } else if (st.contains("relationship")) {
                if (first) {
                    // If it is first time we add the default style
                    _sb.append(_dot.nodeDefaultStyle("relationship"));
                    first = false;
                }
                // We add the relationship node
                // We have to check if we have custom values to add them
                if (_parameters.get("node_relationship") != null) {
                    _sb.append(_dot.drawRelationShipNode(_tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id"),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name"),
                            _parameters.get("node_relationship")));
                } else {
                    _sb.append(_dot.drawRelationShipNode(_tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id"),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name")));
                }
            }

        }
    }

    /**
     * Generates all dot data for all basic edges with properties
     * 
     * @param p_graphNumber
     */
    public void generateAllBasicEdges(int p_graphNumber) {
        _sb.append("\n\t//edge_property\n");
        String st = "";
        // We add the default style for edges
        _sb.append(_dot.edgeDefaultStyle());
        // We will go through all of our blocks
        for (int i = 0; i < _tsimb.getGraph(p_graphNumber).getSize(); i++) {
            // We get the id of the block
            st = _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id");
            // We check if it is a class or a relationship
            if ((st.contains("class")) || (st.contains("relationship"))) {
                // We check if it has properties
                if (_tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayListWithNull("properties") != null) {
                    // We check if it has custom attributes
                    if (_parameters.get("edge_property") != null) {
                        // We add the all the edges with their custom configuration
                        _sb.append(_dot.drawGeneralEdge(st,
                                _tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayListWithNull("properties"),
                                _parameters.get("edge_property")));
                    } else {
                        // We add the all the edges in default configuration
                        _sb.append(_dot.drawGeneralEdge(st,
                                _tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayListWithNull("properties")));
                    }
                }
            }

        }
    }

    /**
     * Generates all dot data for all typeOf in the properties (indirect and direct
     * relations)
     * 
     * @param p_graphNumber Number of graph we are generating
     */
    public void generateAllTypeOfRelation(int p_graphNumber) {
        _sb.append("\n\t//edge_indirect_use and edge_class\n");
        String st = "";
        // We also need to know the inside type of the TypeOf field
        String insideType;
        // We will go through all of our blocks
        for (int i = 0; i < _tsimb.getGraph(p_graphNumber).getSize(); i++) {
            // We get the id of the block
            st = _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id");
            // We check if it is a property
            if (st.contains("property")) {
                // We get the inside Type wich will be in lower case to avoid typo errors
                insideType = _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("typeOf").toLowerCase();
                // We check if it is a class
                if (insideType.contains("class")) {
                    // We check if it has custom attributes
                    if (_parameters.get("edge_indirect_use") != null) {
                        // Then we add the indirect relation to our edges with custom style
                        _sb.append(_dot.drawIndirectPropertyEdge(st, insideType, _parameters.get("edge_indirect_use")));
                    } else {
                        // Then we add the indirect relation to our edges
                        _sb.append(_dot.drawIndirectPropertyEdge(st, insideType));
                    }
                    // If exists usedBy we add the direct relation
                    if (_tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayListWithNull("usedBy") != null) {
                        // We check for custom style content
                        if (_parameters.get("edge_class") != null) {
                            // Then we add the direct relation to our edges with cardinality and custom
                            // style
                            for (int t = 0; t < _tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayList("usedBy")
                                    .size(); t++) {
                                _sb.append(_dot.drawDirectAssociationEdge(
                                        _tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayList("usedBy").get(t)
                                                .toLowerCase(),
                                        insideType,
                                        _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name") + " (" + _tsimb
                                                .getGraph(p_graphNumber).getBlock(i).getMapValue("multiplicityMin")
                                                + ".."
                                                + _tsimb.getGraph(p_graphNumber).getBlock(i)
                                                        .getMapValue("multiplicityMax")
                                                + ")",
                                        _parameters.get("edge_class")));
                            }
                        } else {
                            for (int t = 0; t < _tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayList("usedBy")
                                    .size(); t++) {
                                // Then we add the direct relation to our edges with cardinality
                                if (_tsimb.getGraph(p_graphNumber).getBlock(i)
                                        .getMapValueWithNull("multiplicityMin") != null||_tsimb.getGraph(p_graphNumber).getBlock(i)
                                        .getMapValueWithNull("multiplicityMax") != null) {
                                    _sb.append(_dot.drawDirectAssociationEdge(
                                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayList("usedBy").get(t)
                                                    .toLowerCase(),
                                            insideType,
                                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name") + " ("
                                                    + _tsimb.getGraph(p_graphNumber).getBlock(i)
                                                            .getMapValue("multiplicityMin")
                                                    + ".." + _tsimb.getGraph(p_graphNumber).getBlock(i)
                                                            .getMapValue("multiplicityMax")
                                                    + ")"));
                                } else {
                                    _sb.append(_dot.drawDirectAssociationEdge(
                                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapArrayList("usedBy").get(t)
                                                    .toLowerCase(),
                                            insideType, _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name")
                                                    ));
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    /**
     * Generates all dot data for all inherits in the classes
     * 
     * @param p_graphNumber Number of graph we are generating
     */
    public void generateAllInherits(int p_graphNumber) {
        _sb.append("\n\t//edge_inheritance\n");
        String st = "";
        // We will go through all of our blocks
        for (int i = 0; i < _tsimb.getGraph(p_graphNumber).getSize(); i++) {
            // We get the id of the block
            st = _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id");
            // We check if it is a class
            if (st.contains("class")) {
                // We check if it has inherits parameter
                if (_tsimb.getGraph(p_graphNumber).getBlock(i).getMapValueWithNull("inherits") != null) {
                    // We check for custom style content
                    if (_parameters.get("edge_inheritance") != null) {
                        // Finally we add it to the file
                        _sb.append(_dot.drawInheritsEdge(
                                _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("inherits"), st,
                                _parameters.get("edge_inheritance")));

                    } else {
                        // Finally we add it to the file
                        _sb.append(_dot.drawInheritsEdge(
                                _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("inherits"), st));
                    }

                }
            }
        }
    }

    /**
     * Generates all dot data for all relationship links
     * 
     * @param p_graphNumber Number of graph we are generating
     */
    public void generateAllRelationshipRelations(int p_graphNumber) {
        _sb.append("\n\t//edge_relationship\n");
        String st = "";
        // We will go through all of our blocks
        for (int i = 0; i < _tsimb.getGraph(p_graphNumber).getSize(); i++) {
            // We get the id of the block
            st = _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("id");
            // We check if it is a relationship
            if (st.contains("relationship")) {
                // In that case we have to get the value from one side and the reverse one
                // We do that with to and from values and reverseName and name
                if (_parameters.get("edge_relationship") != null) {
                    _sb.append(_dot.drawRelationshipEdge(st,
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("to").toLowerCase(),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("reverseName"),
                            _parameters.get("edge_relationship")));
                    _sb.append(_dot.drawRelationshipEdge(
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("from").toLowerCase(), st,
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name"),
                            _parameters.get("edge_relationship")));
                } else {
                    _sb.append(_dot.drawRelationshipEdge(st,
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("to").toLowerCase(),
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("reverseName")));
                    _sb.append(_dot.drawRelationshipEdge(
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("from").toLowerCase(), st,
                            _tsimb.getGraph(p_graphNumber).getBlock(i).getMapValue("name")));
                }
            }
        }
    }

    /**
     * Generates all dot files for all the graphs we got
     * 
     * @param p_graphNumber Number of graph we are generating
     */
    public void generateDotFile(int p_graphNumber) {
        try {
            System.out.println("\t\tGenerating DOT file: " + _dotOutput + "-"
                    + _tsimb.getGraph(p_graphNumber).getName().replace("\"", "") + ".dot");
            // This buffered writer will rewrite all the files with the same name
            // Also we remove all symbols that could cause conflict with file system
            FileWriter fw = new FileWriter(
                    _dotOutput + "-" + _tsimb.getGraph(p_graphNumber).getName().replace("\"", "") + ".dot", false);
            BufferedWriter writer = new BufferedWriter(fw);

            // We write the content
            writer.write(_sb.toString());
            // We close the channel
            writer.close();

            // Also captures all io exceptions
        } catch (IOException e) {
            // We sent to error exit all the errors we got
            e.printStackTrace(System.err);
        }

    }

    /**
     * Generates SVG files for all the dot files created using GraphViz
     * 
     * @param p_graphNumber The number of graph we are converting
     */
    public void generateSVGFile(int p_graphNumber) {
        System.out.println(
                "\t\tGenerating SVG file: " + _svgOutput + "-" + _tsimb.getGraph(p_graphNumber).getName() + ".svg");
        try {
            Process process;
            // We have to distinguish between graph and tree
            if (_tsimb.getGraph(p_graphNumber).getType().equals("@graph")) {
                // NEATO is used for graphs
                process = new ProcessBuilder("neato.exe",
                        _dotOutput + "-" + _tsimb.getGraph(p_graphNumber).getName().replace("\"", "") + ".dot", "-Tsvg",
                        "-o" + _svgOutput + "-" + _tsimb.getGraph(p_graphNumber).getName() + ".svg").start();
            } else {
                // DOT is used for trees
                process = new ProcessBuilder("dot.exe",
                        _dotOutput + "-" + _tsimb.getGraph(p_graphNumber).getName().replace("\"", "") + ".dot", "-Tsvg",
                        "-o" + _svgOutput + "-" + _tsimb.getGraph(p_graphNumber).getName() + ".svg").start();
            }
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
        // --------------------------SETTERS---------------------------
    }

    public void setDotOutput(String p_dotOutput) {
        this._dotOutput = p_dotOutput;
    }

    public void setSvgOutput(String p_svgOutput) {
        this._svgOutput = p_svgOutput;
    }

}