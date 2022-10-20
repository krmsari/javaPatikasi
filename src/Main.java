import ATM.Teller;
import ArtikYear.ArtikYear;
import Armstrong.NumberOfDigits;
import AsalSayiBulucu.PrimeNum;
import BodyMassIndex.BMIndex;
import Calculator.Calculator;
import ChineseZodiacCalculator.Zodiac;
import EbobEkok.Relation;
import ExponentialCal.Calculate;
import Faktoriyel.FactorialCal;
import FlightTicket.FlightTicketPrice;
import GelismisHesapMakinesi.DevelopedCalculator;
import GirilenSayiyaKadarUsluSayi.PowerWork;
import Greengrocery.GreenFruitShopping;
import HarmonikSayilar.Harmonic;
import Horoscope.HoroscopeFinder;
import HypotenusAndAreaCalculate.HypotenuseFinder;
import MaxMinBulma.NumberOrder;
import MukemmelSayi.PerfectNum;
import NumberComparison.Comparison;
import PalindromSayi.PalindromicNum;
import PatikaNotOrtalamasi.GeneralAverageCal;
import PatikaNotOrtalamasiIki.ProgressStatus;
import PriceByTheKdv.SalePriceCal;
import RecursiveIleFobinacci.FibonacciByRecursive;
import ScannerStudy.UserManager;
import Taximeter.Taximeter;
import TersUcgen.ReverseTriangle;
import ValuesOfCircle.Circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        primeNumber(225,2);
    }

    private static void primeNumber(int num,int i) {
        PrimeNum p = new PrimeNum();
        p.finder(num,i);
    }

    private static int calculateExp(int t, int e) {
        Calculate c = new Calculate();
        return c.cal(t,e);
    }

    private static void developedCalculator() {
        DevelopedCalculator d = new DevelopedCalculator();
        d.calculator();
        //System.out.print(d.fac(5));
    }

    private static void fibonacciByRecursive() {
        FibonacciByRecursive f = new FibonacciByRecursive();
        f.fibonacci(45);
    }

    private static void palindrom() {
        PalindromicNum f = new PalindromicNum();
        f.palindromic();
    }

    private static void reverseTriangle() {
        ReverseTriangle r = new ReverseTriangle();
        r.maker();
    }

    private static void perfectNum() {
        PerfectNum p = new PerfectNum();
        p.finder();
        p.finder();
    }

    private static void numberOrder() {
        NumberOrder n = new NumberOrder();
        n.arrange();
    }

    private static void relation() {
        Relation relation = new Relation();
        relation.cal();
    }

    private static void teller() {
        Teller t = new Teller();
        t.machine();
    }

    private static void harmonic() {
        Harmonic h = new Harmonic();
        h.cal();
    }

    private static void numberOfDigits() {
        NumberOfDigits n = new NumberOfDigits();
        n.digits();
    }

    private static void factorialCal() {
        FactorialCal factorialCal = new FactorialCal();
        factorialCal.cal();
    }

    private static void powerWork() {
        PowerWork evenNumberFinder = new PowerWork();
        evenNumberFinder.powerCal();
    }

    private static void artikYear() {
        ArtikYear artikYear = new ArtikYear();
        artikYear.artik();
    }

    private static void zodiac() {
        Zodiac zodiac = new Zodiac();
        zodiac.zodiacCal();
    }

    private static void flightTicketPrice() {
        FlightTicketPrice flightTicketPrice = new FlightTicketPrice();
        flightTicketPrice.ticketPrice();
    }

    private static void horoscope() {
        HoroscopeFinder horoscope = new HoroscopeFinder();
        horoscope.finder();
    }

    private static void comparison() {
        Comparison comparison = new Comparison();
        comparison.numberComparison();
    }

    private static void progressStatus() {
        ProgressStatus progressStatus = new ProgressStatus();
        progressStatus.averageCal();
    }
    private static void userManager() {
        UserManager userManager = new UserManager();
        userManager.userLogin();
    }
    private static void calculator() {
        Calculator calculator = new Calculator();
        calculator.calculator();
    }
    private static void greenFruitShopping() {
        GreenFruitShopping greenFruitShopping = new GreenFruitShopping();
        greenFruitShopping.shopping();
    }
    private static void bmIndex() {
        BMIndex bmIndex = new BMIndex();
        bmIndex.bmCal();
    }
    private static void circle() {
        Circle circle = new Circle();
        circle.allMethod();
    }
    private static void taximeter() {
        Taximeter taximeter = new Taximeter();
        taximeter.meter();
    }
    private static void hypotenuseFinder() {
        HypotenuseFinder hypotenuseFinder = new HypotenuseFinder();
        hypotenuseFinder.finder();
    }
    private static void salePriceCal() {
        Scanner scn = new Scanner(System.in);
        SalePriceCal salePriceCal = new SalePriceCal();
        salePriceCal.productPriceCal();
        salePriceCal.productPriceCal();
    }
    private static void generalAverageCal() {
        GeneralAverageCal generalAverageCal = new GeneralAverageCal();
        generalAverageCal.averageCal();
    }
}
