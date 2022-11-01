package designpatterns.mediator;

public class Shutter {

    public void openShutter() {
        System.out.println("Shutter opens");
    }

    public void closeShutter() {
        System.out.println("Shutter closes");
    }
    
    public String getName() {
        return "shutter";
    }
}
