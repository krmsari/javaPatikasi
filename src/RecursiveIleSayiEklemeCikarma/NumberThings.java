package RecursiveIleSayiEklemeCikarma;

import java.util.Scanner;

public class NumberThings {
    boolean isLeast=true,finish=false;

    public void pac(int num,int limit){
        System.out.println(num);
        if (num>0 && isLeast){
            pac(num-5,limit);
            return;
        } else if (num>=limit) {
            return;
        } else {
            isLeast=false;
            pac(num+5,limit);
            return;
        }
    }
}
