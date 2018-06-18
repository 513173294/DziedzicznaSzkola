public class Teacher extends Person {

    private String stopien;

    public Teacher(String firstName, String lastName, int age, String stopien) {
        super(firstName, lastName, age);
        this.stopien = stopien;
    }

    public String getStopien() {
        return stopien;
    }

    public void setStopien(String stopien) {
        this.stopien = stopien;
    }

    @Override
    public String toString() {
        return super.toString() + " " + stopien;
    }
}
