public class Student extends Person {

    private int klasa;
    private String zachowanie;

    public Student(String firstName, String lastName, int age, int klasa, String zachowanie) {
        super(firstName, lastName, age);
        this.klasa = klasa;
        this.zachowanie = zachowanie;
    }

    public int getKlasa() {
        return klasa;
    }

    public void setKlasa(int klasa) {
        this.klasa = klasa;
    }

    public String getZachowanie() {
        return zachowanie;
    }

    public void setZachowanie(String zachowanie) {
        this.zachowanie = zachowanie;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + klasa + " " + zachowanie;
    }
}