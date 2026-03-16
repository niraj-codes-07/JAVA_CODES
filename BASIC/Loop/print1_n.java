import java.util.*;
public class print1_n{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter any n umber = ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}