package com.java.jialei.ObserverModel;
import com.java.jialei.Arithmetic.ArithmeticBase;
import com.java.jialei.Arithmetic.BubbleISorter;
import com.java.jialei.Interface.*;
import com.java.jialei.Interface.IObserver;


/**
 * The class which will show the  com.java.jialei.Arithmetic.BubbleISorter function
 */
public class Maopao extends ArithmeticBase implements IObserver {
    public void runArithmetic() {
        Integer[] slist = GenerateIntList(4);
        //print orignal list
        printList(slist);

        ISorter sorter = new BubbleISorter();
        sorter.sort(slist);

        printList(slist);
    }

    public void Update(){
        this.runArithmetic();
    }
}