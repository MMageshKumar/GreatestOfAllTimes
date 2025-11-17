package org.zero.logicArray;

public class Logic4 {
    public static void main(String[] args){

//        Reverse Array String or Integer

        String[] a={"mani","magesh","Guna","Senthil"};

        for (int i=0; i<a.length/2;i++){

            // 1. Calculate the index of the element at the opposite end
            int j = a.length-1-i;

            // 2. Perform the swap
            String temp1=a[i];
            a[i]=a[j];
            a[j]=temp1;
        }

        for(String x:a){
            System.out.println(x);
        }

    }
}
