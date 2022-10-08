import MidtermAndFinalCalculator.GradeAverageCal;
import PatikaNotOrtalamasi.GeneralAverageCal;
import PriceByTheKdv.SalePriceCal;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
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