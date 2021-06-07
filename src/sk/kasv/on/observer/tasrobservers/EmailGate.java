package sk.kasv.on.observer.tasrobservers;

import sk.kasv.on.observer.Tasr;

public class EmailGate extends Observer{
    public EmailGate(Tasr t) {
        subject=t;
        t.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Email: "+subject.getMessage());
    }
}
