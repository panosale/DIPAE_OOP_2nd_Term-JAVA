// Klironomikotita - Eidikefsi
package ergastirio7_3;

import java.text.DecimalFormat;

public class TestEmployee {
    static void displayStaff(Ypallilos[] emp) {
        for (int i = 0; i < emp.length; i++)
            System.out.println(emp[i].toString());
    }
    public static void main(String[] args) {
        // Dilosi antikeimenon ypallhlon kai kataxorisi ton stoixeion tous
        Oromisthios oromisthios1 = new Oromisthios("15","Nikolaou Kostas", "Monastiriou 10","Grammateas" , 160 );
        Oromisthios oromisthios2 = new Oromisthios("213","Georgiadou Katerina", "Martio 134","Texnikos" ,164 );
        Misthotos misthotos1 = new Misthotos("2074", "Dimitriadou Maria", "Egnatias 325", "Michanikos", (short)3,(short)1);
        Misthotos misthotos2 = new Misthotos("5638", "Aliagas Nikos", "Tsimiski 45", "Politis", (short)12,(short)2);
        Proistamenos proistamenos1 = new Proistamenos("93", "Georgiou Petros", "Giannitson 1", "Michanikos", (short)12, (short)2);
        Proistamenos proistamenos2 = new Proistamenos("102", "Papadopoulou Konstantina", "M. Aleksandrou 175","Architektonas", (short)8, (short)2);

        // Emfanisi stoixeion ypallhlon
        System.out.println(oromisthios1 + "\n------------------------");
        System.out.println(oromisthios2 + "\n------------------------");
        System.out.println(misthotos1 + "\n------------------------");
        System.out.println(misthotos2 + "\n------------------------");
        System.out.println(proistamenos1 + "\n------------------------");
        System.out.println(proistamenos2 + "\n------------------------");
    }
}
