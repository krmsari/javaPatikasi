package Java101.ScannerStudy;
import java.util.Scanner;
public class UserManager {
    Scanner scn = new Scanner(System.in);
    String userName,dataUserName,dataPassword,password,newPassword,request;
    public void userData(String userName, String password){
        dataUserName=userName;
        dataPassword=password;
    }
    public void userCreate(){
        System.out.print("Kullanici adi olustur: ");
        userName = scn.nextLine();
        System.out.print("Sifre olustur: ");
        password = scn.nextLine();
        userData(userName,password);
        System.out.println("--------------------");
    }
    public String setPassword(String psw){
        System.out.print("Sifreni mi unuttun ? ");
        request = scn.nextLine().toLowerCase();
        if (request.equals("evet")){
            System.out.print("-Yeni sifrenizi girin: ");
            newPassword = scn.nextLine();
            while (newPassword.equals(psw)){
                System.out.print("-Sifre olusturulamadi, lutfen baska sifre giriniz: ");
                newPassword = scn.nextLine();
            }
            System.out.println("Sifre olusturuldu.");
        }
        else if (request.equals("hayir")){
            System.out.println("Iyi gunler.");
        }
        else{
            System.out.println(" ~ Sorun cikti.");
        }
        return newPassword;
    }
    public void loginPanel(){
        System.out.print("Kullanici adin: ");
        userName = scn.nextLine();
        System.out.print("Sifre: ");
        password = scn.nextLine();
    }
    public void userLogin(){
        userCreate();
        boolean checkLogin=false, setPassword=false;
        loginPanel();
        while (checkLogin==false){

            if (userName.equals(dataUserName) && password.equals(dataPassword)){
                System.out.println("Giriş yapildi.");
                checkLogin=true;
            }
            else if (setPassword) {
                loginPanel();
            } else{
                System.out.println("Tekrar deneyin.");
                loginPanel();
                if (userName.equals(dataUserName) && password.equals(dataPassword)){
                    System.out.println("Giris yapildi.");
                    checkLogin=true;
                }
                else{
                    dataPassword = setPassword(dataPassword);
                    setPassword=true;
                }
            }
        }
    }
}
