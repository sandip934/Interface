public class Medical implements Rule {
    private int id;
    private String name;
    private String specialist;

    public Medical() {
        id = 11;
        name = null;
        specialist = null;
    }

    public Medical(int id, String name, String specialist) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
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

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void display() {
        System.out.println(id + " " + name + " " + specialist);
    }

    @Override
    public void assignment() {
        System.out.println("Assignments are compulsory");
    }

    @Override
    public void attendance() {
        System.out.println("70% attendance is compulsory");
    }
}
