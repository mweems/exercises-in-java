import org.junit.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class VectorTest {

        @Test
        public void shouldReturnAnArrayListOfGivenCoordinates() {
           Vector vector = new Vector();
           ArrayList<Double> coord  = new ArrayList<Double>();
           coord.add(1.0);
           coord.add(2.0);
           assertEquals(vector.coordinates(1, 2), coord);
        }

        @Test
        public void shouldAddTheMatchingCoordinatesAndReturnAnArrayList() {
            Vector vector = new Vector();
            ArrayList<Double> coord = new ArrayList<Double>();
            coord.add(3.0);
            coord.add(5.0);
            assertEquals(vector.addCoordinates(1,2,2,3), coord);
        }

        @Test
        public void shouldSubtractTheMatchingCoordinatesAndReturnAnArrayList() {
            Vector vector = new Vector();
            ArrayList<Double> coord = new ArrayList<Double>();
            coord.add(-1.0);
            coord.add(-1.0);
            assertEquals(vector.subtractCoordinates(1,2,2,3), coord);
        }

        @Test
        public void shouldReturnTheDotProductWhenGivenTwoArrayListsOfEqualSize() {
            Vector vector = new Vector();
            ArrayList<Double> coord = new ArrayList<Double>();
            ArrayList<Integer> xCoord = new ArrayList<Integer>();
            ArrayList<Integer> yCoord = new ArrayList<Integer>();
            xCoord.add(1);
            xCoord.add(2);
            xCoord.add(3);
            yCoord.add(2);
            yCoord.add(3);
            yCoord.add(4);
            coord.add(20.0);
            assertEquals(vector.dotProduct(xCoord, yCoord), coord);
        }

        @Test
        public void shouldReturnTheLengthOfTheVectorWhenGivenTheLengthOfTwoSides() {
            Vector vector = new Vector();
            ArrayList<Double> coord = new ArrayList<Double>();
            coord.add(13.0);
            assertEquals(vector.vectorLength(2,3), coord);
        }

}
