public class School {
    public static void main(String[] args) {
        Teacher teacher= new Teacher("Jan","kowalki",35,"yes");
        Student student =new Student("Kasia","pak",14,5);

        student.showInfo();
        teacher.showInfo();
    }
}
