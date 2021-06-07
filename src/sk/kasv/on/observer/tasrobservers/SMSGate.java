package sk.kasv.on.observer.tasrobservers;

import sk.kasv.on.observer.Tasr;

public class SMSGate extends Observer{
    public SMSGate(Tasr t) {
        subject=t;
        t.attach(this);
    }

    @Override
    public void update() {
        System.out.println("SMS: "+subject.getMessage());
    }

    public void remove(){
        subject.remove(this);
    }
}
