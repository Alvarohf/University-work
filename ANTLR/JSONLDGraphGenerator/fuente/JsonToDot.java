package fuente;

import java.util.*;

/**
 * 
 * This class convert all the metadata from JSON to dot
 * 
 * @author Alvarohf
 *
 */

public class JsonToDot {
  
    public JsonToDot(){

    }

//-----------------------------------------GENERAL STYLE-----------------------------------------
    
    /**
     * Sets the basic params for the graph and the name
     * @param p_name String wich is the name of the graph
     * @return String that will be part of the dot file
     */
    public String drawBasicSchema(String p_name) {
        StringBuffer sb = new StringBuffer();
        sb.append("graph ").append(p_name).append("{\n\tnode [fontname=\"Arial\"]; \n\tedge [fontname=\"Arial\",fontsize=12]\n");
        return sb.toString();
    }
    //NODE STYLE
    /**
     * Draws a default node depending on the type
     * @param p_type Type of the node we get
     * @return  String with the node style
     */
    public String nodeDefaultStyle(String p_type) {
        StringBuffer sb = new StringBuffer();
        //It could be a class, relationship or property node
        if (p_type.equals("class")) {
            sb.append("\n\t//node_class\n\tnode [shape=ellipse,style=filled,fillcolor=lightseagreen,fontsize=20,fontname=\"Arial\"]\n");
        } else if (p_type.equals("relationship")) {
            sb.append("\n\t//node_relationship\n\tnode [shape=hexagon,style=filled,fillcolor=paleturquoise,fontsize=15,fontname=\"Arial\"]\n");
        } else {
            sb.append("\n\t//node_property\n\tnode [shape=record,style=filled,fillcolor=lightgoldenrodyellow,fontsize=10,fontname=\"Arial\"];\n");
        }
        return sb.toString();
    }
    /**
     * Draws a custom node with the parameters given
     * @return  String with the custom node style
     */
    public String nodeCustomStyle(String p_customFields) {
        StringBuffer sb = new StringBuffer();
        sb.append("\tnode [").append(p_customFields).append("];\n");
        return sb.toString();
    }
    //EDGE STYLE
    /**
     * Draws the style of a general edge
     * @return String with the style that will be added to dot
     */
    public String edgeDefaultStyle() {
        StringBuffer sb = new StringBuffer();
        sb.append("\tedge[style=dashed,len=3,color=grey];\n");
        return sb.toString();
    }
    /**
     * Draws the style of a custom edge
     * return String with the custom style that will be added to dot
     */
    public String edgeCustomStyle(String p_customFields) {
        StringBuffer sb = new StringBuffer();
        sb.append( "\tedge [").append(p_customFields).append("];\n");
        return sb.toString();
    }

    //ARROW STYLE
    /**
     * Draws the style of a default arrow
     * @return String with the style to be added to dot file
     */
    public String arrowDefaultStyle() {
        StringBuffer sb = new StringBuffer();
        sb.append("\tedge[style=dotted,arrowhead=vee,dir=forward,arrowsize=2];\n");
        return sb.toString();
    }
    /**
     * Draws the style of a default arrow
     * @param p_label String with a label for the arrow
     * @return String with the style to be added to dot file
     */
    public String arrowDefaultStyle(String p_label) {
        StringBuffer sb = new StringBuffer();
        sb.append("[style=dotted,arrowhead=vee,dir=forward,arrowsize=2,label=\"").append(p_label).append("\"];\n");
        return sb.toString();
    }

