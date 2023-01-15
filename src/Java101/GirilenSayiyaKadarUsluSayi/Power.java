package Java101.GirilenSayiyaKadarUsluSayi;
import java.util.Scanner;
public class Power {
    int maxNum,num=1;
    Scanner scn = new Scanner(System.in);
    public void powerCal(){
        System.out.print("Sayi gir: ");
        maxNum=scn.nextInt();
        while(num<maxNum){
            System.out.print(num + ", ");
            num*=2; 
        }
    }
}
