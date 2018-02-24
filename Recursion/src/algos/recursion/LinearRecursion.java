package algos.recursion;

public class LinearRecursion {

    public static void main(String [] args){
        System.out.println("Value found at "+LinearRecursive(new int[] {2,3,9,11,50,63,70}, 0, 121));
    }

    public static int LinearRecursive(int [] a, int i, int x){
        if(i>a.length-1){
            return -1;
        }else if(x==a[i]){
            return i;
        }else{
            System.out.println("Calling now : "+i);
            return  LinearRecursive(a, i+1, x);
        }
    }
}
