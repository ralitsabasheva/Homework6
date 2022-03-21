package homework;

import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number :");
        Double numb = Double.parseDouble(scanner.next());
        double squareNumb = Math.sqrt(numb);
        System.out.printf("%.5f",squareNumb);
    }
}
