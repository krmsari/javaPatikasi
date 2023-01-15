package Java101.MidtermAndFinalCalculate;

import java.util.Scanner;

public class GradeAverageCal {
    private Scanner scn = new Scanner(System.in);
    public int[] enterGrade(int howManyExams){
        int[] inGrade = new int[howManyExams];
        for (byte i=0;i<howManyExams;i++) {
            System.out.print((i+1) +". sinav sonucunu gir: ");
            inGrade[i] = scn.nextInt();
        }
        return inGrade;
    }
    public int calRate(int howManyGrade ,int midtermRate, int finalRate){
        int resultMidterm = 0, midterms=0, resultFinal=0,result;
        int[] grades = enterGrade(howManyGrade);
        int n =grades.length-1;
        for (byte i=0;i<howManyGrade-1;i++){
            midterms += grades[i]/n;
            resultMidterm= midterms*midtermRate/(100);
        }
        //Son sinav, final sinavi olarak kullanilir.
        resultFinal +=grades[n]*finalRate/100;
        result = resultFinal + resultMidterm;
        return result;
    }
}
