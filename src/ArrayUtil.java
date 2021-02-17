import sun.tools.tree.ShiftRightExpression;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        ArrayList<String> res = new ArrayList<>();
        // TODO fill in code here
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    res.add(array1[i]);
                    array2[j] = "comm";
                }
            }
        }
        String[] final_result = res.toArray(new String[0]);
        return final_result;
    }
}