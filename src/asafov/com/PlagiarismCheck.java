package asafov.com;


public class PlagiarismCheck {

    static boolean plagiarismCheck(String[] code1, String[] code2) {
        if (code1.length==code2.length){
            boolean b= true;
            for (int k=0;k<code1.length;k++){
                if (code1[k].contains("return")){
                    if (code1[k].equals(code2[k])){
                        for (int i=0;i<code1.length;i++){
                            if (!code1[i].equals(code2[i])){
                                b=false;
                                break;
                            }
                        }
                        if (b){
                            return true;
                        }
                    }
                }
            }
        }
        if (code1[0].contains("function") ||code1[0].contains("def")){
            String f = code1[0];
            int start = 0;
            int end = 0;
            for (int i=0;i<f.length();i++){
                if (f.charAt(i)=='('){
                    start=i;
                }else if (f.charAt(i)==')'){
                    end = i;
                }
            }
            String v = f.substring(start+1,end);
            String[] var1 = v.split(", ");
            if (var1.length==1){
                String s1 = "";
                String s2 = "";
                for (int i=0;i<code1.length;i++){
                    s1=s1+code1[i];
                }
                for (int i=0;i<code2.length;i++){
                    s2=s2+code2[i];
                }
                return (s1.equals(s2));
            }
            if (start==end) return false;
            if (code2[0].contains("function") ||code2[0].contains("def")){
                f = code2[0];
                start = 0;
                end = 0;
                for (int i=0;i<f.length();i++){
                    if (f.charAt(i)=='('){
                        start=i;
                    }else if (f.charAt(i)==')'){
                        end = i;
                    }
                }
                v = f.substring(start+1,end);
                String[] var2 = v.split(", ");
                if (start==end) return false;


                if (var1.length!=var2.length) return false;
                if (var1.length==0 || var2.length==0){
                    String s1 = "";
                    String s2 = "";
                    for (int i=0;i<code1.length;i++){
                        s1=s1+code1[i];
                    }
                    for (int i=0;i<code2.length;i++){
                        s2=s2+code2[i];
                    }
                    return s1.equals(s2);
                }
                for (int i=0;i<code2.length;i++){
                    String s = code2[i];
                    int indexF = s.indexOf(var2[0]);
                    int indexS = s.indexOf(var2[1]);
                    if (indexF!=-1 && indexS!=-1){
                        String first;
                        String sec;
                        if (indexF<indexS){
                            first = s.substring(0,indexS);
                            sec = s.substring(indexS);
                        }else{
                            first = s.substring(0,indexF);
                            sec = s.substring(indexF);
                        }
                        String newStr = "";
                        if (first.contains(var2[0])){
                            first = first.replaceAll(var2[0],var1[0]);
                        }else if (first.contains(var2[1])){
                            first = first.replaceAll(var2[1],var1[1]);
                        }
                        if (sec.contains(var2[0])){
                            sec = sec.replaceAll(var2[0],var1[0]);
                        }else if (sec.contains(var2[1])){
                            sec = sec.replaceAll(var2[1],var1[1]);
                        }
                        newStr=first+sec;
                        if (!newStr.equals("")){
                            code2[i]= newStr;}
                    }else {
                        if (indexF>=0){
                            s=s.replace(var2[0],var1[0]);
                            code2[i]=s;
                        }else {
                            s=s.replace(var2[1],var1[1]);
                            code2[i]=s;
                        }
                    }

                }
                String s1 = "";
                String s2 = "";
                for (int i=0;i<code1.length;i++){
                    s1=s1+code1[i];
                }
                for (int i=0;i<code2.length;i++){
                    s2=s2+code2[i];
                }
                if (s1.equals(s2)) return true;
                return false;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] c1 = {"function return_four() {",
                "  return 3 + 1;",
                "}"};
        String[] c2 = {"function return_four() {",
                "  return 1 + 3;",
                "}"};
        System.out.println(plagiarismCheck(c1,c2));
    }
}
