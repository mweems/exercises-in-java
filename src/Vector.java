import java.util.ArrayList;

public class Vector {

    public static void main(String[] args){

    }

    public ArrayList<Double> coordinates(int x,int y){
      ArrayList<Double> coord = new ArrayList<Double>();
        coord.add((double) x);
        coord.add((double) y);
        System.out.println(coord);
        return coord;

    }

    public ArrayList<Double> computeCoordinates(int x1, int y1, int x2, int y2, String function) {
        ArrayList<Double> coord = new ArrayList<Double>();
        int[] computed;
        if (function == "add") {
            computed = addCoordinates(x1,y1,x2,y2);
        } else {
            computed = subtractCoordinates(x1,y1,x2,y2);
        }
        coord.add((double) computed[0]);
        coord.add((double) computed[1]);
        System.out.println(coord);
        return coord;
    }

    public ArrayList<Double> dotProduct(ArrayList<Integer> x, ArrayList<Integer> y) {
        ArrayList<Double> coord = new ArrayList<Double>();
        int firstNum = x.get(0) * y.get(0);
        int secondNum = x.get(1) * y.get(1);
        int thirdNum = x.get(2) * y.get(2);
        int total = firstNum + secondNum + thirdNum;
        coord.add((double) total);
        System.out.println(coord);
        return coord;
    }

    public ArrayList<Double> vectorLength(int x,int y) {
        ArrayList<Double> coord = new ArrayList<Double>();
        int xTot = x * x;
        int yTot = y * y;
        int total = xTot + yTot;
        coord.add((double) total);
        System.out.println(coord);
        return coord;
    }

    private int [] addCoordinates(int x1, int y1, int x2, int y2) {
        int[] added = new int[2];
        added[0] = x1 + x2;
        added[1] = y1 + y2;
        return added;
    }

    private int [] subtractCoordinates(int x1, int y1, int x2, int y2) {
        int[] subtracted = new int[2];
        subtracted[0] = x1 - x2;
        subtracted[1] = y1 - y2;
        return subtracted;
    }
}
