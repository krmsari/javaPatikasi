package Java101.BodyMassIndex;
import java.util.Scanner;
public class BMIndex {
    double height,kg,bm;
    Scanner scn = new Scanner(System.in);
    public void getMeasurements(){
        System.out.print("Kisinin boyunu gir: ");
        height = scn.nextInt();
        height = height>3?height/100:height;
        System.out.print("Kisinin kilosunu gir: ");
        kg = scn.nextInt();
    }
    public void bmCal(){
        getMeasurements();
        bm = kg/(height*height);
        System.out.println("Boy(m): " + height + "\nKilo(kg): " + kg + "\nBoy-Kilo Indexi: " + bm);
    }
}
