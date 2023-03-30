package javawk7writtenhomework;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
import java.util.Scanner;

public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Please enter the number :");
        int number= scanner.nextInt();
        isItOddEvenNumber(number);
        scanner.close();//closing scanner

    }
    public static void isItOddEvenNumber(int number){
        String evenOrOdd =(number%2==0)?"Even":"odd";//ternary operator used
        System.out.println("The "+number +" is "+evenOrOdd+" number");
    }
}
