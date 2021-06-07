package sk.kasv.on.observer;

import sk.kasv.on.observer.tasrobservers.EmailGate;
import sk.kasv.on.observer.tasrobservers.FaxGate;
import sk.kasv.on.observer.tasrobservers.FbGate;
import sk.kasv.on.observer.tasrobservers.SMSGate;

public class Main {
    public static void main(String[] args) {
        Tasr tasr =new Tasr();

        new EmailGate(tasr);
        FaxGate fg=new FaxGate(tasr);
        SMSGate sg=new SMSGate(tasr);
        FbGate fbg=new FbGate(tasr);
        tasr.setMessage("Od dnes sa ockuje Sputnikom!",1);

        sg.remove();
        tasr.setMessage("Vcera vyhrali Kanadania MS v hokeji",2);
    }
    /*
    Homework: priority 1: all observers
                       2: email, facebook
                       3. email
                       ine cislo /0,-5,17, .../  nikto spravu neriesi
     */
}
