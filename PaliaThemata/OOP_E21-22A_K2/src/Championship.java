// ΘΕΜΑ 3
public class Championship {
    private String cName;
    private int teamNo;
    public Championship() {} // default constructor
    public Championship(String n, int t) {
        this.cName = n;
        this.teamNo = t;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    @Override
    public String toString() {
        return "Champion: " + this.cName + ", Teams: " + this.teamNo;
    }
}
