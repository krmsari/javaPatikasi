package Java101.MukemmelSayi;
import java.util.Scanner;

public class PerfectNum {
    Scanner sc = new Scanner(System.in);
    int num,total=0,i;
    public void finder(){
        System.out.print("Sayi gir: ");
        num = sc.nextInt();
        for (i=1;i<num;i++){
            if (num%i==0){
                total+=i;
            }
        }
        String result = (num==total)? num + " mukemmel sayidir.": num + " mukemmel sayi degildir.";
        System.out.println(result);
    }
}
