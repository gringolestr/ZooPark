package ZooPark;

enum type {
    ERBIVORE,PREDATOR
}

public class Animal implements Walker,Voicer {

    public void walk() {

        for (int i = 0; i < walkers.length; i++) {
            System.out.println(walkers[i]);
        }

    }

    public void getVoice() {

        for (int i = 0; i < voicer.length; i++) {
            System.out.println(voicer[i]);
        }

    }

    private String name;
    private int weight;
    private boolean isMale;
    private boolean isPredator;

    public Animal(String name, int weight, boolean isMale,boolean isPredator) {
        this.name = name;
        this.weight = weight;
        this.isMale = isMale;
        this.isMale = isPredator;
    }

}