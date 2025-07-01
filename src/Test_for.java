public class Test_for {

    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            if (index == 2) {

            }
            if (index == 4) {

            }
            System.out.println("START");
            System.out.println("index before " + index);
            myIntArray[index] = index++;
            System.out.println("index after " + index);
            System.out.println("END");
        }
        for (int index = 0; index < arrayLength; index++) {
            System.out.println(myIntArray[index]);
        }


//        int max = 10;
//
//        int i = 0;
//        for (;i < max;) {
//            System.out.println(i);
//
//        }
//        ++i;
    }
}
