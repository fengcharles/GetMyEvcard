package cc.fyp.design.observer;

import java.util.Observable;
import java.util.Observer;

public class Mother implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("mam 知道了");
        System.out.println((String) arg);
    }
}
