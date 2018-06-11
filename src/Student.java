public class Student {
    String firstName;
    String lastName;
    int age;
    int bestGrade;

    public Student(String firstName, String lastName, int age, int bestGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bestGrade = bestGrade;
    }

    void showInfo() {
        System.out.println(firstName + " " + lastName + " " + age + " " + bestGrade);
    }

}
