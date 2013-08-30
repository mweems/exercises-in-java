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

    public ArrayList<Double> addCoordinates(int x1, int y1, int x2, int y2) {
        ArrayList<Double> coord = new ArrayList<Double>();
        int xTot = (x1 + x2);
        int yTot = (y1 + y2);
        coord.add((double) xTot);
        coord.add((double) yTot);
        System.out.println(coord);
        return coord;
    }

    public ArrayList<Double> subtractCoordinates(int x1, int y1, int x2, int y2) {
        ArrayList<Double> coord = new ArrayList<Double>();
        int xTot = (x1 - x2);
        int yTot = (y1 - y2);
        coord.add((double) xTot);
        coord.add((double) yTot);
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
        int Tot = xTot + yTot;
        coord.add((double) Tot);
        System.out.println(coord);
        return coord;
    }

}
