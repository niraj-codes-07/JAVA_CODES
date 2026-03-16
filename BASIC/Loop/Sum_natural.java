import java.util.*;
class Natural{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number = ");
        int n = sc.nextInt();

        int sum = 0 ,i = 1;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of n natural number is = "+ sum);
    }
}