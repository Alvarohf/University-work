package fuente;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * This class contains a block with a name to identify it
 * 
 * @author Alvarohf
 *
 */

public class Block {
	//Name of the block wich corresponds to id
	private String name;
	//Content of the block wich is wrapped to simplify work with all the type of data
	private HashMap<String, BlockWrap> _content = new HashMap<String, BlockWrap>();

	public Block() {

	}
	/**
	 * Creates a new String value to the wrapper
	 * @param p_name Name of the attribute
	 * @param p_value Value of the atribute
	 */
	public void addValue(String p_name, String p_value) {
		BlockWrap bw = new BlockWrap(p_value);
		_content.put(p_name, bw);
	}
	/**
	 * Creates a new ArrayList<String> values to the wrapper
	 * @param p_name Name of the attribute
	 * @param p_values Values of the atribute
	 */
	public void addValues(String p_name, ArrayList<String> p_values) {
		BlockWrap bw = new BlockWrap(p_values);
		_content.put(p_name, bw);
	}
	/**
	 * Creates a new HashMap<String, String> values to the wrapper
	 * @param p_name Name of the attribute
	 * @param p_specialValues Values of the atribute
	 */
	public void addSpecialValues(String p_name, HashMap<String, String> p_specialValues) {
		BlockWrap bw = new BlockWrap(p_specialValues);
		_content.put(p_name, bw);
	}
	/**
	 * Adds a new value to an ArrayList<String>
	 * @param p_name Name of the attribute
	 * @param p_value Value of the atribute
	 */
	public void addNewAttribute(String p_name, String p_value) {
		//If it doesnt exist we create it an we add it
		if (_content.get(p_name)==null){
			_content.put(p_name,new BlockWrap());
		}
		_content.get(p_name).addAttribute(p_value);
	}
	/**
	 * Adds an ArrayList<String> to an ArrayList<String>
	 * @param p_name Name of the attribute
	 * @param p_values Values of the atributes
	 */
	public void addNewAttributes(String p_name, ArrayList<String> p_values) {
		if (_content.get(p_name) == null) {
			this.addValues("properties", new ArrayList<String>());
		} 
		_content.get(p_name).addAttributes(p_values);

	}

	//GETTERS AND SETTERS

	public HashMap<String, BlockWrap> getSpecial() {
		return _content;
	}

	public BlockWrap getBlockWrap(String p_name) {
		return _content.get(p_name);
	}

	/**
	 * Gets the value of a Map of content
	 * @param p_name Name of the attribute to get
	 * @return String if it exists
	 */
	public String getMapValue(String p_name) {
		return _content.get(p_name).getAttribute();
	}
	/**
	 * Gets the value of a Map of content allowing getting null values
	 * @param p_name Name of the attribute to get
	 * @return String or null value
	 */
	public String getMapValueWithNull(String p_name) {
		String st = null;
		if (_content.get(p_name) != null) {
			st = _content.get(p_name).getAttribute();
		}
		return st;
	}
	/**
	 * Gets the value of a Map wich is an ArrayList<String>
	 * @param p_name Name of the attribute to get
	 * @return  ArrayList<String> if it exists
	 */
	public ArrayList<String> getMapArrayList(String p_name) {
		return _content.get(p_name).getAttributes();
	}
	/**
	 * Gets the value of a Map wich is an ArrayList<String> allowing getting null values
	 * @param p_name Name of the attribute to get
	 * @return ArrayList<String> or null value
	 */
	public ArrayList<String> getMapArrayListWithNull(String p_name) {
		ArrayList<String> st = null;
		if (_content.get(p_name) != null) {
			st = _content.get(p_name).getAttributes();
		}
		return st;
	}

	public String getName() {
		return name;
	}

	public void setTypes(HashMap<String, BlockWrap> p_special) {
		this._content = p_special;
	}

	public void setName(String p_name) {
		this.name = p_name;
	}

	@Override
	public String toString() {
		return "\n\tBlock [" + "blockID: " + name + " - " + "\n\t\t" + _content + "]";
	}

}
