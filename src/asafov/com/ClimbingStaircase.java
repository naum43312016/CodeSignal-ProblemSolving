package asafov.com;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStaircase {
    int[][] climbingStaircase(int n, int k) {
        K=k;
        f(n,new ArrayList<Integer>());
        int[][] R=new int[S.size()][];
        for(int i=0;i<S.size();i++) {
            R[i]=new int[S.get(i).size()];
            for(int j=0;j<R[i].length;j++)
                R[i][j]=S.get(i).get(j);
        }
        return R;
    }

    ArrayList<ArrayList<Integer>> S=new ArrayList<>();
    int K;

    void f(int s, ArrayList<Integer> l) {
        if(s==0) {
            S.add(l);
            return;
        }
        if(s<0)
            return;
        for(int i=1;i<=K;i++) {
            ArrayList<Integer> L=new ArrayList<>(l);
            L.add(i);
            f(s-i,L);
        }
    }

}
