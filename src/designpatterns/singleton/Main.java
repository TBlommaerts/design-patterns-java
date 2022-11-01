package designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        Singleton anotherSingleton = new Singleton();
        System.out.println("Is singleton? " + (singleton == anotherSingleton));
    }
}
