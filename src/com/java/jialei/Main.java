package com.java.jialei;

import com.java.jialei.Interface.ISubject;

/**
 * Created by JiaLei on 2016/9/12.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Begin Run");

        Operation op = Operation.valueOf(args[0]);
        ISubject caller = SubjectCreater.Create(op);
        caller.NotifyObserver();
    }
}
