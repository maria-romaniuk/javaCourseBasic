package lessons.lesson15;

public class Firma {

    String chef;

    Departments departments;

    public Firma(String chef, Departments departments) {
        this.chef = chef;
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "chef='" + chef + '\'' +
                ", departments=" + departments +
                '}';
    }
}
