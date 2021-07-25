//package minesweeper;

package com.kabir.milton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String ar[] = new String[9];
        String st = ".........";
        for (int i = 0; i < 9; i++) {
            ar[i] = st;
        }
        int cc = 0;
        int[] a = {0,1,2,3,4,5,6,7,8};
        int[] b = {0,1,2,3,4,5,6,7,8};
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < b.length; ++j)
                list.add(new int[]{a[i], b[j]});

        Collections.shuffle(list);
//        System.out.println(list);
        System.out.println("How many mines do you want on the field?");
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            int x=list.get(i)[0];
            int y=list.get(i)[1];

            ar[x]=ar[x].substring(0,y)+"X"+ar[x].substring(y+1);
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(ar[i]);
        }

    }
}
