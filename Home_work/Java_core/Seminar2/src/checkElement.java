public class checkElement {
    public static boolean check(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if(array[i] == 0 && array[i-1] == 0){
                return true;
            }
        }
        return false;
    }
}
