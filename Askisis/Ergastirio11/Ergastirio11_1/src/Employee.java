public class Employee {
    private String name;
    private String birthDate;
    private short childNo;
    private double hourlyWage;
    private short workingHours[];
    private short overtime[];
    // Default constructor
    public Employee() {

    }
    // Full constructor
    public Employee(String new_name, String new_birthDate, short new_childNo, float new_hourlyWage) {
        this.name = new_name;
        this.birthDate = new_birthDate;
        this.childNo = new_childNo;
        this.hourlyWage = new_hourlyWage;
        this.workingHours = new short[12];
        this.overtime = new short[12];
        for (int i = 0; i < 12; i++) {
            this.workingHours[i] = 0;
            this.overtime[i] = 0;
        }

    }
    public double childBenefitFactor() {
        return (100 - (double)(50 / this.childNo)) / 200d;
    }
    public double computeMonthlyIncome(short month) {
        return ((this.workingHours[month - 1] + this.overtime[month - 1]) * this.hourlyWage * (1 + this.childBenefitFactor()));
    }
    // Get-Set methods
    public void setName(String new_name) {
        this.name = new_name;
    }
    public String getName() {
        return this.name;
    }
    public void setBirthDate(String new_birthDate) {
        this.birthDate = new_birthDate;
    }
    public String getBirthDate() {
        return this.birthDate;
    }
    public void setChildNo(short new_childNo) {
        this.childNo = new_childNo;
    }
    public short getChildNo() {
        return this.childNo;
    }
    public void setHourlyWage(double new_hourlyWage) {
        this.hourlyWage = new_hourlyWage;
    }
    public double getHourlyWage() {
        return this.hourlyWage;
    }
    public void setWorkingHours(short month, short new_workingHours) {
        this.workingHours[month - 1] = new_workingHours;
    }
    public short getWorkingHours(short month) {
        return this.workingHours[month - 1];
    }
    public void setOvertime(short month, short new_overtime) {
        this.overtime[month - 1] = new_overtime;
    }
    public short getOvertime(short month) {
        return this.overtime[month - 1];
    }
    public String toString() {
        return "Όνομα: " + this.name + ", Ημερομηνία γέννησης: " + this.birthDate + ", Αριθμός τέκνων: " + this.childNo + "\nΗμερομίσθιο: " + this.hourlyWage;
    }
}
