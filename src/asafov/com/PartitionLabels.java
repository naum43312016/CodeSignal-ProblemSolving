package asafov.com;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<Integer>();
        int[] lastIndex = new int[26];

        for(int i=0; i<S.length(); i++){
            lastIndex[S.charAt(i) -'a'] = i;
        }

        int i=0;
        while(i<S.length()){
            int j=i;
            int end = lastIndex[S.charAt(i) -'a'];
            while(j<end){
                end = Math.max(end, lastIndex[S.charAt(j++) -'a']);
            }
            result.add(j-i+1);
            i=j+1;
        }

        return result;
    }
}
