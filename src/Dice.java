import java.util.ArrayList;
import java.util.Random;
public class Dice {
    private ArrayList<Integer> values;
    public static Random roller = new Random();

    public Dice(int min, int max) {
        values = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            values.add(i);
        }
    }

    public Dice(ArrayList<Integer> customValues) {
        values = new ArrayList<>(customValues);
    }

    public int getRollValue() {
        if (!values.isEmpty()) {
            int randomIndex = roller.nextInt(values.size());
            return
                    values.get(randomIndex);
        } else {
            return 0;
        }
    }
}
