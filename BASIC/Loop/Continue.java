import java.util.*;
import java.util.Scanner;
public class Continue {
     void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        for (int i = 1; ; i++) {
            System.out.print("Enter your number = ");
            int n = sc.nextInt();

            if (n%10==0) {
                continue;
            }else{
                System.out.println(n);
            }
        }
    }
}
