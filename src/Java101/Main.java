package Java101;

import Java101.ATM.Teller;
import Java101.ArrMaxMin.MaxMin;
import Java101.ArtikYear.ArtikYear;
import Java101.Armstrong.NumberOfDigits;
import Java101.AsalSayiBulucu.PrimeNum;
import Java101.BitirmeProjesi.MineSweeper;
import Java101.BodyMassIndex.BMIndex;
import Java101.Calculator.Calculator;
import Java101.ChineseZodiacCalculator.Zodiac;
import Java101.Desen_Cizimi.DrawingPattern;
import Java101.DizeyiSiralama.Sorting;
import Java101.DiziFrekansi.Frequency;
import Java101.EbobEkok.Relation;
import Java101.ExponentialCal.Calculate;
import Java101.Faktoriyel.FactorialCal;
import Java101.FlightTicket.FlightTicketPrice;
import Java101.GelismisHesapMakinesi.DevelopedCalculator;
import Java101.GirilenSayiyaKadarUsluSayi.PowerWork;
import Java101.Greengrocery.GreenFruitShopping;
import Java101.HarmonicAverage.Average;
import Java101.HarmonikSayilar.Harmonic;
import Java101.Horoscope.HoroscopeFinder;
import Java101.HypotenusAndAreaCalculate.HypotenuseFinder;
import Java101.MMA.Fighter;
import Java101.MMA.Ring;
import Java101.MaxMinBulma.NumberOrder;
import Java101.MukemmelSayi.PerfectNum;
import Java101.NumberComparison.Comparison;
import Java101.OgrenciNotSistemi.Course;
import Java101.OgrenciNotSistemi.Student;
import Java101.OgrenciNotSistemi.Teacher;
import Java101.PalindromSayi.PalindromicNum;
import Java101.PalindromikKelime.PalindromicWord;
import Java101.PatikaNotOrtalamasi.GeneralAverageCal;
import Java101.PatikaNotOrtalamasIlki.ProgressStatus;
import Java101.PriceByTheKdv.SalePriceCal;
import Java101.RecursiveIleFobinacci.FibonacciByRecursive;
import Java101.SalaryCal.Employee;
import Java101.SayiTahmini.NumberEstimation;
import Java101.ScannerStudy.UserManager;
import Java101.Taximeter.Taximeter;
import Java101.TekrarEdenCiftSayiBul.FindRepeaters;
import Java101.TersUcgen.ReverseTriangle;
import Java101.Transpoz.Transpose;
import Java101.ValuesOfCircle.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MineSweeper mineSweeper = new MineSweeper(5,4);
        mineSweeper.game();

    }

    private static void palindromicWord() {
        String str = "abba";
        PalindromicWord palindromicNum = new PalindromicWord(str);
        palindromicNum.palindromic();
    }

    private static void estimation() {
        NumberEstimation ne = new NumberEstimation();
        ne.estimateFac();
    }

    private static void transpose() {
        Transpose mtrs = new Transpose(5,7);
        int[][] mt=mtrs.createMatrix();
        mtrs.transpose(mt);
    }

    private static void frekans() {
        Frequency fr = new Frequency();
        fr.finder();
    }

    private static void arrange() {
        Sorting sort = new Sorting();
        sort.arrange();
    }

    private static void finderRepeaters() {
        FindRepeaters f = new FindRepeaters();
        f.finder();
    }

    private static void drawingPattern() {
        DrawingPattern dw= new DrawingPattern();
        dw.drawing();
    }

    private static void maxMin() {
        MaxMin m = new MaxMin();
        m.cal();
    }
    private static void harmonicAverage() {
        Average a = new Average();
        var s=a.cal();
        System.out.println(s);
    }
    private static void employeeCal() {
        Employee employee = new Employee("Kerem Sari",1002,44,2000);
        System.out.println(employee);
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