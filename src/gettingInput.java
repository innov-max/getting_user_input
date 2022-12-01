import java.util.Scanner;

public class gettingInput {

    public static void main(String[] args) {

        System.out.println("Enter 3 integers");
        Scanner integer =new Scanner(System.in);//importing java input functionality
        //integer input
        int x = Integer.parseInt(integer.nextLine());
        int y = Integer.parseInt(integer.nextLine());
        int z = Integer.parseInt(integer.nextLine());
        //arithmetic

        float sum,product,average;

        sum = x+y+z;
        product = x*y*z;
        average = sum/3;

        //output
        System.out.println("sum " + sum);
        System.out.println("product " + product);
        System.out.println("average " + average);
    }
}