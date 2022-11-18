package Java101.ElmasYapimi;
import java.util.Scanner;

public class DesiredDiamond {
    
    int size,i,j,k;
    Scanner sc = new Scanner(System.in);
    
    public void maker(){
        
        System.out.print("Boyutu belirle:");
        size = sc.nextInt();

        for (i = 0; i < size ; i++) {
            for (j = 0; j < (size - i); j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (i = size - 1; i >0; i--) {
            for (k = 1; k <= (size-i)+1 ; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
