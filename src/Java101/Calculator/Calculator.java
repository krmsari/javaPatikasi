package Java101.Calculator;
import java.util.Scanner;
public class Calculator {
    double num1,num2;
    int select;
    Scanner sn = new Scanner(System.in);
    public void calculator(){
        System.out.print("Sayilari gir: ");
        num1 = sn.nextDouble();
        num2 = sn.nextDouble();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Sec: ");
        select = sn.nextInt();
        switch (select){
            case 1:
                System.out.println("Sonuc: " + (num1+num2));
                break;
            case 2:
                System.out.println("Sonuc: " + (num1-num2));
                break;
            case 3:
                System.out.println("Sonuc: " + (num1*num2));
                break;
            case 4:
                System.out.println((num2 != 0)?"Sonuc " + (num1/num2):"Bolen 0 olamaz");
                break;
            default:
                System.out.println("Yanlis secim yaptiniz");
                break;
        }
    }
}
