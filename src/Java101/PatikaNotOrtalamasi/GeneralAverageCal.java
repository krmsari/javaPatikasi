package Java101.PatikaNotOrtalamasi;

import java.util.Scanner;

public class GeneralAverageCal {
    Scanner scn = new Scanner(System.in);

    public int averageCal(){

        String[] lessons = new String[] {"Matematik","Fizik","Kimya","Turkce","Tarih","Muzik"};
        int[] grades = new int[6];
        int totalGrade=0,result;

        for(byte i=0;i<lessons.length;i++){
            System.out.print(lessons[i] + " dersinin notunu girin: ");
            grades[i] = scn.nextInt();
            totalGrade += grades[i];

        }
        result = totalGrade/(lessons.length);
        String checkStatus = (result>60?"Gecti":"Kaldi");
        System.out.println("Ortalama: " + result + " " + checkStatus);
        return result;
    }
}

