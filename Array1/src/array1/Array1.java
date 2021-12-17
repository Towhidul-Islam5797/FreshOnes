package array1;
public class Array1 {
    public static void main(String[] args) {
        int row, col, sumRow, sumCol, sumD = 0, sumD2 = 0;
        int a[][] = {
            {3, 4, 9},
            {2, 9, 11},
            {4, 6, 0},
        };
        row = a.length;
        col  = a[0].length;
        
        for(int i = 0; i < row; i++) {
            sumRow =0;
            for(int j = 0; j < col; j++){
                sumRow = sumRow + a[i][j];
            }
            System.out.println("Sum of  row " + (i+1) + " : " +sumRow);
        }
        
        System.out.println();
        
        for(int i = 0; i < row; i++) {
            sumCol =0;
            for(int j = 0; j < col; j++){
                sumCol = sumCol + a[j][i];
            }   
            System.out.println("Sum of  col " + (i+1) + " : " +sumCol);
        }
        
        System.out.println();
        
        for(int i = 0; i< row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == j) {
                    sumD = sumD + a[i][j];
                }       
            }
        }
        System.out.println("Sum of  diagonal : " + sumD);
        
        System.out.println();
        
        for(int i = 0; i< row; i++) {
            for(int j = 0; j < col; j++) {
                if(i + j == a.length - 1) {
                    sumD2 = sumD2 + a[i][j];
                }       
            }
        }
        System.out.println("Sum of  diagonal : " + sumD2);
    }
    
}
