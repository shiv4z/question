public class MatrixQuestion {
    public static int noOfKey(int[][] matrix, int key){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }

public static int sumOfColumn(int[][] matrix, int key){
    int sum = 0;
    for(int i=0; i < matrix[0].length;i++){
       sum += matrix[key][i];
    }
    return sum;
}
public static void transposrMatrix(int[][] matrix){
    int row = matrix.length;
    int col = matrix[0].length;
    int[][] transMatrix = new int[col][row];
    for(int i=0 ;i< row;i++){
        for(int  j =0 ; j< col;j++){
            transMatrix[j][i] = matrix[i][j];
        }
    }
    printMatrix(transMatrix);
}

public static void printMatrix(int[][] matrix){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" "); 
        }
        System.out.println();
    }
}
public static void printInspiralMatrix(int[][] matrix){
    int row = matrix.length;
    int col = matrix[0].length;
    int start = 0, end = row-1;
    while(start <= end){
         for(int i=start; i<col; i++){
            System.out.print(matrix[start][i]+" ");
         }
         for(int i=start+1; i<row; i++){
            System.out.print(matrix[i][end]+" ");
         }
         for(int i=end-1; i>=start; i--){
            System.out.print(matrix[end][i]+" ");
         }
         for(int i=end-1; i>start; i--){
            System.out.print(matrix[i][start]+" ");
         }
         start++;
         end--;
         col--;
         row--;
    }
    //printMatrix(matrix);
}

public static int diagonalSum(int[][] matrix){
    int leftDiaSum = 0;
    int rightDiaSum = 0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(i==j){
                leftDiaSum += matrix[i][j]; 
            }
             if(i+ j == matrix.length-1){
                if(i != j){
                   rightDiaSum += matrix[i][j]; 
                }
                
            }
        } 
        
    }
    System.out.println("Left Diagonal Sum :: "+leftDiaSum);
    System.out.println("Right Diagonal Sum :: "+rightDiaSum);
    return rightDiaSum+leftDiaSum;
}
    public static void main(String[] args){
        //  int[][] matrix = {{4,7,8},
        //                    {8,8,7}};
        // System.out.println(noOfKey(matrix , 8));
        // int[][] matrix = {{1,4,9},
        //                 {11,4,3},
        //                 {2,2,3}};
        //System.out.println(sumOfColumn(matrix, 0));
      //  transposrMatrix(matrix);
      //int[][] matrix = {{1,2,3,4},
                        // {5,6,7,8},
                        // {9,10,11,12},
                        // {13,14,15,16}};
                        int[][] matrix = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        //printInspiralMatrix(matrix);
        System.out.println(diagonalSum(matrix));
                        
    }
}