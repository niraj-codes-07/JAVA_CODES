import java.util.Scanner;
public class Hello_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter no. of times = ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println((i+1)+" Hello,Niraj");
        }
    }
}