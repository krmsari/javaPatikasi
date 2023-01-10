package Java101.PalindromikKelime;

public class PalindromicWord {
    int i,j;
    String str;
    boolean isPalindromic = true;
    public PalindromicWord(String str){
        this.str = str;
    }
    public boolean isPalindromic(){
        i=0;j=str.length()-1;
        while( i<=j ){
            if (str.charAt(i) != str.charAt(j)) {
                isPalindromic = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindromic;
    }
    public void palindromic(){
        if (isPalindromic()){
            System.out.println("'" + str + "'" + " palindromik metindir");
        }else{
            System.out.println("'" + str + "'" + " palindromik metin değil !!");
        }
    }
}
