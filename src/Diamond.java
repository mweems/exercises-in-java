public class Diamond {


   String shape = new String();

    public String triangleBuilder(int size) {
        shape = "";
        if (error(size)) {
            return "Must enter an odd number";
        } else {
          buildShape(size);
        return shape;
        }
    }

    public String diamondBuilder(int size) {
        shape = "";
        int totalSize = (size + 1) / 2;
        if (error(size)) {
            return "Must enter an odd number";
        } else {
            buildShape(totalSize);
            for (int i = (totalSize - 1); i > 0; i--) {
                getSpaces(i, totalSize);
                getAsterisks(i);
            }
        }
        return shape;
    }

    public String diamondName(int size, String name){
        shape = " ";
        int totalSize = (size + 1) /2;
        if(error(size)) {
            return "Must enter an odd number";
        } else {
            buildShape(totalSize -1);
            shape += name + "\n";
            for (int i = (totalSize -1); i > 0; i--) {
                getSpaces(i, totalSize);
                getAsterisks(i);
            }
        }
        return shape;
    }


    private void buildShape(int lines) {
        for (int i = 1; i <= lines; i++) {
            getSpaces(i, lines);
            getAsterisks(i);
        }
    }

    private void getSpaces(int lineNumber, int totalLines) {
        for (int i = lineNumber; i < totalLines; i++) {
           shape += " ";
        }
    }

    private void getAsterisks(int lineNumber) {
        lineNumber *= 2;
        for (int i = 1; i < lineNumber; i++) {
            shape += "*";
        }
        shape += "\n";
    }

    private boolean error(int size) {
        if (size % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
