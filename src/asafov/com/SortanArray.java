package asafov.com;

public class SortanArray {
    public int[] sortArray(int[] nums) {
        qSort(nums,0,nums.length-1);
        return nums;
    }


    private void qSort(int[] arr, int l, int h) {

        if (l<h){
            int p = part(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }

    private int part(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i=l-1;
        for (int j=l;j<h;j++){
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }

    private void swap(int[] arr, int i, int h) {
        int t=arr[i];
        arr[i]=arr[h];
        arr[h]=t;
    }
}
