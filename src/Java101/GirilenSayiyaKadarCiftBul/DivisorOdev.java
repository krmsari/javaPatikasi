package Java101.GirilenSayiyaKadarCiftBul;
import java.util.Scanner;
public class DivisorOdev {
    int maxNum,i,counter=0;
    double ort;
    Scanner scn= new Scanner(System.in);
    public void finder(){
        System.out.print("Sayi gir: ");
        maxNum = scn.nextInt();
        for (i=2;i<=maxNum;i++){
            if(i%3 == 0 && i%4 == 0){
                ort+=i;
                counter++;
                System.out.print(i + ", ");
            }
        }
        System.out.println("Ortalama= " + (ort/counter));
    }
}
