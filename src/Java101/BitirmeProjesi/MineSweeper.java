package Java101.BitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row, col,mine,i,j,selectedX,selectedY;
    String[][] area;
    String[][] display;
    int[][] mines;
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    boolean gameOver = false;

    public MineSweeper(int row, int col){
        this.col = col;
        this.row = row;
        area = new String[row][col];
        display = new String[row][col];

    }

    public void createArea() {
        for (i=0; i< row; i++){
            for (j=0; j< col; j++){
                area[i][j]="-";
                display[i][j] = "-";
            }
        }
    }
    public void placeTheMines(){
        createArea();
        mine = (col * row)/4;
        mines = new int[mine][2];
        for (i=0;i<mine;i++){
            mines[i][0]= random.nextInt((row)); // rastgele bir satir kordinati seciliyor ve bu 'mines' dizisinde satırına
            mines[i][1]= random.nextInt((col)); // yukaridaki ile ayni mantik ama sutun icin gecerli
            if (area[mines[i][0]][mines[i][1]].equals("*")){ //eger secilen kordinata daha onceden mayin koyulmus ise baska kordinat secer
                i--;
            }else{
                area[mines[i][0]][mines[i][1]] = "*";
            }
        }
    }
    public void showTheArea(String[][] array){
        System.out.println("        Mayinli Alan");
        System.out.print("         ");
        for (i=0;i<col;i++){
            System.out.print(" " + (i+1) + " ");
        }
        System.out.println();
        for (i=0; i< row; i++){
            System.out.print("        " +(i+1));
            for (j=0; j< col; j++){
                System.out.print(" "+array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public boolean checkFinish(){
        for (i=0; i< row; i++){
            for (j=0; j< col; j++){
                if (area[i][j].equals("-")){
                    return false;
                }
            }
        }
        System.out.println("\n -Kazandin...");
        return true;
    }
    public boolean inRange(int r,int c){
        if (r>=0 && r<row && c>=0 && c<col){
            return true;
        }
        return false;
    }

    public int hasMine(int r, int c) {
        if(inRange(r,c) )
        {
            if (area[r][c].equals("*")){
                return 1;
            }
        }
        return 0;
    }

    public void game(){
        placeTheMines();
        System.out.println("\n -Mayın tarlası oluşturuluyor...\n");
        showTheArea(display);

        while (!gameOver){
            System.out.print("Satir degeri gir: ");
            selectedX = input.nextInt()-1;
            System.out.print("Sutun degeri gir: ");
            selectedY = input.nextInt()-1;
            if (selectedX<row && selectedY<col){
                if (area[selectedX][selectedY].equals("*") || gameOver){
                    System.out.println("BOOMMM!! Mayina denk geldin. ");
                    gameOver=true;
                }else{
                    int totalMines=0;
                    if (hasMine(selectedX-1,selectedY-1)==1 && inRange(selectedX-1,selectedY-1)){ //sol ust kose
                        //System.out.println("(selectedX-1,selectedY-1) girdi"); //LOG
                        totalMines++;
                    }
                    if (hasMine(selectedX,selectedY-1)==1 && inRange(selectedX,selectedY-1)){ // sol kenar kontrolu
                        //System.out.println("(selectedX,selectedY-1) girdi"); //LOG
                        totalMines++;
                    }
                    if (hasMine(selectedX+1,selectedY-1) == 1 && inRange(selectedX+1,selectedY-1)){//sol alt kose kontrolu
                        //System.out.println("(selectedX+1,selectedY-1) girdi"); //LOG
                        totalMines++;
                    }
                    if (hasMine(selectedX-1,selectedY) == 1 && inRange(selectedX-1,selectedY)){// ust kenar kontrolu
                        //System.out.println("(selectedX,selectedY) girdi"); //LOG
                        totalMines++;
                    }
                    if (hasMine(selectedX+1,selectedY) == 1 && inRange(selectedX+1,selectedY)){//alt kenar kontrolu
                        //System.out.println("(selectedX+1,selectedY) girdi"); //LOG
                        totalMines++;
                    }
                    if (hasMine(selectedX-1,selectedY+1) == 1 && inRange(selectedX-1,selectedY+1)){//sag ust kose kontrolu
                        //System.out.println("(selectedX-1,selectedY+1) girdi"); //LOG
                        totalMines++;
                    }
                    if (hasMine(selectedX,selectedY+1) == 1 && inRange(selectedX,selectedY+1)){//sag kenar kontrolu
                        //System.out.println("(selectedX,selectedY+1) girdi"); //LOG
                        totalMines++;
                    }
                    if (hasMine(selectedX+1,selectedY+1) == 1 && inRange(selectedX+1,selectedY+1)){//sag alt kose kontrolu
                        //System.out.println("(selectedX+1,selectedY+1) girdi"); //LOG
                        totalMines++;
                    }
                    area[selectedX][selectedY] = String.valueOf(totalMines);
                    display[selectedX][selectedY] = String.valueOf(totalMines);
                    gameOver = checkFinish();
                }
                showTheArea(display);
            }else{
                System.out.println(" Girilen nokta mayınlı alan içerisinde değil.\n Tekrar deneyin...");
            }

        }
        showTheArea(area);
        System.out.println(" -Oyun sonlandi...\n");
    }
}
