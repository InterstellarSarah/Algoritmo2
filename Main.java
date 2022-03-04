import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int[][] matriz = new int[3][2];
        lerMatriz(matriz);
        int maior = maior(matriz);
        System.out.println("Maior elemento = " + maior);
    }
    public static int maior (int[][] m) {
        int maior = m [0][0];
        for(int i=0; i <m.length; i++){
            for(int j=0; j <m[i].length; j++){
                if(m[i][j] > maior){
                    maior = m[i][j];
                }
            }
        }
        return maior;
    }
    public static void lerMatriz(int [][] m){
        Scanner leitor = new Scanner(System.in);
        for(int i=0; i <m.length; i++){
            for(int j=0; j <m[i].length; j++){
                System.out.printf("M[%d][%d]: ", i, j);
                m[i][j] = leitor.nextInt();
            }
        }
    }
}
