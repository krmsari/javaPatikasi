package Java101.GirilenSayiyaKadarCiftBul;
import java.util.Scanner;
public class EvenNumberFinder {
    int maxNum,i;
    Scanner scn= new Scanner(System.in);
    public void finder(){
        System.out.print("Sayi gir: ");
        maxNum = scn.nextInt();
        for (i=1;i<=maxNum;i++){
            if(i%2==0){
                System.out.print(i + ", ");
            }
        }
    }
}
