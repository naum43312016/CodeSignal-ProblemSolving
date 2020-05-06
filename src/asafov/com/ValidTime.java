package asafov.com;

public class ValidTime {
    boolean validTime(String time) {
        String[] arr = time.split(":");
        int hour = Integer.valueOf(arr[0]);
        int min = Integer.valueOf(arr[1]);
        if (hour<0 || hour>23) return false;
        if (min<0||min>59)return false;
        return true;
    }

}
