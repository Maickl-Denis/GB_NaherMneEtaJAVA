package GB_NaherMneEtaJAVA.les01;
//Вывести все простые числа от 1 до 1000
public class DZ02 {
    public static void main(String[] args){
        int m,n;
        A:for (n = 2;  n<= 1000; n++) {
            for (m = 2;  m<= n/2; m++) {
                if (n%m==0) {
                    continue A;
                }
            }
            System.out.println(n);
        }
    }
}
