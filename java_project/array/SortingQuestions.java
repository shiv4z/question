import java.util.*;
public class SortingQuestions {
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int pos=i;
            for(int j=i+1;j<array.length;j++){
               if(array[pos] > array[j])
                pos = j;
            }
            int temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;

        }

    }

    public static void insertionSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertionSorting(int[] array){
        for(int i=1;i<array.length;i++){
            int prev = i-1;
            int curr  = array[i];
            while(prev >= 0 && array[prev]>curr ){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
    }

    public static void countingSort(int[] array){
        int largest = Integer.MIN_VALUE; 
        for(int i=0;i<array.length;i++){
            largest = Math.max(largest, array[i]);
        }
        int[] count = new int[largest+1];
        for(int i =0;i<array.length;i++){
            count[array[i]]++;
        }
        int j =0;
        for(int i=0;i<count.length;i++){
            int maxCount = count[i];
          if(maxCount >0){
             array[j] = i;
             j++;
             maxCount--;

          }
        }
    }
    public static void printArray(int[] array){
        for(int a : array){
            System.out.print(a+ " ");
        }
    }

    public static void main(String[] args){
        int[] array = {3,6,2,1,8,7,4,5,3,1};
      //  bubbleSort(array);
     // selectionSort(array);
     insertionSorting(array);
        printArray(array);

    }
}