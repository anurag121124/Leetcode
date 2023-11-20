package Funcation;

import java.util.Scanner;

public class FuncationPractice {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in); 

       int num1 = Sc.nextInt();
       int num2 = Sc.nextInt();
       int sum = CalculateSum(num1, num2);
       System.out.println("sum of 2 number: "+sum);        


    }

    public static int CalculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }


    public static void SwapFuncation(){

        int a = 10;
        int b = 15;

        int temp = a; //10
        a=b; //15
        b = temp; //10
    }
}
