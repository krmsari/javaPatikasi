package Java101.PriceByTheKdv;

import java.util.Scanner;
public class SalePriceCal {
    Scanner scn = new Scanner(System.in);
    double productPrice;
    double salePrice;
    double kdv;
    public void getProductPrice(){
        System.out.print("Urun maliyetini gir: ");
        productPrice = scn.nextInt();
        kdv = (productPrice>0 && productPrice<1000 )?1.180:1.080;
    }
    public void productPriceCal(){
        getProductPrice();
        salePrice = productPrice*kdv;
        System.out.println("Kdv'siz fiyati: " + productPrice);
        System.out.println("Kdv dahil fiyati: " + salePrice);
        System.out.println("Kdv orani: " + kdv);
    }
}
