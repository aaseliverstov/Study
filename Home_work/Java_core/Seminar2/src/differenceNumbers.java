import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class differenceNumbers {
    public static int difference(int[] array) {
        Integer[] arrayI = new Integer[array.length];
        Arrays.setAll(arrayI, i -> array[i]);

        List<Integer> ints = Arrays.asList(arrayI);
        int difference = Collections.max(ints) - Collections.min(ints);

        return difference;
    }
}
