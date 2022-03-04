public class atve {
    public static void main (String[] args){
        int [][] m = {
                {3,1,2},
                {1,4,3},
                {2,3,5}
        };
    }
    public static boolean ehSimetrica(int[][] a){
            for(int i=0; i <a.length; i++){
                for(int j=0; j <a[i].length; j++){
                    if(a[i][j] != a[j][i]){
                        return false;
                    }
                }
            }
       return true;
    }
}
