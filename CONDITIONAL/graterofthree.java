import java.util.*;
public class graterofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number = ");
        int a=sc.nextInt();
        
        System.out.print("Enter 2nd number = ");
        int b=sc.nextInt();
        
        System.out.print("Enter 3rd number = ");
        int c=sc.nextInt();
        
        if(a>b && a>c)
        System.out.println("A is grater");
        else if(b>c && b>a)
        System.out.println("B is grater");
        else
        System.out.println("C is grater");
    }
}
 /*
 ==================PSEUDOCODE===================
 1. Start 
 2. Take three number input from user
 3.  If num1 is grater than num2 AND num1 is grater than num3 
           print num1 is grater
     else if num2 is grater than num3 AND num2 is grater than num1 
           print num2 is grater
     else 
           print num3 is grater 
 4. Exit
 
 */