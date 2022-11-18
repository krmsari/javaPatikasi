package Java101.Faktoriyel;
import java.util.Scanner;
public class FactorialCal {
    Scanner scn = new Scanner(System.in);
    int n,r;
    double result;
    public double factorial(int factNum){
        int str=1;
        for (int i = 1 ; i<=factNum;i++){
            str*=i;
            /*System.out.println(str);*/
        }
        return str;
    }
    public void cal(){
        System.out.print("C(n,r) = n! / (r! * (n-r)!)\n n sayisini gir: ");
        n = scn.nextInt();
        System.out.print(" r sayisini gir: ");
        r = scn.nextInt();
        result = (factorial(n)/(factorial(r)*factorial(n-r)));
        System.out.println("Kombinasyon= " + result);
    }
}
