package lab_03;

import java.util.Arrays;

public class Lab_SortArray {

    public static void main(String[] args) {

        int[] intArr = {12, 34, 1, 16, 28};
        Arrays.sort(intArr);

        for (int value : intArr) {
            System.out.print(value + ",");
        }
    }
}
