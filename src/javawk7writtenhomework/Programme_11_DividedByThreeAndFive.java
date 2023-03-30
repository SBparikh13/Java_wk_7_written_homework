package javawk7writtenhomework;
/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme_11_DividedByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Number divisible by 3 are : ");
        for(int i =1;i<=100;i++){
            dividedByThree(i);
        }
        System.out.println("\n---------------------------------------");
        System.out.println("Number divisible by 5 are :");
        for (int x = 1;x<=100;x++){
            dividedByFive(x);
        }
    }
    public static void dividedByThree(int number){//devided by three method
        if(number % 3==0){
            System.out.println(number + ",");
        }
    }
    public static void dividedByFive(int number){//devided by five method.
        if(number % 5 ==0){
            System.out.println(number + ",");
        }
    }
}
