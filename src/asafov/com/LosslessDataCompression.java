package asafov.com;

public class LosslessDataCompression {
    static String losslessDataCompression(String inputString, int width) {
        StringBuilder builder = new StringBuilder();
        int startIndex = 0;
        char[] arr = inputString.toCharArray();
        for(int i=0;i<inputString.length();i++){
            String s = inputString.substring(i,i+1);
            if (i-width<0){
                startIndex=0;
            }else {
                startIndex=i-width;
            }
            String sub = inputString.substring(startIndex,i);
            if (sub.contains(s)){
                String inSub = "";
                int j=i;
                int index=0;
                while (true){
                    if (j>=inputString.length())break;
                    if (sub.contains(inSub)){
                        inSub=inSub+arr[j];
                        j++;
                    }else{
                        j--;
                        break;
                    }
                }
                int len=0;
                if (j<inputString.length()){
                    inSub=inSub.substring(0,inSub.length()-1);
                    len=inSub.length();
                }else{
                    if (inSub.length()>width){
                        inSub=inSub.substring(0,inSub.length()-1);
                    }
                    len=inSub.length();
                }
                //index = j-len
                for (int k=startIndex;k<i;k++){

                    String sb = inputString.substring(k,k+len);
                    if (sb.equals(inSub)) index=k;
                }
                String indexNlen = "("+index+","+len+")";
                builder.append(indexNlen);
                i=j-1;
            }else{
                builder.append(s);
            }
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        System.out.println(losslessDataCompression("abacabadabacaba",7));
    }
}
