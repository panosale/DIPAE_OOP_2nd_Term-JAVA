package ergastirio5;

public class MyUtils {
    //1.  Seiriaki anazitisi
    public static int anazitisiMeEpwnymo(Foititis[] foitArray, String foit2Search) {
        for (int i = 0; i < foitArray.length; i++)
            if (foitArray[i].getLastName().equals(foit2Search))
                return i;
        return -1;
    }

    public static int diadikiAnazitisiMeAM(Foititis[] foitArray, short amFoit2Search) {
        int pos = -1;
        int start, mid, end;
        start = 0;
        end = foitArray.length - 1;
        while (start <= end && pos == -1) {
            mid = (start + end) / 2;
            if (foitArray[mid].getAM() == amFoit2Search)
                pos = mid;
            else if (foitArray[mid].getAM() < amFoit2Search)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return pos;
    }

    public static int anadromikiDiadikiAnazitisiMeAM(Foititis[] foitArray, short amFoit2Search, int start, int end) {
        if (start > end)
            return -1;
        int mid = (start + end) / 2;
        if (foitArray[mid].getAM() < amFoit2Search)
            return anadromikiDiadikiAnazitisiMeAM(foitArray, amFoit2Search, mid + 1, end);
        else if (foitArray[mid].getAM() > amFoit2Search)
            return anadromikiDiadikiAnazitisiMeAM(foitArray, amFoit2Search, start, mid - 1);
        else
            return mid;
    }
    public static void insertSortAM(Foititis[] foitArray) {
        int i, position;
        short currentAM, tmpEtosEisagogis;
        String tmpFirstNama, tmpLastName;
        for (i = 1; i < foitArray.length; i++) {
            // Apothikefsi timon se prosorines metavlites gia xrisi parakto
            currentAM = foitArray[i].getAM();
            tmpFirstNama = foitArray[i].getFirstName();
            tmpLastName = foitArray[i].getLastName();
            tmpEtosEisagogis = foitArray[i].getEtosEisagogis();
            position = i;
            while (position > 0 && foitArray[position - 1].getAM() > currentAM) {
                foitArray[position].setAM(foitArray[position - 1].getAM());
                foitArray[position].setFirstName(foitArray[position - 1].getFirstName());
                foitArray[position].setLastName(foitArray[position - 1].getLastName());
                foitArray[position].setEtosEisagogis(foitArray[position - 1].getEtosEisagogis());
                position--;
            }
            // Xrisi ton prososrinon metavliton gia kataxorisi tous sti nea tous thesi ston pinaka (position)
            foitArray[position].setAM(currentAM);
            foitArray[position].setFirstName(tmpFirstNama);
            foitArray[position].setLastName(tmpLastName);
            foitArray[position].setEtosEisagogis(tmpEtosEisagogis);
        }
    }
}

