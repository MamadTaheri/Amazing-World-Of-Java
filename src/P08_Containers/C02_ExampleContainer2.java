package P08_Containers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_ExampleContainer2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input= scanner.next();
            if (input.equalsIgnoreCase("exit"))
                break;
            list.add(input);
        }
        if (list.isEmpty()){
            System.out.println("No string entered");
        } else {
            System.out.println("Size is: " + list.size());
            if (list.contains("mamad"))
                System.out.println("mamad found!");
            for (String s : list) {
                System.out.print(s + " - ");
            }
        }



    }
}
