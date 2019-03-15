package cc.fyp.design.observer;

import java.util.Observable;

public class Baby extends Observable {

    Baby(){
        addObserver(new Mother());
    }

    public void cry(){
        setChanged();
        notifyObservers("宝宝👶饿了");
    }

}
