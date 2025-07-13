package lab_02;

import java.util.Scanner;

public class Cal_BMI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your weight (kg): ");
        float inputWeight = scanner.nextFloat();

        System.out.print("Input your high (m): ");
        float inputHigh = scanner.nextFloat();

        float BMI = inputWeight / (inputHigh*2);

        if(BMI < 18.5){
            float increaseWeight = (18.5f - BMI) * (inputHigh*2);
            System.out.println("You are Underweight, you should increase weight " + increaseWeight + " kg");

        }else if (BMI <= 24.9){
            System.out.println(BMI + " You are Normal weight, great!!!");

        }else{
            if (BMI <= 29.9){
                System.out.println(BMI + " You are Overweight");

            }else{
                System.out.println(BMI + " You are Obesity");
            }
            float decreaseWeight = (BMI - 24.9f) * (inputHigh*2);
            System.out.println("You should decrease " + decreaseWeight + " kg");
        }

    }
}
