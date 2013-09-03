public class Diamond {


    public String triangleBuilder(int size) {
        error(size);
        return buildTopShape(size);
    }

    public String diamondBuilder(int size) {
        String shape = "";
        int totalSize = (size + 1) / 2;
        error(size);
        shape += buildTopShape(totalSize);
        shape += buildBottomShape(totalSize);
        return shape;
    }

    public String diamondName(int size, String name){
        int totalSize = (size + 1) /2;
        error(size);
        String original = buildTopShape(totalSize);
        String shape = dropLastLine(original);
        shape += name + "\n";
        shape += buildBottomShape(totalSize);
        return shape;
    }

    private String dropLastLine(String original) {
        String newString = "";
        String[] parts = original.split("\\n");
        for(int i = 0; i < parts.length - 1; i++)
            newString += parts[i] + "\n";
        return newString;
    }

    private String buildTopShape(int lines) {
        String shape = "";
        for (int i = 1; i <= lines; i++) {
            shape += getSpaces(i, lines) + getAsterisks(i);
        }
        return shape;
    }

    private String buildBottomShape(int lines){
        String shape = "";
        for (int i = (lines - 1); i > 0; i--)
            shape += getSpaces(i, lines) + getAsterisks(i);
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

    private void error(int size) {
        if (size % 2 == 0)
            throw new IllegalArgumentException("Size must be odd!");
    }

}
