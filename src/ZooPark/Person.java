package ZooPark;

public class Person implements Walker,Observer,Speaker{

    public void walk() {


        for (int i = 0; i < walkers.length; i++) {
            System.out.println(walkers[i]);
        }

    }

    public void observe() {

        for (int i = 0; i < observers.length; i++) {
            System.out.println(observers[i]);
        }

    }

    public void speak() {

        for (int i = 0; i < speakers.length; i++) {
            System.out.println(speakers[i]);
        }

    }

}