    /**
     * Draws the style of an arrow for a direct relation
     * @return String with the style to be added to dot file
     */
    public String arrowDirectStyle() {
        StringBuffer sb = new StringBuffer();
        sb.append(" [ fontcolor=orangered, color=orangered, style=dashed,arrowhead=vee,dir=forward,arrowsize=2];\n");
        return sb.toString();
    }
    /**
     * Draws the style of an arrow for a direct relation
     * @param p_label Label of the arrow
     * @return String with the style to be added to dot file
     */
    public String arrowDirectStyle(String p_label) {
        StringBuffer sb = new StringBuffer();
        sb.append(" [ fontcolor=orangered, color=orangered, style=dashed,arrowhead=vee,dir=forward,arrowsize=2,label=\"").append(p_label).append("\"];\n");
        return sb.toString();
    }
    /**
     * Draws the style of an arrow for a inherits relation
     * @return String with the style to be added to dot file
     */
    public String arrowInheritsStyle() {
        StringBuffer sb = new StringBuffer();
        sb.append(" [color=black,fontcolor=black,fontsize=15,style=dashed,arrowhead=normal,dir=back,arrowsize=3,label=\"inherits\"];\n");
        return sb.toString();
    }
    /**
     *  Draws the style of an arrow for a inherits relation
     * @param p_label Label of the arrow
     * @return String with the style to be added to dot file
     */
    public String arrowInheritsStyle(String p_label) {
        StringBuffer sb = new StringBuffer();
        sb.append(" [color=black,style=dashed,fontcolor=black,fontsize=15,style=dotted,arrowhead=vee,dir=forward,arrowsize=2,label=\"").append(p_label).append("\"];\n");
        return sb.toString();
    }
    /**
     * Draws the style of an arrow for a relationship relation
     * @return String with the style to be added to dot file
     */
    public String arrowRelationshipStyle() {
        StringBuffer sb = new StringBuffer();
        sb.append(" [color=blue,fontcolor=blue,fontsize=15,style=dashed,arrowhead=normal,dir=forward,len=2,penwidth=3,arrowsize=1,label=\"relation\"];\n");
        return sb.toString();
    }
    /**
     * Draws the style of an arrow for a relationship relation
     * @param p_label Label of the arrow
     * @return String with the style to be added to dot file
     */
    public String arrowRelationshipStyle(String p_label) {
        StringBuffer sb = new StringBuffer();
        sb.append(" [color=blue,fontcolor=blue,fontsize=15,style=dashed,arrowhead=normal,dir=forward,len=2,penwidth=3,arrowsize=1,label=\"").append(p_label).append("\"];\n");
        return sb.toString();
    }
    
//-----------------------------------------NODE STYLE-----------------------------------------
    //GENERAL NODE

