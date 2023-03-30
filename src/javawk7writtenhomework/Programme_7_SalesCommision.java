package javawk7writtenhomework;

import java.util.Scanner;

public class Programme_7_SalesCommision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller name :");
        String name = scanner.nextLine();
        System.out.println("Enter seller ID : ");
        int sellerId = scanner.nextInt();
        System.out.println("Enter sales amount : ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic salary : ");
        int basicSalary = scanner.nextInt();
        Programme_7_SalesCommision salesCommision =new Programme_7_SalesCommision();
        int grossSalary = basicSalary + salesCommision.calculateCommission(salesAmount);
        System.out.println("Seller name is           :   " + name);
        System.out.println("Seller Id is             :   "+sellerId);
        System.out.println("Seller's sales amount is :   "+salesAmount);
        System.out.println("Seller's basic salary is :   "+basicSalary);
        System.out.println("Seller's gross salary is :   "+grossSalary);
        scanner.close();

    }
    public int calculateCommission(int salesAmount){
        int commission;
        if(salesAmount>=50000){
            commission = (salesAmount * 35)/100;
            System.out.println("Sales commission is "+commission);

        }else if(salesAmount >= 30000){
            commission = (salesAmount * 20 )/100;
            System.out.println("Sales commission is "+ commission);
        }else if(salesAmount >= 20000){
            commission = (salesAmount * 10)/100;
            System.out.println("Sales commision is " + commission);
        }else if (salesAmount>=10000){
            commission = (salesAmount * 5)/100;
            System.out.println("Sales commision is " + commission);

        }else{
            commission = (salesAmount * 2)/100;
            System.out.println("Sales commission is " + commission);
        }
        return commission;
    }
}
