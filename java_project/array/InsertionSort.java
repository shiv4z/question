public class InsertionSort {

    public static void insertionSort(int[] array){
        for(int i=1;i<array.length;i++ ){
            int temp = array[i];
            int prev = i-1;
            while(prev >= 0 && array[prev] > temp){
                array[prev+1] =array[prev];
                prev--; 
            }
            array[prev+1] = temp;
        }

    }

    public static void main(String[] args){
        int[] array = {5,4,1,3,2};
        insertionSort(array);

        for(int a  : array){
            System.out.print(a+" ");
        }
    }
}