import java.util.Objects;

// Exceptions
// ergastirio 11.1
public class Employee {
    private String name;
    private String birthDate;
    private short childNo;
    private double hourlyWage;
    private double[] workingHours;
    private double[] overtime;
    // Constructors
    public Employee() {}
    public Employee(String new_name, String new_birthDate, short new_childNo, double new_hourlyWage) { //throws InvalidBirthDateException {
        this.name = new_name;
        this.setBirthDate(new_birthDate);
        this.setChildNo(new_childNo);
        this.hourlyWage = new_hourlyWage;
        this.workingHours = new double[12];
        this.overtime = new double[12];
        for (int i = 0; i < 12; i++) {
            this.workingHours[i] = 0;
            this.overtime[i] = 0;
        }
    }
    public Employee(String new_name, String new_birthDate, short new_childNo, double new_hourlyWage,
                    double[] new_workingHours, double[] new_overTime) {// throws InvalidBirthDateException {
        this.name = new_name;
        this.setBirthDate(new_birthDate);
        this.setChildNo(new_childNo);
        this.hourlyWage = new_hourlyWage;
        this.workingHours = new_workingHours;
        this.overtime = new_overTime;
    }
    public double childBenefitFactor() {// throws ArithmeticException {
        double tmpChildBenefitFactor = 0;
        try {
            tmpChildBenefitFactor = (100 - (double)(50 / this.childNo)) / 200d;
        } catch (ArithmeticException msg) {
            System.out.println("Number of children is 0. Child Benefit Factor set to: 0.");
            tmpChildBenefitFactor = 0;
        }
        return tmpChildBenefitFactor;
    }
    public double computeMonthlyIncome(short month) {// throws InvalidOvertimeException {
        return ((this.workingHours[month - 1] + this.overtime[month - 1]) * this.hourlyWage * (1 + this.childBenefitFactor()));
    }
    // Get-Set methods
    public void setName(String new_name) {
        this.name = new_name;
    }
    public String getName() {
        return this.name;
    }
    public void setBirthDate(String new_birthDate) {// throws InvalidBirthDateException {
        try {
            int day = Integer.parseInt(new_birthDate.substring(0, 2));
            if (day < 1 || day > 31)
                throw new InvalidBirthDateException();
            int month = Integer.parseInt(new_birthDate.substring(3, 5));
            if (month < 1 || month > 12)
                throw new InvalidBirthDateException();
            this.birthDate = new_birthDate;
        } catch (InvalidBirthDateException msg) {
            System.out.println(this.name + " birth date is wrong(" + new_birthDate + "). You have to set the birth date later.");
        }
    }
    public String getBirthDate() {
        return this.birthDate;
    }
    public void setChildNo(short new_childNo) {// throws IllegalArgumentException {
        try {
            if (new_childNo < 0)
                throw new IllegalArgumentException();
            this.childNo = new_childNo;
        } catch (IllegalArgumentException msg) {
            System.out.println("Child number cannot be negative (" + new_childNo + "). Child number will be set to 0.");
            this.childNo = 0;
        }
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
    public void setWorkingHours(short month, double new_workingHours) {
        this.workingHours[month - 1] = new_workingHours;
    }
    public double getWorkingHours(short month) {
        double tmp_workingHours = 0;
        try {
            if (month-1 < 0 || month-1 > 11)
                throw new ArrayIndexOutOfBoundsException();
            tmp_workingHours = this.workingHours[month - 1];
        } catch (ArrayIndexOutOfBoundsException msg) {
            System.out.println("΅Wrong month was given (" + month + ").");
        }
        return tmp_workingHours;
    }
    public void setOvertime(short month, double new_overtime) {
        try {
            if (new_overtime < 0 || new_overtime > 80)
                throw new InvalidOvertimeException();
            this.overtime[month - 1] = new_overtime;
        } catch (InvalidOvertimeException msg) {
            System.out.println("Overtime cannot be negative or exceed 80 hours. Overtime will be set to 0.");
            this.overtime[month - 1] = 0;
        }
    }
    public double getOvertime(short month) {
        return this.overtime[month - 1];
    }
    public String toString() {
        String s =  "Name: " + this.name + ", Birthdate: " + this.birthDate + ", Children number: " + this.childNo + "\nHourly wage: " + this.hourlyWage + "\nWorking hours pre month: ";
        for (int i = 0; i < this.workingHours.length; i++)
            s = s + workingHours[i] + ", ";
        s = s.substring(0, s.length()-2) + "\nOvertime per month: ";
        for (int i = 0; i < this.overtime.length; i++)
            s = s + overtime[i] + ", ";
        s = s.substring(0, s.length()-2) + ".";
        return s;
    }
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if (!Objects.equals(this.birthDate, ((Employee) obj).birthDate))
            return false;
        return true;
    }
}
