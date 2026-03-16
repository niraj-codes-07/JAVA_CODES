//Even Number Check: Create a method named isEven that accepts an integer argument and returns true if the number is even, or false otherwise.

package FUNCTION.METHODS;
import java.util.*;
public class Even {
    public static String isEven(int n){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number = ");
         n = sc.nextInt();

        return (n%2==0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        while (true) { 
            System.out.println(isEven(0));
            
        }    

    }
}
