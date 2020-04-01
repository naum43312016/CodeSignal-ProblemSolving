package asafov.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*You are given an array of desired filenames in the order of
their creation. Since two files cannot have equal names, the one
which comes later will have an addition to its name in a form of (k),
where k is the smallest positive integer such that the obtained name is not used yet.
Return an array of names that will be given to the files.
 */
public class FileNaming {
    static String[] fileNaming(String[] names) {
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<names.length;i++){
            if (map.containsKey(names[i])){
                int count = map.get(names[i]);
                String name = names[i];
                String temp = name;
                temp += "(" + count + ")";
                while (map.containsKey(temp)){
                    count++;
                    temp = name + "(" + count + ")";
                }
                map.put(names[i],map.get(names[i])+1);
                map.put(temp,1);
                names[i] = temp;
            }else{
                map.put(names[i],1);
            }
        }
        return names;
    }


    public static void main(String[] args) {
        String[] arr = {"doc", "doc", "image", "doc(1)", "doc"};
        arr = fileNaming(arr);
        System.out.println(Arrays.toString(arr));
    }
}
