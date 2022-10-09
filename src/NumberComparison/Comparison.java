package NumberComparison;
import java.util.Scanner;
public class Comparison {
    Scanner scn = new Scanner(System.in);
    int[] numbers = new int[3];
    int i,j;

    public void numberComparison(){
        try {
            for (i=0;i<3;i++){
                System.out.print((i+1) + ". sayiyi gir: ");
                numbers[i] = scn.nextInt();
            }
            int keep = 0;
            for (i = 0; i < numbers.length; i++) {
                for (j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        keep = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = keep;
                    }
                }
            }
            for (int nm:numbers) {
                System.out.println(nm);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
