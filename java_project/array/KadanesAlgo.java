import java.util.*;
public class KadanesAlgo {

    public static void kadanesAlgo(int[] array){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        System.out.println(currentSum + " "+maxSum);

        for(int i=0;i<array.length;i++){
            currentSum += array[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            if(currentSum > maxSum){
                maxSum = currentSum ;
            }
        }
        System.out.println("Max Sum :: "+maxSum);
    }

    public static void main(String[] args){
     int[] array = {-2,-3,4,-1,-2,1,5,-3};
     kadanesAlgo(array);
    }
}