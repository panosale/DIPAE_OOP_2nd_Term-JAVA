package ergastirio8;

// Endiamesi klasi gia xrisi ton abstract methodon se diaforetikes ypoklasis
abstract class MyVehicle extends Vehicle{

    // Default Constructor
    public MyVehicle() { super(); }
    abstract void drive();

    // Gia xrisi stin klasi Car
    abstract short getArithmosThyron();
    abstract void setArithmosThyron(short new_arithmosThyron);

    abstract short getArithmosAksonon();
    abstract void setArithmosAksonon(short new_arithmosAksonon);

    abstract boolean getDiatheteiPlainoOxima();
    abstract void setDiatheteiPlainoOxima(boolean new_diatheteiPlainoOxima);
    }
