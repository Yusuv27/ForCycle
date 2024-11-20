package org.springframework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i < value + 1; i++){
            for (int second_i = 1; second_i < value + 1; second_i ++){

                if (i * second_i == value){
                System.out.println(i + " * " + second_i);
                }
            }
        }
    }
}