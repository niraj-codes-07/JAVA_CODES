// Average of Numbers: Write a Java method that takes three integers as input and returns their average as a double.

package FUNCTION.METHODS;
import java.util.*;
public class average {

    public static void Average(int a ,int b, int c){
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        a = sc.nextInt();

        System.out.print("Enter 2nd number = ");
        b = sc.nextInt();

        System.out.print("Enter 3rd number = ");
        c = sc.nextInt();

        double avg = (a + b + c) / 3;
        System.out.println(avg);
    }


    public static void main(String[] args) {
        
        Average(0, 0, 0);
        System.out.println("1 method has called");

         Average(0, 0, 0);

    }
}
