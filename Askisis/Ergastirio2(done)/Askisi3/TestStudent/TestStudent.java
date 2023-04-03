public class TestStudent {
// ASKISI 3 - ARXI
    // Eisagogi foititi sti thesi [pos] tou pinaka lab
    static void insertStudent(Student[] lab, Student st, int pos) {
        lab[pos].setAM(st.getAM());
        lab[pos].setFirstName(st.getFirstName());
        lab[pos].setLastName(st.getLastName());
        lab[pos].setArithmosApousion(st.getArithmosApousion());
        lab[pos].setVathmosTheorias(st.getVathmosTheorias());
        lab[pos].setVathmosErgastiriou(st.getVathmosErgastiriou());
        lab[pos].setVathmosTheorias(st.getVathmosTheorias());
    }
    // Emfanisi pinaka lab
    static void displayLab(Student[] lab) {
        for (int i =0; i < lab.length; i++)
            System.out.println(lab[i]);
    }
    // Ypologismos kai emfanisi ton foititon pou perasan
    static void passed(Student[] lab) {
        int students_passed = 0;
        for (int i =0; i < lab.length; i++)
            if (lab[i].computeFinal() >= 5)
                students_passed++;
        System.out.println("Oi foitites pou perasan einai: " + students_passed);
    }
    // Ypologismos kai emfanisi Mesou Orou telikis vathmologias olon ton foititon tou lab
    static void avgStudents(Student[] lab) {
        double avgVathmon = 0;
        for (int i =0; i < lab.length; i++)
                avgVathmon = avgVathmon + lab[i].computeFinal();
        avgVathmon = avgVathmon / lab.length;
        System.out.println("O Mesos oros ton vathmologion einai: " + avgVathmon);
    }
    // Evresi tis thesei ston pinaka lab tou mathiti me ton kalytero vathmo
    static int bestStudent(Student[] lab) {
        int max_pos = 0;
        for (int i =0; i < lab.length; i++)
            if (lab[i].computeFinal() > lab[max_pos].computeFinal())
                max_pos = i;
        return max_pos;
    }
// ASKISI 3 - TELOS
    public static void main(String[] args) {
        int n, i;
        Student tempStudent = new Student();
        System.out.print("Dose to megethos tou ergastiriou: ");
        n = UserInput.getInteger();
        Student[] lab = new Student[n];
/* */
        for (i = 0; i < n; i++) {
            // Eisagogi stoixeion foititon apo ton xristi stin prosorini metavliti tempStudent
            System.out.print("Dose ton AM tou foititi " + i + ": ");
            tempStudent.setAM(UserInput.getString());
            System.out.print("Dose to Onoma tou foititi " + i + ": ");
            tempStudent.setFirstName(UserInput.getString());
            System.out.print("Dose to Epitheto tou foititi " + i + ": ");
            tempStudent.setLastName(UserInput.getString());
            System.out.print("Dose ton Arithmo Apousion tou foititi " + i + ": ");
            tempStudent.setArithmosApousion(UserInput.getInteger());
            System.out.print("Dose ton Vathmo Ergastiriou tou foititi " + i + ": ");
            tempStudent.setVathmosErgastiriou(UserInput.getDouble());
            System.out.print("Dose to Vathmo Theorias tou foititi " + i + ": ");
            tempStudent.setVathmosTheorias(UserInput.getDouble());
            // Eisagogi tou tempStudent sti thesi i tou pinaka lab
            lab[i] = new Student();
            insertStudent(lab, tempStudent, i);
            System.out.println();
        }
        // Emfanisi foititon/trion tou ergastiriou
        displayLab(lab);
        System.out.println();
        // Foitites/ries me vathmo megalytero h iso tou 5
        passed(lab);
        // Mesos oros ton vathmologion tou ergastiriou
        avgStudents(lab);
        System.out.println("O/H foititis/ria me ton megalytero vathmo einai: ");
        System.out.println(lab[bestStudent(lab)].toString());
    }
}
