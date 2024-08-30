import java.util.Scanner;

public class leap {

    public static boolean leap_year (int year){
            if(year % 4 == 0) {
                return true;
            } else if(year % 100 == 0) {
                return false;
            }else if(year % 400 == 0) {
                return true;
            }
            else {
                return false;
            }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year you want to check that its a leap year or not:- ");
        int n = sc.nextInt();
        
        //There are two ways in which we can executes the furthere code after defining our function.
        
        /**1'st Way.
        boolean result = leap_year(n);

        if (result == true) {
            System.out.println(n + " is a leap year");
        } else {
            System.out.println(n + " is not a leap year");
        }**/


        //2nd way.
        if (leap_year(n) == true) {
            System.out.println(n + " is a leap year");
        }
        else{
            System.out.println(n + " is not a leap year");
        }

        sc.close();
    }
}

