package asafov.com;

import java.util.Arrays;

public class HigherVersion {

    static boolean higherVersion(String ver1, String ver2) {
        String[] v1 = ver1.split("\\.");
        String[] v2 = ver2.split("\\.");
        boolean h = false;
        for (int i=0;i<v1.length;i++){
            int one = Integer.valueOf(v1[i]);
            int two = Integer.valueOf(v2[i]);
            if (one<two){
                if (!h) return false;
            }else if (one>two){
                h=true;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        higherVersion("1.1.5","1.0.5");
    }
}
