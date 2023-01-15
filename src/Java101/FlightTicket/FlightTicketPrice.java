package Java101.FlightTicket;
import java.util.Scanner;
public class FlightTicketPrice {
    int age;
    double price,distance,ageDiscount=1,typeDiscount,result;
    byte tripType;
    Scanner scn = new Scanner(System.in);
    public void ticketPrice(){
        System.out.print("Mesafeyi gir:");
        distance = scn.nextDouble();
        System.out.print("Yasini gir:");
        age = scn.nextInt();
        System.out.print("Yolculuk tipini sec\n - 1 => Tek Yön \n - 2 => Gidiş Dönüş :");
        tripType = scn.nextByte();
        result = priceCalculator(distance,age,tripType);
        System.out.println("Tutar: " + result);
    }
    public double priceCalculator(double d,int a,byte c){
        price = d*0.1;
        price = ageDiscountCal(price,a);
        typeDiscount = (c==2)?1.6:1;
        price = price*typeDiscount;
        return price;
    }
    public double ageDiscountCal(double price,int age){
        if (age>65){
            ageDiscount = 0.7;
        } else if (age<12) {
            ageDiscount = 0.5;
        } else if (age>=12 && age<=24) {
            ageDiscount = 0.9;
        }
        result = price*ageDiscount;
        return result;
    }
}
