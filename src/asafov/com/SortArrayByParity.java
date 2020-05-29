package asafov.com;


public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int i=0;
        int y=A.length-1;
        for (int num : A){
            if (num%2==0){
                ans[i++]=num;
            }else{
                ans[y--]=num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
