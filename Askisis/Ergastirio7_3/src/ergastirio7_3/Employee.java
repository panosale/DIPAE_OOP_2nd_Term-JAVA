// Klironomikotita - Eidikefsi
package ergastirio7_3;

public class Employee {
    private String AM;
    private String name;
    private String eidikotita;
    private String diefthinsiKatoikias;
    // Default constructor
    public Employee() {
    }
    // Full constructor
    public Employee(String new_AM, String new_name, String new_eidikotita, String new_diefthinsiKatoikias) {
        this.AM = new_AM;
        this.name = new_name;
        this.eidikotita = new_eidikotita;
        diefthinsiKatoikias = new_diefthinsiKatoikias;
    }

    public void ShowEmployee() {
        System.out.println("AM: " + AM);
        System.out.println("Name: " + name);
        System.out.println("Eidikotita: " + eidikotita);
        System.out.println("Diefthinsi Katoikias: " + diefthinsiKatoikias);
    }
    // Set-Get AM
    public void setAM(String new_AM) {
        this.AM = new_AM;
    }
    public String getAM() {
        return this.AM;
    }
    // Set-Get name
    public void setName(String new_name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    // Set-Get eidikotita
    public void setEidikotita(String new_eidikotita) {
        this.eidikotita = new_eidikotita;
    }
    public String getEidikotita() {
        return this.eidikotita;
    }
    // Set-Get diefthinsi katoikias
    public void setDiefthinsiKatoikias(String new_diefthinsiKatoikias) {
        this.eidikotita = new_diefthinsiKatoikias;
    }
    public String getDiefthinsiKatoikias() {
        return this.diefthinsiKatoikias;
    }
    // Return all attributes in one string
    public String toString() {
        return ("AM: " + this.AM + "\nOnoma: " + this.name + "\nEidikotia: " + this.eidikotita + "\nDiefthinsi Katoikias: " + this.diefthinsiKatoikias);
    }
    // Calculate salary
//    public double Salary() {
//        double  telikosMisthos;
//        telikosMisthos = this.vasikosMisthos + this.etiApasxolisis * 10 + this.bonus;
//        return telikosMisthos;
//    }
}
