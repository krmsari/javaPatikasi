package Java101.GirilenSayiyaKadarUsluSayi;
import java.util.Scanner;
public class PowerWork {
    int maxNum,numFour=1,numFive=1;
    Scanner scn = new Scanner(System.in);
    public void powerCal(){
        System.out.print("Sayi gir: ");
        maxNum=scn.nextInt();
        while(numFour<maxNum || numFive<maxNum){
            System.out.print(numFour + ", ");
            numFour*=4;
            System.out.print(numFive + ", ");
            numFive*=5;
        }
    }
}
