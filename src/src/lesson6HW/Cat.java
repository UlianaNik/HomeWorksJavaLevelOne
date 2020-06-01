package lesson6HW;

public class Cat extends Animal {
    public Cat (String name, String color, int age) {
        super(name, color,age);
    }


    @Override
    public void run(int surfWay) {

        if (surfWay <= 200) {
            System.out.println(name + "пробежал " + surfWay + " м");
        } else {
            System.out.println(name + " не выдержал и сдох!");
        }
    }

    @Override
    public void swim(int waterWay) {
        System.out.println(name + " can't swim!!!");
    }
}