    /**
     * Draws a general node
     * @param p_name Name of the node and label
     * @return String with the node to add to dot file
     */
    public String drawNode(String p_name) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_name).append("\"").append("[label=\"").append(p_name).append("\"];\n");
        return sb.toString();
    }
    /**
     * Draws a general node
     * @param p_name Name of the node 
     * @param p_label Label of the node
     * @return String with the node to add to dot file
     */
    public String drawNode(String p_name,String p_label) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_name).append("\"").append("[label=\"").append(p_label).append("\"];\n");
        return sb.toString();
    }
    /**
     * Draws a general node with style
     * @param p_name Name of the node and label
     * @param p_type Type of the node
     * @param p_optional Boolean to see if we have to dash it
     * @return String with the node to add to dot file
     */
    public String drawStyleNode(String p_name, String p_type, boolean p_optional) {
        StringBuffer sb = new StringBuffer();
        if (p_optional) {
            sb.append("\t\"").append(p_name).append("\"").append("[label=\"{").append(p_name).append("|").append(p_type).append("}\",style=\"filled,dashed\"];\n");
        } else {
            sb.append("\t\"").append(p_name).append("\"").append("[label=\"{").append(p_name).append("|").append(p_type).append("}\"];\n");
        }
        return sb.toString();
    }
    /**
     * Draws a general node with style
     * @param p_name Name of the node
     * @param p_label Label of the node
     * @param p_type Type of the node
     * @param p_optional Boolean to see if we have to dash it
     * @return String with the node to add to dot file
     */
    public String drawStyleNode(String p_name,String p_label, String p_type, boolean p_optional) {
        StringBuffer sb = new StringBuffer();
        if (p_optional) {
            sb.append("\t\"").append(p_name).append("\"").append("[label=\"{").append(p_name).append("|").append(p_type).append("}\",style=\"filled,dashed\"];\n");
        } else {
            sb.append("\t\"").append(p_name).append("\"").append("[label=\"{").append(p_label).append("|").append(p_type).append("}\"];\n");
        }
        return sb.toString();
    }

    //CLASS NODE
    /**
     * Draws a class node
     * @param p_name Name of the node and label
     * @return String with the node to add to dot file
     */
    public String drawClassNode(String p_name) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"class_").append(p_name).append("\"").append("[label=\"").append(p_name).append("\"];\n");
        return sb.toString();
    }
    /**
     * Draws a class node
     * @param p_name Name of the node and label
     * @param p_custom Custom values
     * @return String with the node to add to dot file
     */
    public String drawCustomClassNode(String p_name,String p_custom) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"class_").append(p_name).append("\"").append("[label=\"").append(p_name).append("\",").append(p_custom).append("];\n");
        return sb.toString();
    }
    /**
     * Draws a class node
     * @param p_name Name of the node
     * @param p_label Label of the node
     * @return String with the node to add to dot file
     */
    public String drawClassNode(String p_name,String p_label) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_name).append("\"").append("[label=\"").append(p_label).append("\"];\n");
        return sb.toString();
    }
    /**
     * Draws a custom class node
     * @param p_name Name of the node
     * @param p_label Label of the node
     * @param p_custom Custom values
     * @return String with the node to add to dot file
     */
    public String drawClassNode(String p_name,String p_label,String p_custom) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_name).append("\"").append("[label=\"").append(p_label).append("\"," ).append(p_custom).append("];\n");
        return sb.toString();
    }
    //PROPERTY NODE
    /**
     * Draws a property node
     * @param p_name Name of the node and label
     * @param p_type Type of the node
     * @param p_optional Boolean to see if we have to dash it
     * @return String with the node to add to dot file
     */
    public String drawPropertyNode(String p_name, String p_type, boolean p_optional) {
        StringBuffer sb = new StringBuffer();
        if (p_optional) {
            sb.append("\t\"property_").append(p_name).append("\"").append("[label=\"{").append(p_name).append("|").append(p_type).append("}\",style=\"filled,dashed\"];\n");
        } else {
            sb.append("\t\"property_").append(p_name).append("\"").append("[label=\"{").append(p_name).append("|").append(p_type).append("}\"];\n");
        }
        return sb.toString();
    }
        /**
     * Draws a custom property node
     * @param p_name Name of the node and label
     * @param p_type Type of the node
     * @param p_optional Boolean to see if we have to dash it
     * @param p_custom Custom values to add
     * @return String with the node to add to dot file
     */
    public String drawPropertyNode(String p_name, String p_type, boolean p_optional,String p_custom) {
        StringBuffer sb = new StringBuffer();
        if (p_optional) {
            sb.append("\t\"property_").append(p_name).append("\"").append("[label=\"{").append(p_name).append("|").append(p_type).append("}\",style=\"filled,dashed\",").append(p_custom).append("];\n");
        } else {
            sb.append("\t\"property_").append(p_name).append("\"").append("[label=\"{").append(p_name).append("|").append(p_type).append("}\",").append(p_custom).append("];\n");
        }
        return sb.toString();
    }
    /**
     * Draws a property node
     * @param p_name Name of the node
     * @param p_label Label of the node
     * @param p_type Type of the node
     * @param p_optional Boolean to see if we have to dash it
     * @return String with the node to add to dot file
     */
    public String drawPropertyNode(String p_name,String p_label, String p_type, boolean p_optional) {
        StringBuffer sb = new StringBuffer();
        if (p_optional) {
            sb.append("\t\"").append(p_name).append("\"").append("[label=\"{").append( p_label).append("|").append(p_type).append("}\",style=\"filled,dashed\"];\n");
        } else {
            sb.append("\t\"").append(p_name).append("\"").append("[label=\"{").append( p_label).append("|").append(p_type).append("}\"];\n");
        }
        return sb.toString();
    }
    /**
     * Draws a custom property node
     * @param p_name Name of the node
     * @param p_label Label of the node
     * @param p_type Type of the node
     * @param p_optional Boolean to see if we have to dash it
     * @param p_custom Custom values to add
     * @return String with the node to add to dot file
     */
    public String drawPropertyNode(String p_name,String p_label, String p_type, boolean p_optional,String p_custom) {
        StringBuffer sb = new StringBuffer();
        if (p_optional) {
            sb.append("\t\"").append(p_name).append("\"").append("[label=\"{").append( p_label).append("|").append(p_type).append("}\",style=\"filled,dashed\",").append(p_custom).append("];\n");
        } else {
            sb.append("\t\"").append(p_name).append("\"").append("[label=\"{").append( p_label).append("|").append(p_type).append("}\",").append(p_custom).append("];\n");
        }
        return sb.toString();
    }

    //RELATIONSHIP NODE
    /**
     * Draws a relationship node
     * @param p_name Name of the node and label
     * @return String with the node to add to dot file
     */
    public String drawRelationShipNode(String p_name) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_name).append("\"").append("[label=\"").append(p_name).append("\"];\n");
        return sb.toString();
    }
    /**     * @param p_custom Custom values
     * Draws a relationship node
     * @param p_name Name of the node
     * @param p_label Label of the node
     * @return String with the node to add to dot file
     */
    public String drawRelationShipNode(String p_name, String p_label) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_name).append("\"").append("[label=\"").append(p_label).append("\"];\n");
        return sb.toString();
    }
        /**     
     * Draws a custom relationship node
     * @param p_name Name of the node
     * @param p_label Label of the node
     * @param p_custom Custom values
     * @return String with the node to add to dot file
     */
    public String drawRelationShipNode(String p_name, String p_label,String p_custom) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_name).append("\"").append("[label=\"").append(p_label).append("\",").append(p_custom).append("];\n");
        return sb.toString();
    }
