public class Teacher extends Student{

    String car;

    public Teacher(String firstName, String lastName, int age, String car) {
        super(firstName, lastName, age,0);
        this.car = car;
    }


    @Override
    void showInfo() {
        System.out.println(firstName + " " + lastName + " " + age + " " + car);
    }
}
