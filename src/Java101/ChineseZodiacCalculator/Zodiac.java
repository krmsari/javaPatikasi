package Java101.ChineseZodiacCalculator;
import java.util.Scanner;
public class Zodiac {
    Scanner scn = new Scanner(System.in);
    int year,remainder;
    String[] horoscope = new String[]{"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejder","Yılan","At","Koyun"};
    public void zodiacCal(){
        System.out.print("Dogum yilini gir: ");
        year = scn.nextInt();
        remainder = year%12;
        System.out.println(horoscope[remainder]);
    }
}
