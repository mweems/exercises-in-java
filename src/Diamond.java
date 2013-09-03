public class Diamond {

    String shape = "";

    public String triangle(int num) {
        if (num%2 == 0){
            return "Must enter an odd number";
        } else {
            for (int i = 1; i <= num; i++){
                getSpaces(i, num);
                getAsterisks(i);
            }
        return shape;
        }
    }

    public String diamond(int num) {
        if (num%2 == 0) {
            return "Must enter an odd number";
        } else {
            int totalSize = (num + 1) / 2;
            for (int i = 1; i <= totalSize; i++){
                getSpaces(i, totalSize);
                getAsterisks(i);
            }
            if (totalSize != 1) {
                for (int i = (totalSize - 1); i > 0; i--){
                    getSpaces(i, totalSize);
                    getAsterisks(i);
                }
            }
        }
        return shape;
    }


    private void getSpaces(int lineNumber, int totalLines){
        for (int i = lineNumber; i < totalLines; i++){
            shape += " ";
        }
    }

    private void getAsterisks(int lineNumber){
            lineNumber *= 2;
            for (int i = 1; i < lineNumber; i++) {
                shape += "*";
            }
        shape += "\n";
    }

}
