package javawk7writtenhomework;

import java.util.Scanner;

public class Programme_6_OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();
        Programme_6_OddEven oddEven =new Programme_6_OddEven();
        System.out.println(number + " is"+ oddEven.isItEvenOrOddNumber(number));
        scanner.close();//closing scanner

    }
    public String isItEvenOrOddNumber(int number){//checking the odd or even
        if(number % 2 ==0){
            return "Even";

        }else{
            return "Odd";
        }
    }
}
