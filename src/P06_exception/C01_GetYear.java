package P06_exception;

import java.util.Scanner;

public class C01_GetYear {
    public static int getYear(String day) throws Exception{
        if(day == null || day.length() == 0)
            throw new Exception("Bad Parameter");
        String yearString = day.substring(0, 4);
        return Integer.parseInt(yearString);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a data; ");
        String date = s.next();
        try {
            Integer year = getYear(date);
            System.out.println(year);
        } catch (Exception e){
            System.out.println("Error -> ");
            e.printStackTrace();
        }

    }
}
