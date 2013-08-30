import org.junit.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class VectorTest {

        Vector vector = new Vector();
        ArrayList<Double> coord = new ArrayList<Double>();

        @Test
        public void shouldReturnAnArrayListOfGivenCoordinates() {
           coord.add(1.0);
           coord.add(2.0);
           assertEquals(vector.coordinates(1, 2), coord);
        }

        @Test
        public void shouldAddTheMatchingCoordinatesAndReturnAnArrayList() {
            coord.add(3.0);
            coord.add(5.0);
            assertEquals(vector.computeCoordinates(1, 2, 2, 3, "add"), coord);
        }

        @Test
        public void shouldSubtractTheMatchingCoordinatesAndReturnAnArrayList() {
            coord.add(-1.0);
            coord.add(-1.0);
            assertEquals(vector.computeCoordinates(1, 2, 2, 3, "subtract"), coord);
        }

        @Test
        public void shouldReturnTheDotProductWhenGivenTwoArrayListsOfEqualSize() {
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
            coord.add(13.0);
            assertEquals(vector.vectorLength(2,3), coord);
        }

}
