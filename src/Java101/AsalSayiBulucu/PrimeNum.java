package Java101.AsalSayiBulucu;
public class PrimeNum {
    public void finder(int num,int i){

        if (i == num) {
            System.out.print(num + " asal sayi.");
            return;
        } else if (num%i == 0) {
            System.out.print(num + " asal sayi degil. " );
            return;
        }
        finder(num,i+1);
    }
}
