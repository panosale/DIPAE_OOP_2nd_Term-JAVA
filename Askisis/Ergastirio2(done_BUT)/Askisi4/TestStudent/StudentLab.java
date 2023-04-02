// ASKISI 4 - ARXI
public class StudentLab extends Student {
    private int pos;
    private Student studLab[];

    public StudentLab() {
        pos = 0;
        studLab[pos] = new Student();
    }
    public StudentLab(Student newStudent) {
        System.out.println(pos);
//        studLab[pos] = new Student();
        studLab[pos] = newStudent;
        pos++;
        System.out.println(pos);
    }
    public void addEntryToLab(Student newStudent) {
        System.out.println(pos);
        studLab[pos] = new Student();
        studLab[pos] = newStudent;
        pos++;
        System.out.println(pos);
    }
    public int getLabSize() {
        return studLab.length;
    }
    public void passed() {
        int students_passed = 0;
        for (int i =0; i < studLab.length; i++)
            if (studLab[i].computeFinal() >= 5)
                students_passed++;
        System.out.println("Oi foitites pou perasan einai: " + students_passed);
    }
    // Ypologismos kai emfanisi Mesou Orou telikis vathmologias olon ton foititon tou lab
    public void avgStudents() {
        double avgVathmon = 0;
        for (int i =0; i < studLab.length; i++)
            avgVathmon = avgVathmon + studLab[i].computeFinal();
        avgVathmon = avgVathmon / studLab.length;
        System.out.println("O Mesos oros ton vathmologion einai: " + avgVathmon);
    }
    // Evresi tis thesei ston pinaka lab tou mathiti me ton kalytero vathmo
    public int bestStudent() {
        int max_pos = 0;
        for (int i =0; i < studLab.length; i++)
            if (studLab[i].computeFinal() > studLab[max_pos].computeFinal())
                max_pos = i;
        return max_pos;
    }
}
