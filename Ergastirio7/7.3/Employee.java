// Klironomikotita - Eidikefsi
package ergastirio7.3;

public class Employee {
    private String AM;
    private String firstName;
    private String lastName;
    private double vasikosMisthos;
    private int etiApasxolisis;
    private double bonus;

    public Employee() {
    }
    public Employee(String new_AM, String new_firstName, String new_lastName, double new_vasikosMisthos, int new_etiApasxolisis, double new_bonus) {
        this.AM = new_AM;
        this.firstName = new_firstName;
        this.lastName = new_lastName;
        this.vasikosMisthos = new_vasikosMisthos;
        this.etiApasxolisis = new_etiApasxolisis;
        this.bonus = new_bonus;
    }

    public void ShowEmployee() {
        System.out.println("AM: " + AM);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Vasikos misthos: " + vasikosMisthos);
        System.out.println("Eti apasxolisis: " + etiApasxolisis);
        System.out.println("Bonus: " + bonus);
    }
    // Set-Get AM
    public void setAM(String new_AM) {
        this.AM = new_AM;
    }
    public String getAM() {
        return this.AM;
    }
    // Set-Get first name
    public void setFirstName(String new_firstName) {
        this.firstName = new_firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    // Set-Get last name
    public void setLastName(String new_lastName) {
        this.lastName = new_lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    // Set-Get Vasikos Misthos
    public void setVasikosMisthos(double new_vasikosMisthos) {
        this.vasikosMisthos = new_vasikosMisthos;
    }
    public double getVasikosMisthos() {
        return this.vasikosMisthos;
    }
    // Set-Get Eti Apasxolisis
    public void setEtiApasxolisis(int new_etiApasxolisis) {
        this.etiApasxolisis = new_etiApasxolisis;
    }
    public int getEtiApasxolisis() {
        return this.etiApasxolisis;
    }
    // Set-Get Bonus
    public void setBonus(double new_Bonus) {
        this.bonus = new_Bonus;
    }
    public double getBonus() {
        return this.bonus;
    }

    // Return all attributes in one string
    public String toString() {
//        String tmp_string;
//        tmp_string = this.AM + ", " + this.firstName + " " + this.lastName + ", " + this.vasikosMisthos + ", " + this.etiApasxolisis + ", " + this.bonus;
        return ("AM: " + this.AM + "\nOnoma: " + this.firstName + "\nEponimo: " + this.lastName + "\nVasikos misthos: " + this.vasikosMisthos +
                "\nEti apasxolisis: " + this.etiApasxolisis + "\nBonus: " + this.bonus);
    }

    // Calculate salary
    public double Salary() {
        double  telikosMisthos;
        telikosMisthos = this.vasikosMisthos + this.etiApasxolisis * 10 + this.bonus;
        return telikosMisthos;
    }
}
