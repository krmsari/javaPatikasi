import MidtermAndFinalCalculator.GradeAverageCal;
import PatikaNotOrtalamasi.GeneralAverageCal;

import java.util.Scanner;

public class Main {
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        GeneralAverageCal generalAverageCal = new GeneralAverageCal();
        var c = generalAverageCal.averageCal();

    }

    public void gradeAverageCal(){
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