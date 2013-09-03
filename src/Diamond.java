public class Diamond {

    public String triangle(int num) {
        String triangle = "";
        String[] string = new String[num];
        for (int i = 1; i <= num;i++ ){
            for (int j = 0; j < i; j++){
               triangle += "*";
            };
            triangle += "\n";
        }
        string = triangle.split("\n");
        System.out.println("+++" + string[2].length());
        return "";
    }
}
