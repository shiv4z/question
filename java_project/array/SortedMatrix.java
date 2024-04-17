public class SortedMatrix {

    public static boolean serachInSortedMatric(int[][] matrix, int key){
        int length = matrix.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == key){
                    System.out.println(key +" found at location ("+i+ ", "+j+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchByOptimization(int[][] matrix , int key){
        int row = matrix.length;
        int column = matrix[0].length;
        System.out.println("row is "+ row +" and column is "+column);
         int i=0;
        while(i < row && column >= 0){
            if(matrix[i][column-1] == key){
                System.out.println("Key found at ("+i +", "+(column-1)+")");
                return true;
            }else if(matrix[i][column-1] < key){
                i++;
            }else {
                column--;
            }
        }
        return false;
    }

    public static boolean searchInSortedMatrixNew(int[][] matrix, int key){
        int row = matrix.length;
        int column = matrix[0].length;
        int j =0;
        while (row >= 0 && j < column){
            if(matrix[row-1][j] == key){
                System.out.println("Key Found at (" + (row -1)+", "+j + ")");
                return true;
            } else if(matrix[row-1][j] < key){
               j++;
            }else{
                row--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] matrix = {{10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                           {32, 33, 39, 50}};
    System.out.println(searchInSortedMatrixNew(matrix,40));
    }
    }
