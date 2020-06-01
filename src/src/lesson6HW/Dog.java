package lesson6HW;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color,age);
    }


    @Override
    public void run(int surfWay) {
        if (surfWay <= 500) {
            System.out.println(name + " пробежал " + surfWay + " м");
        } else {
            System.out.println(name + " не выдержал и сдох!");
        }
    }

    @Override
    public void swim (int waterfWay) {
        if (waterfWay <= 10) {
            System.out.println(name + " проплыл  " + waterfWay + " м");
        } else {
            System.out.println(name + " пошел на корм рыбам!");
        }

    }


}

