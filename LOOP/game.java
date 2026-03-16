import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; ; i++) {
            System.out.print("Enter your number = ");
            int n = sc.nextInt();

            if (n%10==0) {
                break;
            }
        }
        System.out.println("GAME OVER");
    }
}
