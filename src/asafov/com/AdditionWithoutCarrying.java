package asafov.com;

public class AdditionWithoutCarrying {

    static int additionWithoutCarrying(int param1, int param2) {
        String one = String.valueOf(param1);
        String two = String.valueOf(param2);
        if(one.length()!=two.length()){
            if(one.length()>two.length()){
                int j=0;
                int len1 = one.length();
                int len2 = two.length();
                while(j<len1-len2){
                    two = "0"+two;
                    j++;
                }
            }else{
                int j=0;
                int len1 = one.length();
                int len2 = two.length();
                while(j<len2-len1){
                    one = "0"+one;
                    j++;
                }
            }
        }
        String ans = "";
        for(int i=0;i<one.length();i++){
            int n = Character.getNumericValue(one.charAt(i));
            int n2 = Character.getNumericValue(two.charAt(i));
            int res = n+n2;
            if(i==0 && res==0){

            }else{

                ans = ans+res%10;
            }
        }
        if (ans.equals("")) return 0;
        return Integer.valueOf(ans);
    }

    public static void main(String[] args) {
        System.out.println(additionWithoutCarrying(456,0));
    }

}
