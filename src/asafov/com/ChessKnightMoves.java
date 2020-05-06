package asafov.com;

public class ChessKnightMoves {
    static int chessKnightMoves(String cell) {
        int ans=0;
        int let = ((int)cell.charAt(0))-97;//max 7
        int dig = Character.getNumericValue(cell.charAt(1));
        if (let+1<8){//right1
            if (dig-2>0)ans++;
            if (dig+2<9)ans++;
        }
        if (let+2<8){//right2
            if (dig-1>0)ans++;
            if (dig+1<9)ans++;
        }
        if (let-1>-1){//left1
            if (dig-2>0)ans++;
            if (dig+2<9)ans++;
        }
        if (let-2>-1){//left2
            if (dig-1>0)ans++;
            if (dig+1<9)ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(chessKnightMoves("h1"));
    }
}
