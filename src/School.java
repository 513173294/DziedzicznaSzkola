public class School {
    public static void main(String[] args) {
        Teacher teacher= new Teacher("Jan","Kowalski",50,"dr");
        Student student =new Student("Kasia","Bak",12,6,"dobre");

        System.out.println( student.toString());
        System.out.println( teacher.toString());

    }
}
