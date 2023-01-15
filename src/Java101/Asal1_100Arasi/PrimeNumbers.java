package Java101.Asal1_100Arasi;

public class PrimeNumbers {
    int i,j;
    public void numbers(){
        for (i=2;i<=100;i++){
            boolean isPrime =true;
            for (j=2;j<i;j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + ", ");
            }
        }
    }
}
