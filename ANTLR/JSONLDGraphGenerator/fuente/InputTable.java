package fuente;

import java.util.ArrayList;
import java.util.HashMap;

public class InputTable {

    private ArrayList<String> _jsonFiles = new ArrayList<>();
    private ArrayList<String> _csvFiles = new ArrayList<>();
    private ArrayList<String> _dotFiles = new ArrayList<>();
    private ArrayList<String> _svgFiles = new ArrayList<>();
    private HashMap<String, String> _custom = new HashMap<String, String>();

    public InputTable() {

    }

    public HashMap<String, String> getCustom() {
        return _custom;
    }

    public void addCustom(String p_key, String p_value) {
        if (_custom.containsKey(p_key)) {
            _custom.put(p_key, _custom.get(p_key) +" , " +p_value);
        } else {
            _custom.put(p_key, p_value);
        }
    }

    public void addJson(String p_json) {
        _jsonFiles.add(p_json);
    }

    public void addCsv(String p_csv) {
        _csvFiles.add(p_csv);
    }

    public void addDot(String p_dot) {
        _dotFiles.add(p_dot);
    }

    public void addSvg(String p_svg) {
        _svgFiles.add(p_svg);
    }
    public String getJson(int pos) {
        return _jsonFiles.get(pos);
    }

    public String getLastJson() {
        return _jsonFiles.get(_jsonFiles.size() - 1);
    }

    public String getCsv(int pos) {
        return _csvFiles.get(pos);
    }

    public String getLastCsv() {
        return _csvFiles.get(_csvFiles.size() - 1);
    }

    public String getDot(int pos) {
        return _dotFiles.get(pos);
    }

    public String getLastDot() {
        return _dotFiles.get(_dotFiles.size() - 1);
    }

    public String getSvg(int pos) {
        return _svgFiles.get(pos);
    }

    public String getTypes(int pos) {
        return _svgFiles.get(pos);
    }

    public String getLastSvg() {
        return _svgFiles.get(_svgFiles.size() - 1);
    }

    public int getSizeJson() {
        return _jsonFiles.size();
    }

    public int getSizeCsv() {
        return _csvFiles.size();
    }

    public boolean jsonIsEmpty() {
        return _jsonFiles.isEmpty();
    }

    public boolean dotIsEmpty() {
        return _dotFiles.isEmpty();
    }

    public boolean svgIsEmpty() {
        return _svgFiles.isEmpty();
    }

    public boolean csvIsEmpty() {
        return _csvFiles.isEmpty();
    }

    public boolean customIsEmpty() {
        return _custom.isEmpty();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("csv content: ").append(_csvFiles.toString()).append("\n");
        sb.append("dot content: ").append(_dotFiles.toString()).append("\n");
        sb.append("svg content: ").append(_svgFiles.toString()).append("\n");
        sb.append("json content: ").append(_jsonFiles.toString()).append("\n");
        sb.append("types content: ").append(_custom.toString()).append("\n");
        return sb.toString();
    }
}