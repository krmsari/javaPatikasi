package Java101.GelismisHesapMakinesi;

import java.util.Scanner;

public class DevelopedCalculator {
    Scanner sc = new Scanner(System.in);
    double result;
    int howMany,num;
    String symbol;
    public double plus(double arg){
        result =0;
        result += arg;

        return result;
    }
    public double minus(double arg){
        result =0;
        result -= arg;

        return result;
    }
    public double multiply(double arg){
        result =1;
        result *= arg;

        return result;
    }
    public double divison(double arg){
        result =1;
        result /= arg;
        return result;
    }
    public double exponential(double arg,int exponen){
        result =1;
        if (exponen>0){
            return result = arg*exponential(arg,exponen-1);

        }else {
            return 1;
        }
    }
    public double fac(double arg){
        result =1;
        if (arg>0){
            return result = arg*fac(arg-1);

        }else {
            return 1;
        }
    }
    public void rectangle(double edgeO,double edgeT){
        System.out.println("Dortgen cevresi: " + 2*(edgeO+edgeT));
        System.out.println("Dortgen alani: " + (edgeO*edgeT));
        System.out.println("");
    }
    public double mod(double arg,double mod){
        result =1;
        return result=arg%mod;
    }
    public void calculator(){
        double result=0,output,ineffect;
        int aid=0;
        do{
            System.out.print("Islem sec: ");
            symbol= sc.next().toLowerCase();
            switch (symbol) {
                case "+" -> {
                    System.out.print("Sayi gir: ");
                    num = sc.nextInt();
                    output=plus(num);
                    result+=output;
                }
                case "-" -> {
                    System.out.print("Sayi gir: ");
                    num = sc.nextInt();
                    output=minus(num);
                    result+=output;
                }
                case "*" -> {
                    result=result==0?1:result;
                    System.out.print("Sayi gir: ");
                    num = sc.nextInt();
                    output=multiply(num);
                    result*=output;
                }
                case "/" -> {
                    result=result==0?1:result;
                    System.out.print("Sayi gir: ");
                    num = sc.nextInt();
                    num=num==0?1:num;
                    output=divison(num);
                    result*=output;
                }
                case "^" -> {
                    System.out.print("Taban gir: ");
                    num = sc.nextInt();
                    System.out.print("Us gir: ");
                    aid = sc.nextInt();
                    output=exponential(num,aid);
                    result+=output;
                }
                case "!" -> {
                    System.out.print("Sayi gir: ");
                    num = sc.nextInt();
                    output=fac(num);
                    result+=output;
                }
                case "%" -> {
                    System.out.print("Sayi gir: ");
                    num = sc.nextInt();
                    System.out.print("mod gir: ");
                    aid = sc.nextInt();
                    output=mod(num,aid);
                    result+=output;
                }
                case "#" -> {
                    System.out.print("Bir kenari gir: ");
                    num = sc.nextInt();
                    System.out.print("Diger kenari gir: ");
                    aid = sc.nextInt();
                    rectangle(num,aid);
                }
                default -> {
                    System.err.println("BB");
                }
            }
            System.out.println("Sonuc: " + result);
        }while (!symbol.equals("cikis"));

    }

}
