public class Student {
    private String AM;
    private String FirstName;
    private String LastName;
    private int ArithmosApousion;
    private double VathmosErgastiriou;
    private double VathmosTheorias;

    // Initialize object with null values
    public Student() {
    }
    // Initialize object with some new values
    public Student(String new_AM, String new_firstName, String new_lastName){
        this (new_AM, new_firstName, new_lastName, 0, 0.0, 0.0);
    }
    // Initialize object with given values
    public Student(String arMitroou, String firstName, String lastName, int arithmosApousion,
                   double vathmosErgastiriou, double vathmosTheorias) {
        this.AM = arMitroou;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.ArithmosApousion = arithmosApousion;
        this.VathmosErgastiriou = vathmosErgastiriou;
        this.VathmosTheorias = vathmosTheorias;
    }
    // Get-Set AM
    public String getAM()
    {
        return this.AM;
    }
    public void setAM(String arMitroou)
    {
        this.AM = arMitroou;
    }

    // Get-Set First name
    public String getFirstName()
    {
        return this.FirstName;
    }
    public void setFirstName(String firstName)
    {
        this.FirstName = firstName;
    }

    // Get-Set Last name
    public String getLastName()
    {
        return this.LastName;
    }
    public void setLastName(String lastName)
    {
        this.LastName = lastName;
    }

    // Get-Set Arithmos Apousion
    public int getArithmosApousion()
    {
        return this.ArithmosApousion;
    }
    public void setArithmosApousion(int arithmosApousion)
    {
        this.ArithmosApousion = arithmosApousion;
    }
    // Get-Set Vathmos Ergastiriou

    public double getVathmosErgastiriou()
    {
        return this.VathmosErgastiriou;
    }
    public void setVathmosErgastiriou(double vathmosErgastiriou)
    {
        this.VathmosErgastiriou = vathmosErgastiriou;
    }

    // Get-Set Vathmos Theorias
    public double getVathmosTheorias()
    {
        return this.VathmosTheorias;
    }
    public void setVathmosTheorias(double vathmosTheorias)
    {
        this.VathmosTheorias = vathmosTheorias;
    }

    // Convert all attributes to Sting
    public String toString()
    {
        String tmp_toString;
        tmp_toString = "AM: " + AM + "\nFirst name: " + FirstName + "\nLast name: " + LastName +
                "\nArihtmos apousion: " + ArithmosApousion + "\nVathmos ergastiriou: " + VathmosErgastiriou +
                "\nVathmos theorias: " + VathmosTheorias;
        return tmp_toString;
    }

    // Return final degree
    public double computeFinal()
    {
        return (this.VathmosErgastiriou * 0.30) + (this.VathmosTheorias * 0.70);
    }
}