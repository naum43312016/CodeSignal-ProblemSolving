package asafov.com;

public class MirrorBits {

    int mirrorBits(int a) {
        String num = Integer.toBinaryString(a);
        //num=String.format("%8s", num).replace(' ', '0');
        char[] arr = num.toCharArray();
        int i=0;
        int j = arr.length-1;
        while (i<=j){
            char t = arr[i];
            arr[i]= arr[j];
            arr[j]= t;
            i++;
            j--;
        }
        num = new String(arr);
        return  Integer.parseInt(num, 2);
    }


}
