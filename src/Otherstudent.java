public class Otherstudent implements Rule {
    private String name;
    private String subjects;

    public Otherstudent() {
        name = null;
        subjects = null;
    }

    public Otherstudent(String name, String subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }

    public void display() {
        System.out.println(name + " " + subjects);
    }

    @Override
    public void assignment() {
        System.out.println(name + " is working on an assignment");
    }

    @Override
    public void attendance() {
        System.out.println("Attendance is important for " + name);
    }
}
