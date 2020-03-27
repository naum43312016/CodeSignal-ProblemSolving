package asafov.com;

public class ShapeArea {

    static int shapeArea(int n) {
        return (n*n)+((n-1)*(n-1));
    }

    public static void main(String[] args) {
        System.out.println(shapeArea(7000));
    }
}
