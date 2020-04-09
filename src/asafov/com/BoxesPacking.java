package asafov.com;

import java.util.*;

public class BoxesPacking {

    static boolean boxesPacking(int[] length, int[] width, int[] height) {
        if (length.length<2) return true;
        Box[] boxes = new Box[length.length];
        for (int i=0;i<boxes.length;i++){
            boxes[i]=new Box(
                    length[i],width[i],height[i]
            );
        }
        Arrays.sort(boxes);
        for (int i=0;i< boxes.length-1;i++){
            if (!canPack(boxes[i],boxes[i+1])){
                return false;
            }
        }
        return true;
    }
    static boolean canPack(Box a,Box b){
        List<Integer> l1 = new ArrayList<>();
        l1.add(a.length);
        l1.add(a.width);
        l1.add(a.height);

        List<Integer> l2 = new ArrayList<>();
        l2.add(b.length);
        l2.add(b.width);
        l2.add(b.height);
        Collections.sort(l1);
        Collections.sort(l2);
        for (int i=0;i<l1.size();i++){
            if (l1.get(i)>=l2.get(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int length[] = {6,4};
        int width[]={5,3};
        int height[] ={4,5};
        System.out.println(boxesPacking(length,width,height));
    }
}
class Box implements Comparable<Box>{
    int length;
    int width;
    int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public int compareTo(Box o) {
        int min1 = Math.min(Math.min(this.length,this.width),this.height);
        int min2 = Math.min(Math.min(o.length,o.width),o.height);
        return min1-min2;
    }

    /*@Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }*/
}