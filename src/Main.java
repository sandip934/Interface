//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     /*  Engineering e1 = new Engineering(11,"ABC","Mechanical",6);
        e1.assignment();
        e1.attendance();

        Medical m1 = new Medical(10,"XYZ","BDS");
        m1.assignment();
        m1.attendance();

        Otherstudent o1 = new Otherstudent("GHR","Java");
        o1.assignment();
        o1.assignment();
           */



       Rule r1 = null;

        r1 = new Engineering(210001, "Rohini", "IT", 6);
        r1.assignment();
        r1.attendance();

        System.out.println();

        r1 = new Medical(21003, "Maithilee", "MBBS");
        r1.attendance();
        r1.assignment();

        System.out.println();

        r1 = new Otherstudent("Sushant","Marathi");
        r1.assignment();
        r1.attendance();





    }
}