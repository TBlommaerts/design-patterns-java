package designpatterns.decorator;

public abstract class Beverage {
    private boolean milk;
    private boolean soy;

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public double cost() {
        double cost = 0;
        if (hasMilk()) {
            cost += 0.5;
        }
        if (hasSoy()) {
            cost += 0.75;
        }
        return cost;
    }
}
