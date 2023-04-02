public class TestStudentLab {
    // Eisagogi foititi sti thesi [pos] tou pinaka lab
    static void insertStudent(StudentLab lab, Student st, int pos) {
        //lab = new StudentLab(st);
        lab.addEntryToLab(st);
/*        lab.addEntryToLab(pos);
        lab..setAM(st.getAM());
        lab[pos].setFirstName(st.getFirstName());
        lab[pos].setLastName(st.getLastName());
        lab[pos].setArithmosApousion(st.getArithmosApousion());
        lab[pos].setVathmosTheorias(st.getVathmosTheorias());
        lab[pos].setVathmosErgastiriou(st.getVathmosErgastiriou());
        lab[pos].setVathmosTheorias(st.getVathmosTheorias());

 */
    }
    // Emfanisi pinaka lab
    static void displayLab(Student lab) {
//        for (int i =0; i < lab.length; i++)
//            System.out.println(lab[i]);
    }
    // Ypologismos kai emfanisi ton foititon pou perasan
// ASKISI 3 - TELOS
    public static void main(String[] args) {
        int n, i;
        Student tempStudent = new Student();
        System.out.print("Dose to megethos tou ergastiriou: ");
        n = UserInput.getInteger();
        StudentLab studLab = new StudentLab();
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
            insertStudent(studLab, tempStudent, i);
            System.out.println();
        }
        // Emfanisi foititon/trion tou ergastiriou
//        displayLab(studLab);
        System.out.println();
        // Foitites/ries me vathmo megalytero h iso tou 5
//        passed(lab);
        // Mesos oros ton vathmologion tou ergastiriou
//        avgStudents(lab);
        System.out.println("O/H foititis/ria me ton megalytero vathmo einai: ");
//        System.out.println(lab[bestStudent(lab)].toString());
    }
}
