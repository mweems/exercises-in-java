public class Diamond {


    public String triangleBuilder(int size) {
        String shape = "";
        if (error(size)) {
            return "Must enter an odd number";
        } else {
          shape += buildTopShape(size);
        return shape;
        }
    }

    public String diamondBuilder(int size) {
        String shape = "";
        int totalSize = (size + 1) / 2;
        if (error(size)) {
            return "Must enter an odd number";
        } else {
            shape += buildTopShape(totalSize);
            shape += buildBottomShape(totalSize);
        }
        return shape;
    }

    public String diamondName(int size, String name){
        String shape = "";
        int totalSize = (size + 1) /2;
        if(error(size)) {
            return "Must enter an odd number";
        } else {
            shape += " " + buildTopShape(totalSize -1);
            shape += name + "\n";
            shape += buildBottomShape(totalSize);
        }

        return shape;
    }


    private String buildTopShape(int lines) {
        String shape = "";
        for (int i = 1; i <= lines; i++) {
            shape += getSpaces(i, lines);
            shape += getAsterisks(i);
        }
        return shape;
    }

    private String buildBottomShape(int lines){
        String shape = "";
        for (int i = (lines - 1); i > 0; i--) {
            shape += getSpaces(i, lines);
            shape += getAsterisks(i);
        }
        return shape;
    }

    private String getSpaces(int lineNumber, int totalLines) {
        String shape = "";
        for (int i = lineNumber; i < totalLines; i++) {
           shape += " ";
        }
        return shape;
    }

    private String getAsterisks(int lineNumber) {
        String shape = "";
        lineNumber *= 2;
        for (int i = 1; i < lineNumber; i++) {
            shape += "*";
        }
        shape += "\n";
        return shape;
    }

    private boolean error(int size) {
        if (size % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
