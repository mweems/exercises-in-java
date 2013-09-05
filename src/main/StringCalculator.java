package main;

import java.util.ArrayList;

public class StringCalculator {

    public String add(String num){
        if(num == "") return "0";
        ArrayList<Integer> splitNum = new ArrayList<Integer>();
        int total = 0;
        String [] number = num.split(",|\n");
        for(String a : number){
            splitNum.add(Integer.parseInt(a));
        }
            for(int digit : splitNum){
                total += digit;
            }
            return Integer.toString(total);
    }
}
