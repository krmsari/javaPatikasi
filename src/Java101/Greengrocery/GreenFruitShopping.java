package Java101.Greengrocery;
import java.util.Scanner;
public class GreenFruitShopping {
    Scanner scn = new Scanner(System.in);
    String[] gf = new String[]{"Armut","Elma","Domates","Muz","Patlican"};
    double[] price = new double[]{2.14,3.67,1.11,0.95,5.00};
    int[] howMany = new int[5];
    double amount=0;
    public void shopping(){
        for (byte i=0;i<5;i++){
            System.out.print("\n" + gf[i] + " - " + price[i] + "TL kac kilo: ");
            howMany[i] = scn.nextInt();
            amount+= price[i]*howMany[i];
        }
        System.out.print("Tutar: " + amount + "TL");
    }
}
