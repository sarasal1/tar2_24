import java.util.ArrayList;

public class SharedData {
    private ArrayList<Integer> array;
    private ArrayList<Boolean> winArray;
    private boolean flag;
    private final int b;

    public SharedData(ArrayList<Integer> array, int b) {
        this.array = new ArrayList<>(array);
        this.b = b;
    }

    public ArrayList<Boolean> getWinArray() {
        return winArray;
    }

    public void setWinArray(ArrayList<Boolean> winArray) {
        this.winArray = new ArrayList<>(winArray);
    }

    public ArrayList<Integer> getArray() {
        return new ArrayList<>(array);
    }

    public int getB() {
        return b;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
