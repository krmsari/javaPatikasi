package Java101.TekrarEdenCiftSayiBul;
public class FindRepeaters {
    public void finder(){
        int[] list = {3,2,7,9,2,5,1,21,7,4,4};
        int[] replacement = new int[list.length];
        int counter =0;
        for (int i=0;i<list.length;i++){
            if (list[i]%2==0){
                for (int j=0;j<list.length;j++){
                    if ((i != j) & (list[i] == list[j])){
                        replacement[counter++] = list[i];
                    }
                }
            }
        }
        for (int i:replacement){
            if (i!=0){
                System.out.print(i + ", ");
            }
        }
    }
}
