package designpatterns.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AutomationMediator();

        Alarm alarm = new Alarm();
        Shutter shutter = new Shutter();

        alarm.triggerAlarm();
        System.out.println();
        shutter.closeShutter();
    }
}
