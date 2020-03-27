package asafov.com;

public class AlphabeticShift {

    String alphabeticShift(String inputString) {
        char[] arr = inputString.toCharArray();
        for (int i=0;i<arr.length;i++){
            int num = arr[i];
            if (num==122){
                num=97;
            }else {
                num++;
            }
            char c = (char)num;
            arr[i]=c;
        }
        return new String(arr);
    }
}
