package com.company;

public class Homework {
    static int iterator =0;
    public static void main(String[] args) {
        String []mass=new String[]{"a","b","c","d"};
        System.out.println(recur(mass));
    }
    public  static String recur(String []data){
        if(iterator == data.length-1){
            return data[iterator];
        }
        else{
            System.out.print(data[iterator]+" ");
            iterator++;
            return recur(data);
        }
    }
}
