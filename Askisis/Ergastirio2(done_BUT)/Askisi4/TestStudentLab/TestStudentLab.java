public class TestStudentLab {
    public static void main(String[] args) {
        int n, i;
        Student tempStudent = new Student();
        System.out.print("Dose to megethos tou ergastiriou: ");
        n = UserInput.getInteger();
        StudentLab studLab = new StudentLab();
        // An o xristis dosei megethos pinaka megalytero apo to MAX_LAB tote h parakato epanallipsi stamataei molis ftasei to MAX_LAB
        for (i = 0; (i < n && i < studLab.getMAX_LAB()) ; i++) {
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
            // Eisagogi tou tempStudent stin epomeni elefhteri thesi  tou pinaka studLab
            studLab.addEntryToLab(tempStudent);
            System.out.println();
        }
        System.out.println("Ta stoixeia olon ton foititon tou ergastirioiu einai ta parakato:");
        studLab.showLabStudents();
        System.out.println("************************************");
        // Foitites/ries me vathmo megalytero h iso tou 5
        studLab.passed();
        System.out.println("************************************");
        // Mesos oros ton vathmologion tou ergastiriou
        studLab.avgStudents();
        System.out.println("************************************");
        // Emfanisi tis thesis tou kalyterou foititi ston pinaka Student Lab
        System.out.println("O/H foititis/ria me ton megalytero vathmo einai: \n" + studLab.showStudentFromLab(studLab.findBestStudentPosition()));
        System.out.println("************************************");
    }
}
