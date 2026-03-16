import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number = ");
        int num = sc.nextInt();
        
        int lastdigit =  0;
        int rev =0;
        
        while (num > 0) {
            lastdigit = num % 10;
            rev = rev * 10 + lastdigit;
            num /= 10;
        }
        System.out.print(rev);
    }
}
