package asafov.com;

public class TimedReading {

    int timedReading(int maxLength, String text) {
        int res=0;
        String[] arr = text.split(" ");
        for (String word : arr){
            int len = word.length();
            int i = word.length()-1;
            while (i>=0 && ((int)word.charAt(i) <65 || (int)word.charAt(i) >122 || ((int)word.charAt(i) >90 && (int)word.charAt(i) <97)) ){
                len--;
                i--;
            }
            if (len<=maxLength && len>0) res++;
        }
        return res;
    }


}
