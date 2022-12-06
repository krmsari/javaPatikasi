package Java101.PatikaNotOrtalamasIlki;
import java.util.Scanner;
public class ProgressStatus {
    Scanner scn = new Scanner(System.in);
    public int averageCal(){
        String[] lessons = new String[] {"Matematik","Fizik","Kimya","Turkce","Muzik"};
        int[] grades = new int[5];
        int totalGrade=0,result;

        for(byte i=0;i<lessons.length;i++){
            System.out.print(lessons[i] + " dersinin notunu girin: ");
            grades[i] = scn.nextInt();

            while (grades[i]>100 || grades[i]<0){
                System.out.print("\nDers notları 0-100 araliginda olmali, " + lessons[i] + " dersinin notunu girin: ");
                grades[i] = scn.nextInt();
            }
            totalGrade += grades[i];
        }
        result = totalGrade/(lessons.length);
        String checkStatus = (result>55?"Gecti":"Kaldi");
        System.out.println("Ortalama: " + result + " " + checkStatus);
        return result;
    }
}