//-----------------------------------------EDGE STYLE-----------------------------------------
    
//GENERAL EDGE
    /**
     * Draws a general edge between two elements
     * @param p_className Name of the class
     * @param p_property  Name of the property
     * @return String with the edge to add to dot file
     */
    public String drawGeneralEdge(String p_className, String p_property) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_className).append("\" -- \"").append(p_property).append("\";\n");
        return sb.toString();
    }
    /**
     * Draws general edges between a element and multiple elements
     * @param p_className Name of the class
     * @param p_properties All the properties to link
     * @return String with the edges to add to dot file
     */
    public String drawGeneralEdge(String p_className, ArrayList<String> p_properties) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i<p_properties.size();i++) {
            sb.append("\t\"").append(p_className).append("\" -- \"").append(p_properties.get(i)).append("\";\n");
        }
        return sb.toString();
    }
    /**
     * Draws general edges between a element and multiple elements
     * @param p_className Name of the class
     * @param p_properties All the properties to link
     * @param p_custom All the custom values to add
     * @return String with the edges to add to dot file
     */
    public String drawGeneralEdge(String p_className, ArrayList<String> p_properties, String p_custom) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i<p_properties.size();i++) {
            sb.append("\t\"").append(p_className).append("\" -- \"").append(p_properties.get(i)).append("\" [").append(p_custom.replace("fillcolor", "color")).append("];\n");
        }
        return sb.toString();
    }
    //CLASS EDGE
    /**
     * Draws a class edge between two elements
     * @param p_className Name of the class
     * @param p_property Name of the property
     * @return String with the edge to add to dot file
     */
    public String drawPropertyClassEdge(String p_className, String p_property) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_className).append("\" -- \"").append(p_property).append("\";\n");
        return sb.toString();
    }
    /**
     * Draws class edges between a element and multiple elements
     * @param p_className Name of the class
     * @param p_properties All the properties to link
     * @return String with the edges to add to dot file
     */
    public String drawPropertiesClassEdge(String p_className, ArrayList<String> p_properties) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i<p_properties.size();i++) {
            sb.append("\t\"").append(p_className).append("\" -- \"").append(p_properties.get(i)).append("\";\n");
        }
        return sb.toString();
        }

    //RELATIONSHIP EDGE
    /**
     * Draws a relationship edge between two elements
     * @param p_relationship Name of the relationship
     * @param p_property Name of the property
     * @return String with the edge to add to dot file
     */
    public String drawPropertyRelationshipEdge(String p_relationship, String p_property) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_relationship).append("\" -- \"").append(p_property).append("\";\n");
        return sb.toString();
    }
    /**
     * Draws relationship edges between a element and multiple elements
     * @param p_relationship Name of the relationship
     * @param p_properties All the properties to link
     * @return String with the edge to add to dot file
     */
    public String drawPropertiesRelationshipEdge(String p_relationship, ArrayList<String> p_properties) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i<p_properties.size();i++) {
            sb.append("\t\"").append(p_relationship).append("\" -- \"").append(p_properties.get(i)).append("\";\n");
        }
        return sb.toString();
    }
    //INDIRECT USE EDGE
    /**
     * Draws an edge for an indirect relation
     * @param p_className Name of the class
     * @param p_classNameUsed Name of the class used
     * @return String with the edge to add to dot file
     */
    public String drawIndirectPropertyEdge(String p_className, String p_classNameUsed) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_className).append("\" -- \"").append(p_classNameUsed).append("\"").append(arrowDefaultStyle("TypeOf"));
        return sb.toString();
    }
    /**
     * Draws an edge for an indirect relation
     * @param p_className Name of the class
     * @param p_classNameUsed Name of the class used
     * @return String with the edge to add to dot file
     */
    public String drawIndirectPropertyEdge(String p_className, String p_classNameUsed,String p_custom) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_className).append("\" -- \"").append(p_classNameUsed).append("\" [dir=forward,label=\"TypeOf\",").append(p_custom).append("]\n");
        return sb.toString();
    }
    /**
     * Draws edges for an indirect relations
     * @param p_className Name of the class
     * @param p_classes All the names of the classes used
     * @return String with the edge to add to dot file
     */
    public String drawIndirectPropertiesEdge(String p_className, ArrayList<String> p_classes) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i<p_classes.size();i++) {
            sb.append("\t\"").append(p_className).append("\" -- \"").append(p_classes.get(i)).append("\";\n");
        }
        return sb.toString();
    }
    //DIRECT ASSOCIATION
    /**
     * Draws an edge for a direct relation
     * @param p_className Name of the class
     * @param p_classNameUsed Name of the class used
     * @param p_label Label of the arrow
     * @return String with the edge to add to dot file
     */ 
    public String drawDirectAssociationEdge(String p_className, String p_classNameUsed,String p_label) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_className).append("\" -- \"").append(p_classNameUsed).append("\"").append(arrowDirectStyle(p_label));
        return sb.toString();
    }
        /**
     * Draws an edge for a direct relation
     * @param p_className Name of the class
     * @param p_classNameUsed Name of the class used
     * @param p_label Label of the arrow
     * @param p_custom  Custom values for the edge
     * @return String with the edge to add to dot file
     */ 
    public String drawDirectAssociationEdge(String p_className, String p_classNameUsed,String p_label , String p_custom) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_className).append("\" -- \"").append(p_classNameUsed).append("\" [dir=forward,label=\"").append(p_label).append("\",").append(p_custom).append("]\n");
        return sb.toString();
    }

    //INHERITS
    /**
     * Draws an edge for an inherit relation
     * @param p_className Name of the class
     * @param p_classNameUsed Name of the class used
     * @return String with the edge to add to dot file
     */
    public String drawInheritsEdge(String p_className, String p_classNameUsed) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_className).append("\" -- \"").append(p_classNameUsed).append("\"").append(arrowInheritsStyle());
        return sb.toString();
    }
    /**
     * Draws a custom edge for an inherit relation
     * @param p_className Name of the class
     * @param p_classNameUsed Name of the class used
     * @param p_custom Custom value for the edge
     * @return String with the edge to add to dot file
     */
    public String drawInheritsEdge(String p_className, String p_classNameUsed,String p_custom) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_className).append("\" -- \"").append(p_classNameUsed).append("\" [dir=back,label=\"inherits\",").append(p_custom).append("]\n");
        return sb.toString();
    }
    //RELATIONSHIPS EDGE
    /**
     * Draws an edge for an relationship relation
     * @param p_first First element of the relation
     * @param p_second Second element of the relation
     * @param p_label Label of the arrow
     * @return String with the edge to add to dot file
     */
    public String drawRelationshipEdge(String p_first, String p_second, String p_label) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_first).append("\" -- \"").append(p_second).append("\"").append(arrowRelationshipStyle(p_label));
        return sb.toString();
    }
        /**
     * Draws an edge for an relationship relation
     * @param p_first First element of the relation
     * @param p_second Second element of the relation
     * @param p_label Label of the arrow
     * @param p_custom In case of custom edge
     * @return String with the edge to add to dot file
     */
    public String drawRelationshipEdge(String p_first, String p_second, String p_label,String p_custom) {
        StringBuffer sb = new StringBuffer();
        sb.append("\t\"").append(p_first).append("\" -- \"").append(p_second).append("\" [dir=forward,label=\"").append(p_label).append("\",").append(p_custom).append("]\n");
        return sb.toString();
    }
}