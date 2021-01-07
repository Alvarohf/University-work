package fuente;

import java.util.ArrayList;
import java.util.HashMap;

public class BlockWrap{

    //A value of a block could be a single attribute, a group of attributes or a group of special attributes
    //We dont initialize them to save memory
    private String _attribute;
    private ArrayList<String> _attributes;
    private HashMap<String,String> _specialAttributes;

    public BlockWrap(){
    }
    //We use constructors to create the data we want
    /**
     * Constructor to create a single attribute
     * @param p_attribute value of the attribute
     */
    public BlockWrap(String p_attribute){
        this._attribute=p_attribute;
    }
    /**
     * Constructor to create a group of attributes
     * @param p_attributes Group of attributes
     */
    public BlockWrap(ArrayList<String> p_attributes){
        //We initialize here the data structure
        createAttributes();
        this._attributes=p_attributes;
    }
    /**
     * Constructor to create a group of special attributes
     * @param p_specialAttributes Group of special attributes
     */
    public BlockWrap(HashMap<String,String> p_specialAttributes){
        //We initialize here the data structure
        createSpecialAttributes();
        this._specialAttributes=p_specialAttributes;
    }
    /**
     * Procces that initializes an ArrayList<String>
     */
    public void createAttributes(){
        _attributes = new ArrayList<String>();
    }
    /**
     * Procces that initializes an HashMap<String,String>
     */
    public void createSpecialAttributes(){
        _specialAttributes = new HashMap<String,String>();
    }
    /**
     * Adds an attribute to the attributes
     * @param p_attribute Value of the new attribute
     */
    public void addAttribute(String p_attribute){
        //If it is null we initialize it
        if (_attributes==null){
            _attributes = new ArrayList<>();
        }
        if (!_attributes.contains(p_attribute)){
        _attributes.add(p_attribute);}
    }
    /**
     * Adds attributes to the attributes
     * @param p_attributes Group of new attributes 
     */
    public void addAttributes(ArrayList<String> p_attributes){
        //If it is null we initialize it
        if (_attributes==null){
            _attributes = new ArrayList<>();
        }
        //We remove common elements to avoid repetition
        _attributes.removeAll(p_attributes);
        //We merge them
        _attributes.addAll(p_attributes);
    }
    /**
     * Adds a special attribute to special attributes
     * @param p_id Key of the attribute
     * @param p_specialAttribute Value of the attribute
     */
    public void addSpecialAttribute(String p_id, String p_specialAttribute){
        //If it is null we initialize it
        if (_specialAttributes==null){
            _specialAttributes = new HashMap<>();
        }
        _specialAttributes.put(p_id, p_specialAttribute);
    }

    //GETTERS AND SETTERS
    public void setAttribute(String p_attribute){
        this._attribute=p_attribute;
    }

    public String getAttribute (){
        return _attribute;
    }
    public ArrayList<String> getAttributes(){
        return _attributes;
    }
    public HashMap<String,String> getSpecialAttributes(){
        return _specialAttributes;
    }

    @Override
    public String toString(){
         String result = "";
        //We choose the element to pass to String to avoid null values
        if (_attributes!=null){
            result=_attributes.toString();
        }
        else if (_specialAttributes!=null){
            result=_specialAttributes.toString();
        }
        else {
            result=_attribute;
        }
        return result+"\n\t\t";
    }
}