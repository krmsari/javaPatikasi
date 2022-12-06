package Java101.ArrMaxMin;

import java.util.Arrays;
import java.util.Scanner;
public class MaxMin {
    Scanner sc = new Scanner(System.in);
    public void cal(){
        int[] numbers = {15,12,788,1,-1,-778,3,2,0};
        Arrays.sort(numbers);
        // diziyi kucukten buyuge sirala
        int small = 0;
        int big = numbers[numbers.length-1];
        System.out.print("Aranacak sayiyi gir: ");
        int entered = sc.nextInt();
        for (int num : numbers){
            // tum diziyi gez
            if (num > small && num < entered) {
                //dizinin o anki degeri small degerinden buyukse ve dizinin o anki degeri girilen sayidan kucukse,
                small = num;
                //small degerini o anki dizinin degerine esitle
            }
            if (num < big && num > entered) {
                //dizinin o anki degeri big degerinden kucukse ve dizinin o anki degeri girilen sayidan buyukse,
                big = num;
                //big degerini o anki dizinin degerine esitle
            }
        }
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: " + small);
        System.out.println("Girilen Sayıdan Büyük En Yakın Sayı: " + big);
    }
}
