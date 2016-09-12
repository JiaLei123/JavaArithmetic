package com.java.jialei.ObserverModel;

import com.java.jialei.Interface.IObserver;

/**
 * Created by JiaLei on 2016/9/12.
 */
public class SortSubject extends SubjectBase {
    @Override
    public void Dettach(IObserver observer) {
        int index = this.ObsereverList.indexOf(observer);
        if (index > 1) {
            this.ObsereverList.remove(this.ObsereverList.indexOf(observer));
        }
    }

    @Override
    public void Attach(IObserver observer) {
        if(!this.ObsereverList.contains(observer)){
            this.ObsereverList.add(observer);
        }
    }

    @Override
    public void NotifyObserver() {
        if (ObsereverList.size() > 0) {
            for (IObserver observer : ObsereverList) {
                observer.Update();
            }
        }
    }
}
