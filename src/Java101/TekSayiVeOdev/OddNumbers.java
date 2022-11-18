package Java101.TekSayiVeOdev;
import java.util.Scanner;
public class OddNumbers {
    Scanner scn = new Scanner(System.in);
    int num,total=0; 
    boolean check =true;
    public void oddNumsFinder() {
        while(check) {
            System.out.print("Sayi gir: ");
            num = scn.nextInt();
            if (num%2==1){
                total+=num;

            } else if (num<0) { 
                check=false;
            }
        } 
        System.out.println(total);
    }
}
