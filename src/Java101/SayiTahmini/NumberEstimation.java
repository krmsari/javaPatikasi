package Java101.SayiTahmini;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberEstimation {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    int estimate,right=0,number;
    boolean isWin=false;
    int[] pastEstimates;

    public void estimateFac(){
        pastEstimates = new int[5];
        number = random.nextInt(100);
        System.out.println(number + " " + estimate);
        while(right<5 && isWin == false){
            System.out.print("Sayiyi tahmin et: ");
            estimate = sc.nextInt();
            pastEstimates[right] = estimate;
            System.out.print((estimate>=0 && estimate<=100)?"":"Sıfır ila yüz arasinda sayi giriniz.");
            if (estimate == number){
                isWin=true;
            }else{
                right++;
                System.out.println("Tahmininiz tutmadi.");
            }
        }
        String result = isWin==true?" - Oyunu kazandınız, rastgele sayi: " + estimate:"\n - 5 hakkınızda bitti.";
        System.out.println(result + "\n - Gecmis tahminleriniz: "+ Arrays.toString(pastEstimates));
    }

}
