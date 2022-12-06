package Java101.DizeyiSiralama;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    Scanner sc = new Scanner(System.in);
    int interim=0;

    public int[] createArray(){
        System.out.print("Dizinin buyuklugunu sec: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i=0;i<length;i++){
            System.out.print("Dizinin " + (i+1) + ". degerini gir: ");
            int value = sc.nextInt();
            array[i] = value;
        }
        return array;
    }
    //[3, 5, 1, 6, 7]
    public void arrange(){
        int[] list = createArray();
        System.out.println("Olusturuldu: " + Arrays.toString(list));

        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if (list[i]<list[j]){
                    interim = list[i];
                    list[i] = list[j];
                    list[j] = interim;
                }
            }
        }
        System.out.println("Siralanmis: " + Arrays.toString(list));
    }
}
