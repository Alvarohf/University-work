package fuente;

import java.util.ArrayList;

/**
 * 
 * This class is a symbol table for JSON. It employs more classes
 * 
 * @author Alvarohf
 *
 */

public class TSimbJSON {
	//It is composed for an array of Graphs objects
	private ArrayList<Graph> _graphs = new ArrayList<Graph>();
	/**
	 * Creates new graphs in the table
	 * @param p_numGraphs number of new graphs to create
	 */
	public void createGraphs(int p_numGraphs) {
		while (_graphs.size() < p_numGraphs) {
			_graphs.add(new Graph());
		}
	}
	/**
	 * Creates new graph in the table
	 */
	public void createNewGraph() {
		createGraphs(_graphs.size() + 1);
	}
	/**
	 * Gets the graph of the index selected
	 * @param p_numGraph Index of the graph to get
	 * @return Graph object
	 */
	public Graph getGraph(int p_numGraph) {
		return _graphs.get(p_numGraph);
	}
	/**
	 * Gets the last graph
	 * @return Graph object
	 */
	public Graph getGraph() {
		return _graphs.get(_graphs.size() - 1);
	}
	/**
	 * Gets the size of the table, the number of graphs
	 * @return the number of graphs of the table
	 */
	public int getSize() {
		return _graphs.size();
	}

	@Override
	public String toString() {
		return _graphs.toString();
	}

}
