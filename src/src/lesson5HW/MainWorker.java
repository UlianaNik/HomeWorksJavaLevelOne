package lesson5HW;

public class MainWorker {
    public static void main(String[] args) {

//        Worker worker1 = new Worker("Maik Vazovsky", "inspector", "vazovsky@mail.mo", 122255, 12500, 32);

//        worker1.infoWorker();

        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Maik Vazovsky", "inspector", "vazovsky@mail.mo", 122255, 12500, 32);
        workArray[1] = new Worker("Bear Mad", "White bear", "wbear@mail.mo", 122244, 22500, 45);
        workArray[2] = new Worker("Fox Thief", "RedRobber", "foxfoxvsky@mail.mo", 122245, 50000, 25);
        workArray[3] = new Worker("Rabbit Cut", "Jogger", "rabbit@mail.mo", 122200, 12500, 41);
        workArray[4] = new Worker("Wolf Dark", "boss", "Mainboss@mail.mo", 155555, 112500, 57);

        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i].getAge()
                    > 40) {
                System.out.println("Этот сотрудник старше 40 л");
               workArray[i].infoWorker();
            }
            
        }
    }
}
