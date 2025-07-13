package lab_00;

import java.util.Scanner;

public class SoChanLe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần kiểm tra: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0){
            System.out.println(inputNumber + " Số của bạn là số chẵn");
        } else {
            System.out.println(inputNumber + " Số của bạn là số lẻ");
        }
    }
}
