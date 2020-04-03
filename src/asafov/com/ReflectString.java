package asafov.com;

public class ReflectString {

    String reflectString(String inputString) {
        char[] arr = inputString.toCharArray();
        int first = 97;
        int a = 25;
        for (int i=0;i<arr.length;i++){
            int let = (int)arr[i];
            int val = (a-(let-first))+first;
            char letter = (char)val;
            arr[i]=letter;
        }
        return new String(arr);
    }


}
