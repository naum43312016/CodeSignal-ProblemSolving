package asafov.com;

public class SumUpNumbers {
    static int sumUpNumbers(String inputString) {
        int res = 0;
        for (int i=0;i<inputString.length();i++){
            int j =i;
            if (isNubmer(inputString.charAt(j))){
                while (i<inputString.length() && isNubmer(inputString.charAt(i))){
                    i++;
                }
                res+=Integer.valueOf(inputString.substring(j,i));
            }
        }
        return res;
    }
    static boolean isNubmer(char c){
        int i = c;
        if (i>47 && i<58) return true;
        return false;
    }


    public static void main(String[] args) {
        System.out.println(sumUpNumbers("2 apples, 12 oranges"));
    }
}
