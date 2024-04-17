import java.util.*;
public class WaterTraped {

    public static void trappedWater(int[] array){
        int[] leftMaxBar = new int[array.length];
        int[] rightMaxBar = new int[array.length];
        int rainTrapped = 0;

        leftMaxBar[0] = array[0];
        rightMaxBar[array.length-1] = array[array.length-1];
        for(int i=1;i<array.length;i++){
            leftMaxBar[i]=Math.max(leftMaxBar[i-1], array[i]);
        }

       for(int i=0;i<leftMaxBar.length;i++){
          System.out.println("left max :: "+leftMaxBar[i]);
       }
        for(int i=array.length-2;i>=0;i--){
            rightMaxBar[i]=Math.max(array[i], rightMaxBar[i+1]);
        }

        for(int i=0;i<rightMaxBar.length;i++){
          System.out.println("right max :: "+rightMaxBar[i]);
       }

        for(int i=0;i<array.length;i++){
            rainTrapped += Math.min(leftMaxBar[i],rightMaxBar[i]) - array[i];
        }
        System.out.println("Calculate Trapped Water :: "+ rainTrapped);

    }


    public static void main(String[] args){
        int[] height = {4,2,0,6,3,2,5};
        trappedWater(height);

    }
}