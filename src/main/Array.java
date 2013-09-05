package main;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {

    }

    public String shortestString(String[] strings) {
        String shortest = strings[0];
        for (String word : strings){
            if (word.length() < shortest.length()){
                shortest = word;
            }
        }
        return shortest;
    }

    public Integer[] computeNumbers(Integer[] numbers, String type) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int oddOrEven;
        if (type == "odd"){
            oddOrEven = 1;
        } else {
            oddOrEven = 0;
        }
        for (int num : numbers) {
            if (num%2 == oddOrEven) {
                values.add(num);
            }
        }
        Integer[] num = new Integer[values.size()];
        values.toArray(num);
        return num;
    }

    public Integer[] multiples(Integer[] numbers) {
        Integer[] odd = computeNumbers(numbers, "odd");
        Integer[] even = computeNumbers(numbers, "even");
        Integer[] result = new Integer[2];
        result[0] = add(odd);
        result[1] = multiply(even);
        return result;
    }

    private Integer add(Integer[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum+= numbers[i];
        }
        return sum;
    }

    private Integer multiply(Integer[] numbers) {
        int product = 1;
        for(int i = 0; i < numbers.length; i++) {
            product*= numbers[i];
        }
        return product;
    }
}
