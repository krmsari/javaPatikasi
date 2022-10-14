package ElmasYapimi;

import java.util.Scanner;

public class Diamond {
    Scanner sc = new Scanner(System.in);
    int size,i,j,k;
    public void maker(){
        System.out.print("Boyutu belirle:");
        size = sc.nextInt();
        for (i=0;i<size;i++){
            for (k=0;k<size-i;k++){
                System.out.print(" ");
            }
            for (j=0;j<=i;j++){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
