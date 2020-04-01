package asafov.com;

public class PhoneCall {

    int phoneCall(int min1, int min2_10, int min11, int s) {
        int minutes=1;
        if (s<min1) return 0;
        s-=min1;
        while (s>0){
            minutes++;
            if (minutes<11){
                s-=min2_10;
            }else {
                s-=min11;
            }

        }
        if (s<0) minutes--;
        return minutes;
    }


}
