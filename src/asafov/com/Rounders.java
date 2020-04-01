package asafov.com;

public class Rounders {

    static int rounders(int n) {

        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        boolean carry = false;

        int j = arr.length-1;
        while (j>0){
            if (carry){
                int dig = Character.getNumericValue(arr[j]);
                dig++;
                if (dig<5){
                    arr[j]='0';
                    carry=false;
                }else{
                    carry=true;
                    arr[j]='0';
                }
            }else{
                int dig = Character.getNumericValue(arr[j]);
                if (dig<5){
                    arr[j]='0';
                    carry=false;
                }else{
                    carry=true;
                    arr[j]='0';
                }
            }
            j--;
        }
        int dig = Character.getNumericValue(arr[0]);
        if (carry){
            dig++;
        }
        int i=1;
        String ans = ""+dig;
        while (i<arr.length){
            ans+=arr[i];
            i++;
        }
        int res = Integer.valueOf(ans);
        return res;
    }

    public static void main(String[] args) {
        int i = rounders(15);
        System.out.println(i);
    }
}
