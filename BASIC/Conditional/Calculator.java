import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while(b){
            System.out.println("\n=====BASIC CALCULATOR=====\n");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
            System.out.print("Enter your choice (1-4) : ");
            int choice = sc.nextInt();

            System.out.print("Enter 1st number : ");
            int num1 = sc.nextInt();

            System.out.print("Enter 2nd number : ");
            int num2 = sc.nextInt();

            switch (choice){
                case 1:
                  System.out.println("Addition of "+num1+" and "+num2+" is : "+(num1+num2)); break;
                case 2:
                    System.out.println("Subtraction of "+num1+" and "+num2+" is : "+(num1-num2)); break;
                case 3:
                    System.out.println("Multiplication of "+num1+" and "+num2+" is : "+(num1*num2)); break;
                case 4:
                    System.out.println("Division of "+num1+" and "+num2+" is : "+(num1/num2)); break;
                default:
                    System.out.println("Invalid input\n");
                    b=false;
          }

        }

    }
}