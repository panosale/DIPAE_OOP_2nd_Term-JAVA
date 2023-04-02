public class TestEmployee {
    static void FindLowSalary(Employee empl1, Employee empl2) {
        Boolean tmp_empl1, tmp_empl2;
        tmp_empl1 = (empl1.getVasikosMisthos() < 1200.0) && (empl1.getEtiApasxolisis() > 5);
        tmp_empl2 = (empl2.getVasikosMisthos() < 1200.0) && (empl2.getEtiApasxolisis() > 5);
        if (tmp_empl1) {
            System.out.println(empl1.getFirstName() + " " + empl1.getLastName() + " exei xamilotero eisodima (" + empl1.getVasikosMisthos() + ").");
            System.out.println("Afksisi vasikou misthou kata 100 euros.");
            empl1.setVasikosMisthos(empl1.getVasikosMisthos() + 100);
            System.out.println("Neos vasikos misthos " + empl1.getVasikosMisthos());
            System.out.println("Neos telikos misthos " + empl1.Salary());
        }
        if (tmp_empl2) {
            System.out.println(empl2.getFirstName() + " " + empl2.getLastName() + " exei xamilotero eisodima (" + empl2.getVasikosMisthos() + ").");
            System.out.println("Afksisi vasikou misthou kata 100 euros.");
            empl2.setVasikosMisthos(empl2.getVasikosMisthos() + 100);
            System.out.println("Neos vasikos misthos " + empl2.getVasikosMisthos());
            System.out.println("Neos telikos misthos " + empl2.Salary());
        }
    }
    public static void main(String[] args) {

    Employee e1, e2;
    // Arxikopoiisi neon antikeimenon me prokathorismenes times
    e1 = new Employee("200", "Eleni", "Papadopoulou", 1500.00, 10, 300.00);
    e2 = new Employee("201", "Panagiotis", "Alevropoulos", 1000.00, 13, 500.00);
/*
    // Eisagogi stoixeion apo ton xristi
    System.out.print("Give AM: ");
    e1.setAM(UserInput.getString());
    System.out.print("Give first name: ");
    e1.setFirstName(UserInput.getString());
    System.out.print("Give last name: ");
    e1.setLastName(UserInput.getString());
    System.out.print("Give vasikos misthos: ");
    e1.setVasikosMisthos(UserInput.getDouble());
    System.out.print("Give eti apasxolisis: ");
    e1.setEtiApasxolisis(UserInput.getInteger());
    System.out.print("Give bonus: ");
    e1.setBonus(UserInput.getDouble());


    System.out.print("Give AM: ");
    e2.setAM(UserInput.getString());
    System.out.print("Give first name: ");
    e2.setFirstName(UserInput.getString());
    System.out.print("Give last name: ");
    e2.setLastName(UserInput.getString());
    System.out.print("Give vasikos misthos: ");
    e2.setVasikosMisthos(UserInput.getDouble());
    System.out.print("Give eti apasxolisis: ");
    e2.setEtiApasxolisis(UserInput.getInteger());
    System.out.print("Give bonus: ");
    e2.setBonus(UserInput.getDouble());
*/

    System.out.println(e1);
    // OR System.out.println(e1.toString());
    System.out.println("Telikos misthos: " + e1.Salary());
    System.out.println("***************");

    System.out.println(e2.toString());
    System.out.println("Telikos misthos: " + e2.Salary());
    System.out.println("***************");

    FindLowSalary(e1, e2);
    }
}
