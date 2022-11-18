package Java101.TekSayiVeOdev;
import java.util.Scanner;
public class MultiplesOfFour {
    Scanner scn = new Scanner(System.in);
    int num,total;
    boolean check=true;
    public void calculator(){
        while (check){
            System.out.print("Sayi gir: ");
            num = scn.nextInt(); 
            if (num % 4 == 0){
                total +=num;
            } else if (num % 2 == 1 || num<0) {
                check=false;
            }
        }
        System.out.println(total);
    }
}
