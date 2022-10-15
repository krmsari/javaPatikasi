package Asal1_100Arasi;

public class PrimeNumbers {
    int i,j;
    public void numbers(){
        for (i=2;i<=100;i++){
            for (j=2;j<i;j++){
                if (i%j==0){
                    System.out.println(i + " , " + j);
                    break;
                }
            }
            System.out.println("Klaan" + i + " , " + j);
        }
    }
}
