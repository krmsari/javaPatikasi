package Java101.HarmonikSayilar;
import java.util.Scanner;

public class Harmonic {
    Scanner scn = new Scanner(System.in);
    double i,num,total;
    public void cal(){
        System.out.print("Sayi gir: ");
        num=scn.nextInt();
        for (i=0;i<num;i++){
            total+=(1/(i+1));
        }
        System.out.println("Harmonik sonuç= " +total);
    }
}
