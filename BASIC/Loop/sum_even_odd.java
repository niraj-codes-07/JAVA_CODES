import java.util.*;
public class sum_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int number;
        int even = 0, odd = 0;

        do {
            System.out.print("Enter a number = ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                even += number;
            }else{
                odd += number;
            }

            System.out.print("Do you want to continue Yes(1) No(0) = ");
            choice = sc.nextInt();
            
        } while (choice==1);

        System.out.println("Sum of even numbers are = " + even);
        System.out.println("Sum of odd numbers are = " + odd);
    }
}
