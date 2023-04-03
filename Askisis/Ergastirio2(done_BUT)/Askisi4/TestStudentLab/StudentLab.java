// ASKISI 4 - ARXI
public class StudentLab {
    private final int MAX_LAB = 100 ; // Orismos tou megistou megethous tou pinaka StudentLab
    private int pos; // Krataei ti thesi tis teleftaias eisagogis sto lab
    private Student[] studLab;
    public StudentLab() {
        this.pos = 0; // Arxikopoiisi tis 1is thesis...
        studLab = new Student[MAX_LAB]; // ...kai tou pinaka studLab
    }
    public int getMAX_LAB() {
        return MAX_LAB;
    }
    public void addEntryToLab(Student newStudent) {
        // System.out.println("------> prv pos: " + this.pos); // Gia dokimes kai diagtrafi
        if (this.pos < this.MAX_LAB) { // Elegxos an exei kseperastei to megisto megethos tou pinaka studLab, se periptosi pou den ginetai elegxos sto kyrios programma.
            this.studLab[this.pos] = new Student();
            this.studLab[this.pos].setAM(newStudent.getAM());
            this.studLab[this.pos].setFirstName(newStudent.getFirstName());
            this.studLab[this.pos].setLastName(newStudent.getLastName());
            this.studLab[this.pos].setArithmosApousion(newStudent.getArithmosApousion());
            this.studLab[this.pos].setVathmosErgastiriou(newStudent.getVathmosErgastiriou());
            this.studLab[this.pos].setVathmosTheorias(newStudent.getVathmosTheorias());
            // this.showLabStudents(); // Gia dokimes kai diagtrafi
            this.pos++;
            // System.out.println("------->new pos= " + this.pos); // Gia dokimes kai diagtrafi
        }
        else { // An exei kseperastei to megisto megethos tou pinaka studLab emfanizei katallilo minima
            System.out.println("Maximum length of Lab reached [" + this.MAX_LAB +  "].\nNo more students can be added.");
        }
    }
    public void passed() {
        int students_passed = 0;
        for (int i = 0; i < this.pos; i++)
            if (studLab[i].computeFinal() >= 5)
                students_passed++;
        System.out.println("Oi foitites pou perasan einai: " + students_passed);
    }
    // Ypologismos kai emfanisi Mesou Orou telikis vathmologias olon ton foititon tou lab
    public void avgStudents() {
        double avgVathmon = 0;
        for (int i = 0; i < this.pos; i++)
            avgVathmon = avgVathmon + studLab[i].computeFinal();
        avgVathmon = avgVathmon / this.pos;
        System.out.println("O Mesos oros ton vathmologion einai: " + avgVathmon);
    }
    // Evresi tis thesei ston pinaka lab tou mathiti me ton kalytero vathmo
    public int findBestStudentPosition() {
        int max_pos = 0;
        for (int i =0; i < this.pos; i++)
            if (studLab[i].computeFinal() > studLab[max_pos].computeFinal())
                max_pos = i;
        return max_pos;
    }
    // Emfanisi stoixeion enos foititi
    public String showStudentFromLab(int pos) {
        return this.studLab[pos].toString();
    }
    // Emfanisi Lab gia dokimastikous logous
    public void showLabStudents() {
        for (int i =0 ; i < this.pos; i++)
            System.out.println("|<-----Arxi eggrafis: " + i + "----->|\n" + this.studLab[i].toString() + "\n|<-----Telos eggrafis: " + i + "----->|");
    }
}
