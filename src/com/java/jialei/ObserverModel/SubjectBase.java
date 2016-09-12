package com.java.jialei.ObserverModel;

import com.java.jialei.Interface.IObserver;
import com.java.jialei.Interface.ISubject;

import java.util.*;

/**
 * Created by JiaLei on 2016/9/12.
 */
public abstract class SubjectBase implements ISubject {
    public List<IObserver> ObsereverList = new ArrayList<IObserver>();
}
