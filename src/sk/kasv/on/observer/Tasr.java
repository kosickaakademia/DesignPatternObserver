package sk.kasv.on.observer;

import sk.kasv.on.observer.tasrobservers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Tasr {
    private List<Observer> list ;
    private int priority;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message,int priority) {
        this.message = message;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(Observer o : list)
            o.update();
    }

    public void attach(Observer observer){
        if(observer==null)
            return;
        if(list==null)
            list = new ArrayList<>();
        list.add(observer);
    }

    public void remove(Observer observer){
        list.remove(observer);
    }

    public int getPriority() {
        return priority;
    }
}
