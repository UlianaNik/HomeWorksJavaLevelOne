package lesson6HW;

public abstract  class Animal {
     String name;
     String color;
        int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public abstract void run (int surfWay);

    public abstract void swim(int surfWa);

}
