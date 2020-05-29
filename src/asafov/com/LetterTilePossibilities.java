package asafov.com;

public class LetterTilePossibilities {


    public int numTilePossibilities(String tiles) {
        int l = tiles.length();
        if(l<2)
            return l;
        int arr[] = new int[26];
        for(int i=0; i<l;i++){
            char c = tiles.charAt(i);
            arr[c-'A']++;
        }

        totalRec(arr);
        return count;
    }
    int count =0 ;

    public void totalRec(int ch[]){

        for(int i=0;i<26;i++){
            if(ch[i]>0){
                count++;
                ch[i]--;
                totalRec(ch);
                ch[i]++;
            }
        }
    }

    public static void main(String[] args) {
        String s = "AAB";
        System.out.println(new LetterTilePossibilities().numTilePossibilities(s));
    }
}
