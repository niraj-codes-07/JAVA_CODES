/*
Write a Java program to get a number from the user and print whether it is positive or negative 
*/
import java.util.*;

import javax.sound.midi.Soundbank;
public class positive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number = ");
    int num = sc.nextInt();

    if (num >=0) {
        System.out.println(num + " is positive");
    }else{
        System.out.println(num + " is negative");
    }
  }  
}
