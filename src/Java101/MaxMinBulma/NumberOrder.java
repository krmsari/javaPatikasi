package Java101.MaxMinBulma;
import java.util.Scanner;

public class NumberOrder {

    Scanner sc =new Scanner(System.in);
    int limit,num,max=0,min=0;
    public void arrange(){
        System.out.print("Kaç sayi girilecek: ");
        limit =sc.nextInt();
        while (limit>0){
            System.out.print("Sayi gir: ");
            num=sc.nextInt();
            max=(max>num)?max:num;
            min=(min>num)?num:min;
            limit--;
        }
        System.out.println("Min= "+min);
        System.out.println("Max= "+max);
    }
}
