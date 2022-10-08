package Taximeter;
import java.util.Scanner;
public class Taximeter {
    double defaultPerKm= 2.20,distance,amount,checkAmount;
    int defaultStarting = 10,minAmount = 20;
    public void meter(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Gidilecek mesafe: ");
        distance = scn.nextDouble();

        amount =(defaultPerKm*distance)+defaultStarting;
        checkAmount = ((amount > 20)) ? amount : minAmount ;
        String result= (checkAmount == amount)?"Tutar: "+checkAmount + "TL":"Tutar: "+ amount + "TL ama kisa mesafe icin: " + minAmount + "TL";
        System.out.println(result);
    }
}
