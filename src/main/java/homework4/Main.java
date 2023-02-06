package src.main.java.homework4;

public class Main {
    public static void main(String[] args) {

        Dog Dog1 = new Dog("Sharick");
        Dog1.swim(8);
        Dog1.run(-1);

        Dog Dog2 = new Dog("Puschok");
        Dog2.swim(12);
        Dog2.run(399);

        Dog Dog3 = new Dog("Panther");
        Dog3.swim(1);
        Dog3.run(1);


        Cat Cat1 = new Cat("Fluffy");
        Cat1.run(501);
        Cat1.swim(501);

        Cat Cat2 = new Cat("Generic");
        Cat2.run(200);
        Cat2.swim(200);

        Cat Cat3 = new Cat("Alfred");
        Cat3.run(-1);
        Cat3.swim(-1);

        System.out.println("\nTotal Animals count = " + (Cat.getCatCounter() + Dog.getDogCounter()) + "\nTotal Cats count = "
                + Cat.getCatCounter() + "\nTotal Dogs count = " + Dog.getDogCounter() + "\nTotal Dead Cats Counter: " + Cat.getDeadCatCounter());


    }


}
