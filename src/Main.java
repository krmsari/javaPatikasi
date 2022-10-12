import BodyMassIndex.BMIndex;
import Calculator.Calculator;
import Greengrocery.GreenFruitShopping;
import Horoscope.HoroscopeFinder;
import HypotenusAndAreaCalculate.HypotenuseFinder;
import MidtermAndFinalCalculate.GradeAverageCal;
import NumberComparison.Comparison;
import PatikaNotOrtalamasi.GeneralAverageCal;
import PatikaNotOrtalamasiIkı.ProgressStatus;
import PriceByTheKdv.SalePriceCal;
import ScannerStudy.UserManager;
import Taximeter.Taximeter;
import ValuesOfCircle.Circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hypotenuseFinder();
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
    public static void generalAverageCal() {
        GeneralAverageCal generalAverageCal = new GeneralAverageCal();
        var c = generalAverageCal.averageCal();
    }
    public void gradeAverageCal(){
        Scanner scn = new Scanner(System.in);
        GradeAverageCal gradeAverageCal = new GradeAverageCal();
        System.out.print("Donem boyunca kac sinav olacak: ");
        int howManyExams = scn.nextInt();
        System.out.print("Vizenin orani ne olacak: ");
        int midtermExamRate = scn.nextInt();
        int finalExamRate = 100 - midtermExamRate;
        var resultOfGrades = gradeAverageCal.calRate(howManyExams,midtermExamRate,finalExamRate);
        System.out.println("Result: " + resultOfGrades);
        var s = resultOfGrades>=45 ? "Gecti":"Kaldi";
    }
}