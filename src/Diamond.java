public class Diamond {

    String triangle = "";

    public String triangle(int num) {
        if (num%2 == 0){
            return "Must enter an odd number";
        } else {
        for (int i = 1; i <= num;i++ ){
            getSpaces(i,num);
            for (int j = 0; j < i; j++){
               triangle += "*";
            };
            triangle += "\n";
        }
        return triangle;
        }
    }

    private void getSpaces(int lineNumber, int totalLines){
        String space = " ";
        for (int i = lineNumber; i < totalLines; i++){
            triangle += space;
        }
    }



}
