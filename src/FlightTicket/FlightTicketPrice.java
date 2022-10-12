package FlightTicket;

import java.util.Scanner;

public class FlightTicketPrice {
    int age;
    double price,distance,discount,ageDiscount=1,typeDiscount,result;
    byte tripType;
    Scanner scn = new Scanner(System.in);
   /*
    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
    */
    public void ticketPrice(){
        System.out.print("Mesafeyi gir:");
        distance = scn.nextDouble();
        System.out.print("Yasini gir:");
        age = scn.nextInt();
        System.out.print("Yolculuk tipini sec\n - 1 => Tek Yön \n - 2 => Gidiş Dönüş :");
        tripType = scn.nextByte();
        result = priceCalculator(price,distance,age,tripType);
        System.out.println("Tutar: " + result);
    }
    public double priceCalculator(double p,double d,int a,byte c){
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
