abstract class Transaction {
    private int id;
    private String code;
    
    // Default constructor
    public Transaction() {}
    
    // Μέθοδοι get, set & toString
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "id= " + id + ", code= '" + code + '\'';
    }
}
