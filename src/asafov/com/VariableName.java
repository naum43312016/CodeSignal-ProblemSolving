package asafov.com;

public class VariableName {

    boolean variableName(String name) {
        char[] arr = name.toCharArray();
        for (int i=0;i<arr.length;i++){
            int let = arr[i];
            if (i==0){
                if (let>=48 && let<58) return false;
            }
            if (let<48 || (let>57 && let<65) || (let>90 && let<95)
            || let==96 || let>122){
                return false;
            }
        }
        return true;
    }
}
