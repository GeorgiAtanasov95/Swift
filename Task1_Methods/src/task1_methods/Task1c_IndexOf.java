package task1_methods;

public class Task1c_IndexOf {

    int[] arr;
    int number;

    public int IndexOf(int[] arr, int number) {
        this.arr = arr;
        this.number = number;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

}
