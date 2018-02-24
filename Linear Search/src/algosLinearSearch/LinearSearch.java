package algosLinearSearch;

public class LinearSearch {

    public static void main(String[] args){
        System.out.println("Result  is : "+linearSearch(new int[]{2,3,4,5,6}, 40));
    }

    public static int linearSearch(int []a , int x){
        int answer = -1;
        for(int i=0; i< a.length; i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
}
