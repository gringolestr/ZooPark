package ZooPark;

class Zoo {

     public void addAnimal (String name, int weight, boolean isMale, boolean isPredator) {

         if (isPredator == true) {

             Cage V = new Cage();
             AnimalPredator B = new AnimalPredator(name, weight, isMale, isPredator);
             V.putAnimalP(B);

         } else {

             Cage V2 = new Cage();
             AnimalHerbivore B2 = new AnimalHerbivore(name, weight, isMale, isPredator);
             V2.putAnimalH(B2);

         }

    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.addAnimal("Лев",90,true,true);

        zoo.addAnimal("Тигр",100,true,true);

        zoo.addAnimal("Лось",90,true,false);

        zoo.addAnimal("Жираф",100,true,false);


        Animal animal = new Animal("",100,true,true);

        Person person = new Person();

        animal.walk();

        animal.getVoice();

        person.observe();

        person.speak();

        person.walk();


        Accountant.getBalance();

    }
}
