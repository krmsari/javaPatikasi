package Java101.HypotenusAndAreaCalculate;
import java.util.Scanner;
public class HypotenuseFinder {
    Scanner scn = new Scanner(System.in);
    public void makerTriangle(){
        for (byte i=0;i<5;i++){
            for (byte t=0;t<4-i;t++){
                System.out.print(" ");
            }
            for (byte n=0;n<=i;n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void finder(){
        double hypotenusSquare=0;
        double halfOfPerimeter=0, hypotenus,area;
        double[] edges= new double[2];
        for (byte n = 0;n<2;n++){
            System.out.print("Ucgenin "+ (n+1) +". dik kenarını gir: ");
            edges[n] = scn.nextDouble();
        }
        makerTriangle();

        for (byte n = 0;n<2;n++){
            hypotenusSquare+= edges[n]*edges[n];
        }
        hypotenus=Math.sqrt(hypotenusSquare);
        for (byte n = 0;n<2;n++){
            halfOfPerimeter+=edges[n];
        }
        halfOfPerimeter=(halfOfPerimeter+hypotenus)/2;
        area = Math.sqrt(halfOfPerimeter*(halfOfPerimeter-edges[0])*(halfOfPerimeter-edges[1])*(halfOfPerimeter-hypotenus));
        System.out.print("Hipotenus= " + hypotenus + "\nUcgen alani= " + area);
    }
}
