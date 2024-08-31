import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        // for(int j = 1; ; j++)
        while(true){

            System.out.print("Enter the number :-");
            int n = sc.nextInt();

            int originalNumber = n;
            int digit = String.valueOf(originalNumber).length();
            int sum = 0 ;
    

        for(int i = 1 ; i <= digit ; i++) {
            int rem = n % 10 ;
            int pow = (int) Math.pow(rem , digit);
            n = n / 10 ;
            sum = sum + pow ; 
            
        }

        System.out.println("The sum as per the armstrong number concept is " + sum);

        if(sum == originalNumber) {
            System.out.println("It is an Armstrong Number");

        }else {
            System.out.println("It is not an Armstrong Number");
        }

        System.out.println("Type y if you want to contniue and q to exit the program");
        char ch = sc.next().charAt(0);

        if (ch == 'q') {
                break;

        }else if (ch == 'y') {
            continue;

        }else {
            System.out.println("Invalid Input");
        }

        // System.out.println("You have Used our Program " + j + "times");

    }
    sc.close();
}
}