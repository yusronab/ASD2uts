package Soal;

import java.util.Scanner;

public class nomer3 {
    public static void printMatriks(int[][] matriks){
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void tranposeMatriks(int[][] matriks){
        int[][] hasilTranpose = new int[matriks[0].length][matriks.length];
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                hasilTranpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("===== Tranpose =====");
        for (int i=0; i<hasilTranpose.length; i++){
            for (int j=0; j<hasilTranpose[0].length; j++){
                System.out.print(hasilTranpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       
        System.out.println("Masukan jumlah baris Matriks:");
        int baris_a = input.nextInt();
        System.out.println("Masukan jumlah kolom Matriks:");
        int kolom_a = input.nextInt();
        
        int[][] matriks_a = new int[baris_a][kolom_a];
        
        for (int i=0; i<baris_a; i++){
            for (int j=0; j<kolom_a; j++){
                System.out.println("Masukan Matriks A ["+i+" , "+j+"]");
                matriks_a[i][j] = input.nextInt();
            }
        }
        System.out.println("===== Matriks A =====");
        printMatriks(matriks_a);
        tranposeMatriks(matriks_a);
        
        System.out.println("Masukan jumlah baris Matriks:");
        int baris_b = input.nextInt();
        System.out.println("Masukan jumlah kolom Matriks:");
        int kolom_b = input.nextInt();
        
        int[][] matriks_b = new int[baris_b][kolom_b];
        
        for (int i=0; i<baris_b; i++){
            for (int j=0; j<kolom_b; j++){
                System.out.println("Masukan Matriks B ["+i+" , "+j+"]");
                matriks_b[i][j] = input.nextInt();
            }
        }
        System.out.println("===== Matriks B =====");
        printMatriks(matriks_b);
        tranposeMatriks(matriks_b);
    }
}
