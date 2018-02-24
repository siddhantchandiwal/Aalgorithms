package algosBinarySearch;

public class BinarySearch {

    public static void main(String[] args){
        System.out.println("Value found at "+BinarySearch(new int[] {2,3,5,6,9,11,62}, 6));

    }

    public static int BinarySearch(int[] a, int x){
        int p=0;
        int q=a.length-1;

        while(p<=q){
            int r = (p+q)/2;
            if(x<a[r]) q=r-1;
            else if (x>a[r]) p=r+1;
            else return r;
        }
        return -1;
    }

}
