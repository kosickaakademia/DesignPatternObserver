package sk.kasv.on.observer.tasrobservers;

import sk.kasv.on.observer.Tasr;

public abstract class Observer {
    protected Tasr subject;
    public abstract void update();
}
