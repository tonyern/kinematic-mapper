import java.util.Iterator;
import java.util.TreeMap;

/**
 * PointND will represent a single value with subfields.
 * For example having leftWrist as the value and x, y ,z as the subfields.
 *
 * @author Tony Nguyen
 * @version 2.0
 */
public class PointND implements Iterable<String> {
    /**
     * Map that takes in string field and describe it to the corresponding general value.
     * Remember that TreeMap orders by key.
     */
    private final TreeMap<String, GeneralValue> values;

    /**
     * Default constructor for PointND that sets the field to empty.
     */
    public PointND() {
        values = new TreeMap<String, GeneralValue>();
    }

    /**
     * Add the field name and value.
     *
     * @param subFieldName is the field name.
     * @param value        is the corresponding General value.
     */
    public void add(String subFieldName, GeneralValue value) {
        values.put(subFieldName, value);
    }

    /**
     * Input the string and it will return the corresponding value stored in the map.
     *
     * @param subFieldName this is like x, y, and z of the left_wrist.
     * @return values.get(key) or null
     */
    public GeneralValue getValue(String subFieldName) {
        // Checking if subFieldName is in the map. If not then return null.
        if (values.containsKey(subFieldName)) {
            return values.get(subFieldName);
        } else {
            return new GeneralValue();
        }
    }

    /**
     * Get the current size of the TreeMap.
     *
     * @return size of TreeMap.
     */
    public int size() {
        return values.size();
    }

    /**
     * Gets the string iterator over all field names.
     * It overrides the method defined in Iterator interface.
     *
     * @return loopThrough
     */
    @Override
    public Iterator<String> iterator() {
        return this.values.keySet().iterator();
    }

    /**
     * Return a string in the format - SUBFIELDNAME = VALUE ;
     *
     * @return subFieldName and value appended together.
     */
    public String toString() {
        String out = "";

        for (String subFieldName : this) {
            out += subFieldName + " = " + values.get(subFieldName) + "; ";
        }

        return out;
    }
}