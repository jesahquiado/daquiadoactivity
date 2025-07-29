
package daquiadoactivity;
 import java.util.Scanner;

public class activity3 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        checkNumber(number1);

       
        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();
        checkNumber(number2);

       
        System.out.print("Enter a number: ");
        int number3 = scanner.nextInt();
        checkNumber(number3);
        
        
        scanner.close();
    }

    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("Inputted number Zero.");
        }
    }
}
