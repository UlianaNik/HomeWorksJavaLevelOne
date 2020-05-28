package lesson5HW;

public class Worker {

    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
   private int age;


    public Worker(String fullName, String position, String email, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

      public void infoWorker() {
        System.out.println(fullName + " " + position + " " + email + " " + phoneNumber + " " + salary + " " + age + " "+ "years" );
    }



}
