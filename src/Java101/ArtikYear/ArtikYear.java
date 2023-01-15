package Java101.ArtikYear;
import java.util.Scanner;
public class ArtikYear {
    Scanner scn = new Scanner(System.in);
    int year;
    public void artik(){
        System.out.print("Yil gir: ");
        year = scn.nextInt();
        if (year%4==0 || year%400==0){
            System.out.println(year + " yıl bir artik yildir.");
        }else{
            System.out.println(year + " yıl bir artik yil değildir.");
        }

    }
}
