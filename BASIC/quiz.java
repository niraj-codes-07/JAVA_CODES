import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number = ");
        int a = sc.nextInt();

        if (a%2==0){
            System.out.println("Bazinga");
        }else {
            System.out.println("Haringa");
            
        }
    }
}