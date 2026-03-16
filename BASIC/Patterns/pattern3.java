/* ( _ ) no. of spaces
   ___*
   __**
   _***
   ****

 */
import java.util.Scanner;
class pattern3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {  //loop

            for (int k = 1; k <= n-i; k++) {    //space
                System.out.printf(" ");
            }

            for (int j = 1; j <= i; j++) {  //stars
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}