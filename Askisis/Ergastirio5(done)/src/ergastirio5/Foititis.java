package ergastirio5;

public class Foititis {
    private short AM;
    private String FirstName;
    private String LastName;
    private short EtosEisagogis; // Na allaxtei se short

    // Initialize object with null values
    public Foititis() {
    }

    // Initialize object with some given values
    public Foititis(String new_firstName, String new_lastName) {
        this((short) 0, new_firstName, new_lastName, (short) 0);
    }

    // Initialize object with given values
    public Foititis(short new_arMitroou, String new_firstName, String new_lastName, short new_etosEisagogis) {
        this.AM = new_arMitroou;
        this.FirstName = new_firstName;
        this.LastName = new_lastName;
        this.EtosEisagogis = new_etosEisagogis;
    }

    // Get-Set AM
    public short getAM() {
        return this.AM;
    }

    public void setAM(short arMitroou) {
        this.AM = arMitroou;
    }

    // Get-Set First name
    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    // Get-Set Last name
    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    // Get-Set Etos Eisagogis
    public short getEtosEisagogis() {
        return this.EtosEisagogis;
    }

    public void setEtosEisagogis(short etosEisagogis) {
        this.EtosEisagogis = etosEisagogis;
    }

    // Convert all attributes to Sting
    public String toString() {
        String tmp_toString;
        tmp_toString = "AM: " + AM + "\nFirst name: " + FirstName + "\nLast name: " + LastName +
                "\nEtos eisagogis: " + EtosEisagogis;
        return tmp_toString;
    }
}