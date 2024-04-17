import java.util.*;
public class SubArray {
    public static int maxSubArray(int[] array){
      int currentSum = 0;
      int maxSum = Integer.MIN_VALUE;
      for(int i=0;i<array.length;i++){
           currentSum = 0;
        for(int j=i;j<array.length;j++){
            currentSum+=array[j];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);
        
      }
      return maxSum;
    }

   public static void maxWithPrefixSum(int[] array){
        int[] prefixArray = new int[array.length];
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        prefixArray[0] = array[0];
        for(int i=1;i<array.length;i++){
            prefixArray[i]= prefixArray[i-1]+array[i];
        }

        for(int i=0;i<prefixArray.length;i++){
            for(int j=i;j<prefixArray.length;j++){
                currentSum = i==0?prefixArray[j]: prefixArray[j]-prefixArray[i-1];
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        System.out.println(maxSum);


   }
    public static void main(String[] args){
      int[] array = {1,-2,6,-1,3};
    //  System.out.println(maxSubArray(array));

    maxWithPrefixSum(array);
    }
}