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
import MMA.Fighter;
import MMA.Ring;
import MaxMinBulma.NumberOrder;
import MukemmelSayi.PerfectNum;
import NumberComparison.Comparison;
import OgrenciNotSistemi.Course;
import OgrenciNotSistemi.Student;
import OgrenciNotSistemi.Teacher;
import PalindromSayi.PalindromicNum;
import PatikaNotOrtalamasi.GeneralAverageCal;
import PatikaNotOrtalamasiIki.ProgressStatus;
import PriceByTheKdv.SalePriceCal;
import RecursiveIleFobinacci.FibonacciByRecursive;
import RecursiveIleSayiEklemeCikarma.NumberThings;
import ScannerStudy.UserManager;
import Taximeter.Taximeter;
import TersUcgen.ReverseTriangle;
import ValuesOfCircle.Circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mma();

    }

    private static void mma() {
        int powerOfMarc = (int) (Math.random() * 15);
        int powerOfAlex = (int) (Math.random() * 10);

        Fighter marc = new Fighter("Marc" , powerOfMarc , 100, 100, 0);
        Fighter alex = new Fighter("Alex" , powerOfAlex , 95, 90, 10);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }

    private static void studentsInformation() {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("İlhami", "90550000000", "MAT");
        Teacher t2 = new Teacher("Metin", "90550000001", "FZK");
        Teacher t3 = new Teacher("Elif", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Kerem", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(100,80,66);
        s1.addBulkPerformanceNote(100,70,70);
        s1.isPass();

        Student s2 = new Student("Mahmut", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkPerformanceNote(100,70,55);
        s2.isPass();

        Student s3 = new Student("Ayca", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkPerformanceNote(55,50,50);
        s3.isPass();
    }

    private static void primeNumber(int num) {
        PrimeNum p = new PrimeNum();
        p.finder(num,2);
    }
    private static void calculateExp(int t, int e) {
        Calculate c = new Calculate();
        System.out.print(t+"^"+e+ "="+c.cal(t,e));

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
