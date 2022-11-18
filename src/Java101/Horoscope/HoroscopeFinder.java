package Java101.Horoscope;
import java.util.Scanner;
public class HoroscopeFinder {
    String[] horoscope = new String[]{"Kova","Balık","Koç","Boğa","İkizler","Yengeç","Aslan","Başak","Terazi","Akrep","Yay","Oğlak"};
    //                                  0       1      2     3       4         5        6       7        8      9      10     11
    String[] months = new String[]{"ocak","şubat","mart","nisan","mayıs","haziran","temmuz","ağustos","eylül","ekim","kasım","aralık"};
    //                                0       1      2     3        4        5        6         7        8       9     10      11
    int day,counter=0;
    String month, result;
    boolean checkMonth,checker;
    Scanner scn = new Scanner(System.in);
    public void finder(){
        System.out.print("Doğum ayını seç: ");
        month = scn.nextLine().toLowerCase();
        checker=checkerMonth(months,month);
        while (!checker){
            System.out.print("Doğum ayını seçmeyi tekrar dene: ");
            month = scn.nextLine().toLowerCase();
            checker=checkerMonth(months,month);
        }
        System.out.print("Doğum gününü seç: ");
        day = scn.nextInt();
        while (day<=0 || day>=32){
            System.out.print("Doğum gününü seçmeyi tekrar dene: ");
            day = scn.nextInt();
        }
        for (String item : months) {
            if ((day>=22 && day<32 && month.equals("ocak")) || (day>0 && day<=19 && month.equals("şubat"))) {
                result = horoscope[0];
            }else if ((day>=20 && day<32 && month.equals("şubat")) || (day>0 && day<=20 && month.equals("mart"))){
                result = horoscope[1];
            }else if ((day>=21 && day<32 && month.equals("mart")) || (day>0 && day<=20 && month.equals("nisan"))){
                result = horoscope[2];
            } else if ((day>=21 && day<32 && month.equals("nisan")) || (day>0 && day<=21 && month.equals("mayıs"))) {
                result = horoscope[3];
            }else if ((day>=22 && day<32 && month.equals("mayıs")) || (day>0 && day<=22 && month.equals("haziran"))) {
                result = horoscope[4];
            }else if ((day>=23 && day<32 && month.equals("haziran")) || (day>0 && day<=22 && month.equals("temmuz"))) {
                result = horoscope[5];
            }else if ((day>=23 && day<32 && month.equals("temmuz")) || (day>0 && day<=22 && month.equals("ağustos"))) {
                result = horoscope[6];
            }else if ((day>=23 && day<32 && month.equals("ağustos")) || (day>0 && day<=22 && month.equals("eylül"))) {
                result = horoscope[7];
            }else if ((day>=23 && day<32 && month.equals("eylül")) || (day>0 && day<=22 && month.equals("ekim"))) {
                result = horoscope[8];
            }else if ((day>=23 && day<32 && month.equals("ekim")) || (day>0 && day<=21 && month.equals("kasım"))) {
                result = horoscope[9];
            }else if ((day>=22 && day<32 && month.equals("kasım")) || (day>0 && day<=21 && month.equals("aralık"))) {
                result = horoscope[10];
            }else if ((day>=22 && day<32 && month.equals("aralık")) || (day>0 && day<=21 && month.equals("ocak"))) {
                result = horoscope[11];
            }
        }
        System.out.println(result);
    }

    public boolean checkerMonth(String[] array, String value){
        checkMonth = false;
        for (String item : array) {
            if (item.equals(value)){
                checkMonth = true;
            }
        }
        return checkMonth;
    }
    public int indexFinder(String[] array, String value){
        for (String item : array) {
            if (item.equals(value)){
                break;
            }
            counter++;
        }
        System.out.println(counter);
            return (counter);
    }

}
