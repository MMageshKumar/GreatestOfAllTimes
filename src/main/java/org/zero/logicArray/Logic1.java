package org.zero.logicArray;

import java.util.Arrays;

public class Logic1 {

    public static void main(String[] arg) {
        int[] a = {5, 1, 4, 7, 9, 3, 6};
        int [] b= new int[7];

        int max = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int j = 0; j < a.length; j++) {
            if (max < a[j]) {
                max = a[j];
            }

            if (mini > a[j]) {
                mini = a[j];
            }
        }
        System.out.println(max);
        System.out.println(mini);

        for (int i=0; i<a.length; i++){
            for (int j=i; j<a.length; j++){
                if (a[j]<a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));


        int [] c= {1,5,3,3,2,1,6,5};

        for (int i=0; i<=a.length;i++) {

            for(int j=i;j<=a.length;j++) {

                if (c[i]==c[j]) {
                    if (i!=j) {
                        System.out.println(c[i]);
                    }

                }

            }

        }


        int []d={1,2,3,4,5,6,7,8,9};

        for (int i=0; i<5; i++) {
            int temp1 = d[0];
//            d[0]=d[1];
//            d[1]=d[2];
//            d[2]=d[3];
//            d[3]=d[4];
//            d[4]=d[5];
//            d[5]=d[6];
//            d[6]=d[7];
//            d[7]=d[8];
            for (int j=0; j<d.length-1; j++){
                d[j]=d[j+1];
            }
            d[8]=temp1;
       }
        System.out.println(Arrays.toString(d));

    }
}
