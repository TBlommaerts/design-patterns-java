package designpatterns.mediator;

public class Alarm {

    public void triggerAlarm() {
        System.out.println("Alarm rings");
    }
    
    public String getName() {
        return "alarm";
    }
}
