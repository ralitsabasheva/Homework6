package homework;

import java.util.Scanner;

public class evenOddNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        Double num = Double.parseDouble(scanner.next());
        if(num % 2 > 0){
            System.out.println("The number is odd");
        }else{
            System.out.println("The number is even");
        }
    }
}
