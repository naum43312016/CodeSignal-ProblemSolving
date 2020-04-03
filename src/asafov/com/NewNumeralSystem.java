package asafov.com;

import java.util.ArrayList;
import java.util.List;

public class NewNumeralSystem {

    String[] newNumeralSystem(char number) {
        int first=65;
        int last=(int)number;
        List<String>list = new ArrayList<>();
        while (first<=last){
            list.add((char)first + " + " + (char)last);
            first++;
            last--;
        }
        String[] arr = new String[list.size()];
        list.toArray(arr);
        return arr;
    }


}
