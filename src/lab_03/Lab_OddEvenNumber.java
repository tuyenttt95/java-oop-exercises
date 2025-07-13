package lab_03;

public class Lab_OddEvenNumber {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};
        int evenNumber = 0, oddNumber = 0;

        for (int index = 0; index < intArr.length; index++) {
            if (intArr[index] % 2 == 0) {
                evenNumber++;

            } else {
                oddNumber++;
            }
        }
        System.out.println("Counting even numbers is " + evenNumber);
        System.out.println("Counting odd numbers is " + oddNumber);
    }
}
