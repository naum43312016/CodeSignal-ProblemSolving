package asafov.com;

import java.util.ArrayList;
import java.util.List;

//codesignal Hard Google q
/*In chess, queens can move
any number of squares vertically,
horizontally, or diagonally.
The n-queens puzzle is the problem of placing n queens on an n × n chessboard so that no two queens can attack each other.
Given an integer n, print
all possible distinct solutions to
the n-queens puzzle. Each solution contains distinct board configurations of the placement of the
n queens, where the solutions are arrays that contain permutations of [1, 2, 3, .. n].
The number in the ith position of the results array indicates that the ith column queen is placed in the row with that number.
In your solution, the board configurations should be returned in lexicographical order.
 */
public class NQueens {

    List<List<Integer>> result = new ArrayList<>();

    int[][] nQueens(int n) {
        if(n==0) return new int[1][0];

        helper(n, new ArrayList<Integer>());

        int[][] array=new int[result.size()][];
        for(int i=0;i<result.size();i++) {
            array[i]=new int[result.get(i).size()];
            for(int j=0;j<array[i].length;j++)
                array[i][j]=result.get(i).get(j);
        }
        return array;
    }

    void helper(int n, List<Integer> curr){
        if(curr.size()==n){
            result.add(curr);
            return;
        }
        for(int i=1;i<=n;i++){
            if(curr.contains(i)) continue;
            if(valid(i, curr)){ //check if works
                List<Integer> temp = new ArrayList<>(curr);
                temp.add(i);
                helper(n, temp);
            }
        }
        return;
    }

    boolean valid(int trial, List<Integer> curr){
        for(int i=0;i<curr.size(); i++){
            if(curr.get(i)-curr.size()+i==trial){ //check upward
                return false;
            }
            if(curr.get(i)+curr.size()-i==trial){ //check downward
                return false;
            }
        }
        return true;
    }


}
