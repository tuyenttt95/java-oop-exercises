package lab_03;

public class Lab_MinMaxValue {

    public static void main(String[] args) {

        int[] intArr = {2, 4, 5, 1, 3};
        int min = intArr[0], max = intArr[0];

        for (int index = 1; index < intArr.length; index++) {
            if (min > intArr[index]) {
                min = intArr[index];
            }
            if (max < intArr[index]) {
                max = intArr[index];
            }
        }
        System.out.println("Min value in arr is " + min);
        System.out.println("Max value in arr is " + max);
    }
}
