import java.util.ArrayList;

/**
 * Represents shared data with an array, a constant value, and other attributes.
 */
public class SharedData {
    private ArrayList<Integer> array;
    private ArrayList<Boolean> winArray;
    private boolean flag;
    private final int b;

    /**
     * Constructs a SharedData object with the given array and constant value.
     *
     * @param array An ArrayList of integers representing the initial data.
     * @param b     An integer representing a constant value.
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = new ArrayList<>(array);
        this.b = b;
    }

    /**
     * Retrieves the winArray attribute.
     *
     * @return An ArrayList of booleans (winArray).
     */
    public ArrayList<Boolean> getWinArray() {
        return winArray;
    }

    /**
     * Sets the winArray attribute with a new array provided as a parameter.
     *
     * @param winArray An ArrayList of booleans to set as the new winArray attribute.
     */
    public void setWinArray(ArrayList<Boolean> winArray) {
        this.winArray = new ArrayList<>(winArray);
    }

    /**
     * Retrieves a copy of the array attribute to prevent external modifications.
     *
     * @return A copy of the array attribute.
     */
    public ArrayList<Integer> getArray() {
        return new ArrayList<>(array);
    }

    /**
     * Retrieves the constant value b.
     *
     * @return An integer representing the constant value b.
     */
    public int getB() {
        return b;
    }

    /**
     * Retrieves the current value of the flag attribute.
     *
     * @return A boolean value representing the flag attribute.
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag attribute with a new boolean value provided as a parameter.
     *
     * @param flag A boolean value to set as the new value for the flag attribute.
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    /**
     * Example of a new method:
     * Prints a message to the console indicating that the SharedData object is being processed.
     */
    public void processSharedData() {
        System.out.println("Processing SharedData object...");
        // Add your processing logic here
    }
}
