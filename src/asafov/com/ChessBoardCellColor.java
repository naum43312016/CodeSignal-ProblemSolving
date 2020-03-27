package asafov.com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChessBoardCellColor {


    boolean chessBoardCellColor(String cell1, String cell2) {

        int x = cell1.charAt(0) - 'A';
        int y = cell1.charAt(1) - '1';

        int x1 = cell2.charAt(0) - 'A';
        int y1 = cell2.charAt(1) - '1';
        if(Math.abs(x1-x)%2 == Math.abs(y1-y)%2) return true;
        return false;
    }
}
