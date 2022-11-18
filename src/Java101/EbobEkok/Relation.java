package Java101.EbobEkok;

import java.util.Scanner;

public class Relation {
    Scanner sc = new Scanner(System.in);
    int num1,num2;
    public void cal(){
        System.out.print("Ilk sayiyi gir: ");
        num1=sc.nextInt();
        System.out.print("Ikinci sayiyi gir: ");
        num2=sc.nextInt();
        ebob(num1,num2);
        ekok(num1,num2);
    }

    void ebob(int n1,int n2){
        int smallest = (n1>n2)?n2-1:n1-1;
        int ebobTotal=1;
        while((n1%smallest!=0) || (n2%smallest!=0)){
            smallest--;
        }
        ebobTotal=smallest;
        System.out.println("Ebob ->" +n1 + "|"+ n2 + "=" + ebobTotal);
    }

    void ekok(int n1,int n2){
        int max = n1*n2;
        int ekokTotal=1;
        while(max>0){
           if (max%n1==0 && max%n2==0){
               ekokTotal=max;
           }
            max--;
        }
        System.out.println("Ekok ->" +n1 + "|"+ n2 + "=" + ekokTotal);

    }
}
