package javawk7writtenhomework;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
import java.util.Scanner;

public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int y = scanner.nextInt();
        System.out.println("Please select calculation symbol : +,*,-,/ ");
        char symbol = scanner.next().charAt(0);
        do0perationBySelectingSymbol(x,y,symbol);
        scanner.close();

    }
    //calculating operation based on symbol
    public static void do0perationBySelectingSymbol(int x,int y,char symbol){
        if(symbol=='+'){
            System.out.println(x + " + "+ y +" = "+ (x+y));
        }else if(symbol =='-'){
            System.out.println(x + " - " + y + " = "+(x-y));
        }else if(symbol == '*'){
            System.out.println(x + " * " + y + " = "+ (x*y));
        }else if(symbol == '/'){
            System.out.println(x + " / "+ y + " = "+ (x/y));
        }else{
            System.out.println("Please enter correct symbol +,-,*,/");
        }
    }

}
