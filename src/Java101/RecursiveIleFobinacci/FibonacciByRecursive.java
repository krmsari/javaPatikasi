package Java101.RecursiveIleFobinacci;
public class FibonacciByRecursive {

    int result=0,total=0,variable=1;

    public void fibonacci(int temp){
        if (temp>0){
            System.out.print(result + ", ");
            total= total + variable;
            variable = total - variable;
            result = total;
            temp=temp-1;
            fibonacci(temp);
        }
    }
}
