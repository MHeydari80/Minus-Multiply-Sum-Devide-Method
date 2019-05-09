package mathfunction;

import java.util.Scanner;

public class MathFunction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers :");

        Mathematics(input.nextFloat(), input.nextFloat());

    }

    public static void Mathematics(float number1, float number2) {

        System.out.println("----------Minus-----------");
        System.out.println(String.format("%.3f - %.3f = %.3f", number1, number2, number1 - number2));

        System.out.println("-----------Sum------------");
        System.out.println(String.format("%.3f + %.3f = %.3f", number1, number2, number1 + number2));

        System.out.println("---------Multiply---------");
        System.out.println(String.format("%.3f * %.3f = %.3f", number1, number2, number1 * number2));

        System.out.println("----------Devide----------");
        System.out.println(String.format("%.3f / %.3f = %.3f", number1, number2, number1 / number2));

    }

}
