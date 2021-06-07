package sk.kasv.on.observer.tasrobservers;

import sk.kasv.on.observer.Tasr;

public class FbGate extends Observer{
    public FbGate(Tasr t) {
        subject=t;
        t.attach(this);
    }

    @Override
    public void update() {
        System.out.println("FB: "+subject.getMessage());
    }
}
