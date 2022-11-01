package designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setMilk(true);
        coffee.setSoy(true);

        System.out.println("Price coffee: " + coffee.cost());
    }
}
