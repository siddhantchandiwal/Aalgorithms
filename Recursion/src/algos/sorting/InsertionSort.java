package algos.sorting;

public class InsertionSort {

    public static void main(String [] args){

        int [] myArray = InsertionSort(new int[] {20,12,36,2,9,78});
        System.out.println("Sorted Array looks like -->");
        for (int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }

    }

    public static int [] InsertionSort(int [] a){
        for(int i=1; i<a.length; i++){
            int element = a[i];
            int j = i-1;
            while(j>=0 && a[j]>element){
                a[j+1]=a[j];
                j--;

            }
            a[j+1] = element;

        }
        return a;
    }
}
