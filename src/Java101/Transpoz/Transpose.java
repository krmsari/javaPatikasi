package Java101.Transpoz;

import java.util.Random;

public class Transpose {
    int colm, row, i, j;
    int[][] matrix, transpose;
    Random rd = new Random();

    public Transpose(int colm, int row){
        this.colm = colm;
        this.row = row;
    }

    public void display(String comment,int[][] m,int r,int c){
        System.out.println("\n" + comment + ":");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j] + " ");

            }
            System.out.println();
        }
    }

    public int[][] createMatrix(){

        matrix = new int[row][colm];
        for(i=0;i<row;i++){
            for(j=0;j<colm;j++){
                matrix[i][j] = rd.nextInt(9);
            }
        }
        display("Matris",matrix,row,colm);
        return matrix;
    }
    public void transpose(int[][] m){
        transpose = new int[colm][row];
        for(i=0;i<colm;i++){
            for(j=0;j<row;j++){
                transpose[i][j] = m[j][i];
            }
        }
        display("Transpoz", transpose,colm,row);
    }
}
