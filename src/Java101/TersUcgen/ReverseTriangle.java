package Java101.TersUcgen;
import java.util.Scanner;

public class ReverseTriangle {
    Scanner sc = new Scanner(System.in);
    int i,j,k,size;
    public void maker(){
        System.out.print("Boyutu gir: ");
        size = sc.nextInt();

        for (i = size - 1; i >0; i--) {
            for (k = 1; k <= (size-i)+1 ; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
