import BodyMassIndex.BMIndex;
import Calculator.Calculator;
import Greengrocery.GreenFruitShopping;
import HypotenusAndAreaCal.HypotenuseFinder;
import MidtermAndFinalCalculator.GradeAverageCal;
import PatikaNotOrtalamasi.GeneralAverageCal;
import PriceByTheKdv.SalePriceCal;
import Taximeter.Taximeter;
import ValuesOfCircle.Circle;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
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