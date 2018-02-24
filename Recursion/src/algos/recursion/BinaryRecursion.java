package algos.recursion;

public class BinaryRecursion {

    public static void main(String [] args){
            System.out.println("Value found at : "+BinarySearch(new int[]{2,3,4,6,8,9}, 0, 5, 4));
    }

    public static int BinarySearch(int []a, int p, int r, int x){

        if(p>r){
            return -1;
        }else {
            int q = (p+r)/2;
            if(a[q]==x){
                return q;
            }else if(a[q]>x){
                   return BinarySearch(a,p, q-1, x);
            }else{
                return BinarySearch(a, q+1, r, x);
            }
        }
    }
}
