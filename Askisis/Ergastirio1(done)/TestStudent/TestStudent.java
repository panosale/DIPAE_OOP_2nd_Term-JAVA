public class TestStudent {
    static void compareThreeStudentMarks(Student s1, Student s2, Student s3)
    {
        double s1_telVathmos, s2_telVathmos, s3_telVathmos;
        s1_telVathmos = s1.computeFinal();
        s2_telVathmos = s2.computeFinal();
        s3_telVathmos = s3.computeFinal();
        System.out.print("1st student: ");
        if (s1_telVathmos > s2_telVathmos) {
            if (s1_telVathmos > s3_telVathmos) {
                System.out.println(s1.getFirstName() + " " + s1.getLastName() + ": " + s1_telVathmos);
                System.out.print("2nd student: ");
                if (s2_telVathmos > s3_telVathmos) {
                    System.out.println(s2.getFirstName() + " " + s2.getLastName() + ": " + s2_telVathmos);
                    System.out.print("3rd student: ");
                    System.out.println(s3.getFirstName() + " " + s3.getLastName() + ": " + s3_telVathmos);
                }
                else {
                    System.out.println(s3.getFirstName() + " " + s3.getLastName() + ": " + s3_telVathmos);
                    System.out.print("3rd student: ");
                    System.out.println(s2.getFirstName() + " " + s2.getLastName() + ": " + s2_telVathmos);
                }
            }
            else {
                System.out.println(s3.getFirstName() + " " + s3.getLastName() + ": " + s3_telVathmos);
                System.out.print("2nd student: ");
                System.out.println(s1.getFirstName() + " " + s1.getLastName() + ": " + s1_telVathmos);
                System.out.print("3rd student: ");
                System.out.println(s2.getFirstName() + " " + s2.getLastName() + ": " + s2_telVathmos);
            }
        }
        else {
            if (s2_telVathmos > s3_telVathmos) {
                System.out.println(s2.getFirstName() + " " + s2.getLastName() + ": " + s2_telVathmos);
                System.out.print("2nd student: ");
                if (s1_telVathmos > s3_telVathmos) {
                    System.out.println(s1.getFirstName() + " " + s1.getLastName() + ": " + s1_telVathmos);
                    System.out.print("3rd student: ");
                    System.out.println(s3.getFirstName() + " " + s3.getLastName() + ": " + s3_telVathmos);
                }
                else {
                    System.out.println(s3.getFirstName() + " " + s3.getLastName() + ": " + s3_telVathmos);
                    System.out.print("3rd student: ");
                    System.out.println(s1.getFirstName() + " " + s1.getLastName() + ": " + s1_telVathmos);
                }
            }
            else {
                System.out.println(s3.getFirstName() + " " + s3.getLastName() + ": " + s3_telVathmos);
                System.out.print("2nd student: ");
                System.out.println(s2.getFirstName() + " " + s2.getLastName() + ": " + s2_telVathmos);
                System.out.print("3rd student: ");
                System.out.println(s1.getFirstName() + " " + s1.getLastName() + ": " + s1_telVathmos);
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("2022005","Panos", "Alevropoulos", 1, 7.0, 9.0);
        Student s2 = new Student("2022015","Kostas", "Nikolaou"); //, 2, 4.0, 4.0);
        Student s3 = new Student("2022020","Eleni", "Papadopoulou", 0, 7.0, 6.0);

        //        Student s2 = new Student();

        System.out.println(s1);
        System.out.println("Telikos vathmos: " + s1.computeFinal());
        System.out.println();
        System.out.println(s2);
        System.out.println("Telikos vathmos: " + s2.computeFinal());
        System.out.println();
        System.out.println(s3);
        System.out.println("Telikos vathmos: " + s3.computeFinal());
        System.out.println();
        compareThreeStudentMarks(s3, s2, s1);

/*
        System.out.print("Give AM : ");
        s2.setAM(UserInput.getString());
        System.out.print("Give First Name : ");
        s2.setFirstName(UserInput.getString());
        System.out.print("Give Last Name : ");
        s2.setLastName(UserInput.getString());
        System.out.print("Give Arithmo Apousion : ");
        s2.setArithmosApousion(UserInput.getInteger());
        System.out.print("Give Vathmo Ergastiriou : ");
        s2.setVathmosErgastiriou(UserInput.getDouble());
        System.out.print("Give Vathmo Theorias : ");
        s2.setVathmosTheorias(UserInput.getDouble());
        System.out.println(s2.toString());
        System.out.println("Telikos vathmos: " + s2.computeFinal());
 */
    }
}
