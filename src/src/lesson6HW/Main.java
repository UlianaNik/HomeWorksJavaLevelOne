package lesson6HW;

public class Main {
    public static void main(String[] args) {

       Animal cat = new Cat("KOTe", "red", 1);
       Animal dog = new Dog("bulDOG", "green", 13);


        Animal[] animals = {cat, dog};

        for (int i = 1; i < animals.length ; i++) {
            i++;
            System.out.println("Создано " + i + " животных");
        }


        cat.run(100);
        dog.run (20);
        dog.swim(30);
        cat.swim(150);

    }
}
