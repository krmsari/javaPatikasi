package Java101.Taximeter;
import java.util.Scanner;
public class Taximeter {
    double defaultPerKm= 2.20,distance,amount,checkAmount;
    int defaultStarting = 10,minAmount = 20;
    public void getDistance(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Gidilecek mesafe: ");
        distance = scn.nextDouble();
    }
    public void meter(){
        getDistance();
        amount =(defaultPerKm*distance)+defaultStarting;
        checkAmount = ((amount > 20)) ? amount : minAmount ;
        String result= (checkAmount == amount)?"Tutar: "+checkAmount + "TL":"Tutar: "+ amount + "TL ama kisa mesafe icin: " + minAmount + "TL";
        System.out.println(result);
    }
}
