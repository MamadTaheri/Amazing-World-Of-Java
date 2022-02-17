package main_package;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        long area = (long) width * length;
        System.out.println(area);
        scanner.close();
    }
}
