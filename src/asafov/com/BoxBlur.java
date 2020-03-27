package asafov.com;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
Medium
Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral!
You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
The pixels in the input image are represented as integers. The algorithm distorts the input image in
the following way: Every pixel x in the output image has a value equal to the average value of the
pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels on the border of x are then removed.
Return the blurred image as an integer, with the fractions rounded down.
 */
public class BoxBlur {

    int[][] boxBlur(int[][] image) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i=0;i<image.length-2;i++){
            int[] arr = image[i];
            for (int j=0;j<arr.length-2;j++){
                List<Integer> list = new LinkedList<>();
                int sum =0;
                int k = j;
                int z = k+2;
                while (k<=z){
                    sum+=image[i][k]+image[i+1][k]+image[i+2][k];
                    k++;
                }
                int res = sum/9;
                if (map.containsKey(i)){
                    list = map.get(i);
                    list.add(res);
                    map.put(i,list);
                }else {
                    list.add(res);
                    map.put(i,list);
                }
            }
        }
        int[][] answer = new int[map.size()][map.getOrDefault(0,new LinkedList<>()).size()];
        for (int i=0;i<answer.length;i++){
            List<Integer> list = map.get(i);
            for (int j=0;j<list.size();j++){
                answer[i][j] = list.get(j);
            }
        }
        return answer;
    }

}
