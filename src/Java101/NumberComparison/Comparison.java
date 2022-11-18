package Java101.NumberComparison;
import java.util.Scanner;
public class Comparison {
    Scanner scn = new Scanner(System.in);
    int i,j,length;
    int[] numbers;
    public void getArray(){
        System.out.print("Kac elemanli array olacak: ");
        length = scn.nextInt();
        numbers = new int[length];
        for (i=0;i<length;i++){
            System.out.print((i+1) + ". sayiyi gir: ");
            numbers[i] = scn.nextInt();
        }
    }
    public void numberComparison(){
        getArray();
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
}
