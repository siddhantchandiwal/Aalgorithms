package algos.sorting;

public class SelectionSort {

    public static void main(String [] args){

        int [] myArray = selectionSort(new int[] {20,12,36,2,9,78});
        System.out.println("Sorted Array looks like -->");
        for (int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }

    public static int [] selectionSort(int [] a){
        for(int i=0;i<a.length;i++){
            int min =i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        return a;
    }
}

