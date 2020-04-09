package asafov.com;

public class ArrayMaxConsecutiveSum2 {

    int arrayMaxConsecutiveSum2(int[] inputArray) {

        int max=-1001;
        int sum=0;
        for (int i=0;i<inputArray.length;i++){
            int num = inputArray[i];
            if (num>max) max=num;
            if (num<0){
                if (sum+num<=0){
                    if (sum!=0){
                        max=Math.max(max,sum);
                        sum=0;
                    }
                }else{
                    sum+=num;
                }
            }else{
                sum+=num;
            }
            if (max!=0)
                max=Math.max(max,sum);
        }
        return max;
    }


}
