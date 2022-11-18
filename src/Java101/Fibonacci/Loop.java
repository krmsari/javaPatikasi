package Java101.Fibonacci;
public class Loop {

    public void cal(){
        int i,result=0,total=0,variable=1;
        for (i=0;i<10;i++){
            System.out.print(result + " ");
            total = total + variable;
            variable = total - variable;
            result=total;
        }
    }
}
