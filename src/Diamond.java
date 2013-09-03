public class Diamond {

    String triangle = "";

    public String triangle(int num) {
        if (num%2 == 0){
            return "Must enter an odd number";
        } else {
            for (int i = 1; i <= num;i++ ){
                getSpaces(i,num);
                getAsterisks(i);
            }
        return triangle;
        }
    }

    private void getSpaces(int lineNumber, int totalLines){
        for (int i = lineNumber; i < totalLines; i++){
            triangle += " ";
        }
    }

    private void getAsterisks(int lineNumber){
            lineNumber *= 2;
            for (int i = 1; i < (lineNumber); i++) {
                triangle += "*";
            }
        triangle += "\n";
    }



}
