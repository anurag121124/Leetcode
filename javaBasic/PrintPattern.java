package javaBasic;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int n =7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=n-i+1;  j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}


