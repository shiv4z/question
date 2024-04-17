import java.util.*;
public class CountingSort {

    public static void countingSort(int[] array){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
           largest = Math.max(largest, array[i]);
        }

        int[] count = new int[largest+1];
        for(int i =0;i<array.length;i++){
            count[array[i]]++;
        }
         int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] >0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {1,4,2,5,3,2,4,5};
        countingSort(array);
        for(int a : array){
            System.out.print(a + " ");
        }
    }
}