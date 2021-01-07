package fuente;

import java.util.*;
/**
 * 
 * This class control all CSV data
 * @author Alvarohf
 *
 */

public class TSimbCSV {
	
	//Array of all the rows
	private ArrayList <HashMap<String,String>> _rows = new ArrayList<HashMap<String,String>>();
	//Array of columns names
	private ArrayList<String> _columns = new ArrayList<String>();
	/**
	 * This method add a new column to the CSV's list in read order 
	 * @param p_columnName name of column to add
	 */
	public void addColumn(String p_columnName) {
		_columns.add(p_columnName);
	}
	/**
	 * This method return the index of column name if it exists
	 * @param p_columnNAME name of column to find
	 * @return Int with the index of column
	 */
	public int getIndex(String p_columnNAME) {
		return _columns.indexOf(p_columnNAME);
	}
	/**
	 * This method obtains the name of the column in our index if it exists
	 * @param p_columnIndex index of the data to retrieve
	 * @return the data retrieved
	 */
	public String getColumnName(int p_columnIndex) {
		return _columns.get(p_columnIndex);
	}
	/**
	 * This methods allow the class to create multiple new rows
	 * @param p_newRows number of rows to create
	 */
	private void createMultipleRows(int p_newRows) {
		while (this.rowsSize()<p_newRows)
		{
			_rows.add(new HashMap<String,String>());
		}
	}
	/**
	 * This method creates one new row
	 */
	public void createRow() {
		this.createMultipleRows((this.rowsSize()+1));
	}
	/**
	 * This method add a new value to one of our rows
	 * @param p_row It will be the number of our row where we will insert the data
	 * @param p_columnName The key we will give to our new value
	 * @param p_value The new value we have added
	 */
	public void addValue(int p_row, String p_columnName, String p_value) {
		//We create the data structures before
		this.createMultipleRows(p_row);
		//We substract 1 to fix index size problem and then we add the value
		_rows.get(p_row-1).put(p_columnName, p_value);
	}
	/**
	 * This method add a new value to one of our rows
	 * @param p_row It will be the number of our row where we will insert the data
	 * @param p_columnIndex The index of the column key we will give to our new value
	 * @param p_value The new value we have added
	 */
	public void addValue(int p_row, int p_columnIndex, String p_value) {
		//We reuse our data adder 
		this.addValue(p_row,this.getColumnName(p_columnIndex),p_value);
	}
	/**
	 * This method allows you to add a new value in the last row with the column name and value
	 * @param p_columnName The column name of the row where we will add the value
	 * @param p_value The new value to add
	 */
	public void addValue (String p_columnName, String p_value) {
		this.addValue(this.rowsSize(), p_columnName, p_value);
	}
	/**
	 * This method allows you to add a new value in the last row with the column index and value
	 * @param p_column The column index of the row where we will add the value
	 * @param p_value The new value to add
	 */
	public void addValue (int p_column, String p_value) {
		this.addValue(this.rowsSize(), p_column, p_value);
	}
	/**
	 * This method allows you to add a new value in the last row and last column
	 * @param p_value The new value to add
	 */
	public void addValue (String p_value) {
		this.addValue(this.rowsSize(), _rows.get(this.rowsSize()-1).size(), p_value);
	}
	
	/**
	 * This method allows you to retrieve the values in a row with column name and row number
	 * @param p_row The row that we need to read
	 * @param p_columnName	The column name of the value we will retrieve
	 * @return
	 */
	public String getValue(int p_row, String p_columnName) {
		return _rows.get(p_row-1).get(p_columnName);
	}
	/**
	 * This method allows you to retrieve the values in a row with column number and row number
	 * @param p_row The row that we need to read
	 * @param p_column	The number of column of the value we will retrieve
	 * @return
	 */
	public String getValue(int p_row, int p_column) {
		return getValue(p_row,this.getColumnName(p_column));
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n Tabla de simbolos CSV \n");
		sb.append("Numero de columnas: " + this.columnSize()+"\tNumero de filas: " + this.rowsSize()+"\n");
		sb.append("Columnas disponibles: \n"+ _columns.toString()+"\n");
		sb.append("Filas disponibles: \n"+ _rows.toString()+"\n");
		return sb.toString();
	}
	/**
	 * This method return the size of our rows data structure
	 * @return the size
	 */
	public int rowsSize() {
		return _rows.size();
	}
	/**
	 * This method return the size of our columns data structure
	 * @return the size
	 */
	public int columnSize() {
		return _columns.size();
	}
}
