package Java101.UsluSayiBul;
import java.util.Scanner;

public class Calculate {
    Scanner scn = new Scanner(System.in);
    int i,num,exp,str=1;
    public void Cal(){
        System.out.print("Sayiyi gir: ");
        num = scn.nextInt();
        System.out.print("Üssü gir: ");
        exp = scn.nextInt();

        for (i = 0;i<exp;i++){
            str*=num;
        }
        System.out.println("Sonuc= " + str);
    }
}
