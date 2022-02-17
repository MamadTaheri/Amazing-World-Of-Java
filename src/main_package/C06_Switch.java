package main_package;

import java.util.Scanner;

public class C06_Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int i = s.nextInt();
        switch (i){
            case 5:
                System.out.println("Yes");
                break;
            case 2:
                System.out.println("NO");
            default:
                System.out.println("Error");
        }

    }
}
