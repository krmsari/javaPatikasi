package Java101.ExponentialCal;

public class Calculate {
    int result=1;
    public int cal(int t,int e){
        if(e>0){
            return result=t*cal(t,e-1);
        }
        else {
            return 1;
        }
    }
}