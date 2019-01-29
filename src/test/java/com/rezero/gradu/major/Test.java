package com.rezero.gradu.major;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        for (Integer temp : list){
            System.out.println(temp);
            if (temp.equals(2)){
                list.remove(temp);
            }
        }



    }
}
