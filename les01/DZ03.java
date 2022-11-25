package GB_NaherMneEtaJAVA.les01;

import java.util.Scanner;

//Реализовать простой калькулятор
public class DZ03 {
    public static void main(String[] args){
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Ошибка! Не верный оператор");
                return;
        }
        System.out.print("\nРезультат выражения:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
