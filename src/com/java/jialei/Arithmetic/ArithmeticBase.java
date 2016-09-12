package com.java.jialei.Arithmetic;

import com.java.jialei.Interface.IArithmetic;

/**
 * Created by JiaLei on 2016/9/10.
 */
public abstract class ArithmeticBase implements IArithmetic {

    public abstract void runArithmetic();

    public <T> void printList(T[] list){
        for (T a : list) {
            System.out.print(a.toString());
        }
    }

    public String[] GenerateStringList(){
        return new String[]{"4", "3", "1", "2"};
    }

    public Integer[] GenerateIntList(int length){
        return new Integer[]{4, 2, 3, 1};
    }
}
