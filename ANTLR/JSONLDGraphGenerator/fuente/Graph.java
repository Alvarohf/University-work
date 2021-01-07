package fuente;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * This class contains a JSON graph wich is formed for blocks and attributes
 * 
 * @author Alvarohf
 *
 */

public class Graph {

    //Attributes of the graph
    private String _type;
    private String _name;
    //Components of the graph
    private ArrayList<Block> _graphContent = new ArrayList<Block>();


    public Graph() {

    }
    /**
     * Constructor of a graph
     * @param p_type Type of the graph
     * @param p_graphContent Blocks of the graph
     */
    public Graph(String p_type, ArrayList<Block> p_graphContent) {
        this._graphContent = p_graphContent;
        this._type = p_type;
    }

    /**
     * Creates new blocks in the graph
     * @param p_numBlocks Number of blocks to create
     */
    public void createBlocks(int p_numBlocks) {
        while (_graphContent.size() < p_numBlocks) {
            _graphContent.add(new Block());
        }
    }
    /**
     * Create a single block in the graph
     */
    public void createNewBlock() {
        createBlocks(_graphContent.size() + 1);
    }
    /**
     * Order the blocks by name of blocks
     */
    public void orderBlocks(){
        Collections.sort(_graphContent, (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }
    //SETTERS AND GETTERS
    public void setType(String p_type) {
        this._type = p_type;
    }

    public void setName(String p_name) {
        this._name = p_name;
    }

    public void setGraphContent(ArrayList<Block> p_graphContent) {
        this._graphContent = p_graphContent;
    }

    public String getType() {
        return _type;
    }

    public String getName() {
        return _name;
    }
    /**
     * Gets the block by index
     * @param p_numBlock Index of the block to retrieve
     * @return Block retrieved
     */
    public Block getBlock(int p_numBlock) {
        return _graphContent.get(p_numBlock);

    }
    /**
     * Gets the last block
     * @return Block that we get
     */
    public Block getBlock(){
        return getBlock(_graphContent.size()-1);
    }
    /**
     * Gets all the blocks we have
     * @return All the blocks of the graph
     */
    public ArrayList<Block> getGraphContent() {
        return _graphContent;
    }
    /**
     * Gets the size of the graph content
     * @return number of blocks
     */
    public int getSize(){
        return _graphContent.size();
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        return sb.append(_name).append(" - type: ").append(_type).append(" blocks: ").append(_graphContent.toString()).append("\n").toString();
    }
}