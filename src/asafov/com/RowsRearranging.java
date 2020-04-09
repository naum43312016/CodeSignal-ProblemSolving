package asafov.com;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RowsRearranging {

    boolean rowsRearranging(int[][] m) {
        Arrays.sort(m,(x,y)->x[0]-y[0]);
        return IntStream.range(0,m[0].length).mapToObj(j-> IntStream.range(1,m.length).allMatch(i->m[i-1][j]<m[i][j])).allMatch(i->i);}
}
