//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package GB_NaherMneEtaJAVA.les01;

import java.util.Scanner;

public class DZ01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scan.nextInt();
        int summ = 1;
        for (int i = 1; i < n + 1; i++){
           summ = summ * i;
        }
        System.out.println(summ);
    }
}
