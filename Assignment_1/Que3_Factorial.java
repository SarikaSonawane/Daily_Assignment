import java.util.Scanner;

public class Que3_Factorial {

    public static void main(String[] args) {
        int fact=1;
        System.out.println("Enter a Number : ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.close();

        for (int i = 1; i <=num; i++) {
            fact=fact*i;
        }

        System.out.println("Factorial of "+num+" is "+fact);
    }
}