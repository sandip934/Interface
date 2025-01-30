public class Engineering implements Rule {
    private int id;
    private String name;
    private String branch;
    private int subjects;

    public Engineering() {
        id = 10;
        name = null;
        branch = null;
        subjects = 4;
    }

    public Engineering(int id, String name, String branch, int subjects) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.subjects = subjects;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    public int getSubjects() {
        return subjects;
    }

    public void display() {
        System.out.println(id + " " + name + " " + branch + " " + subjects);
    }

    @Override
    public void assignment() {
        System.out.println("Students have to complete at least 10 assignments");
    }

    @Override
    public void attendance() {
        System.out.println("75% attendance is compulsory");
    }
}
