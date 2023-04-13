package ergastirio5;

public class MyUtils {
    // Swap foititon
    public static void swapFoitites(Foititis foit1, Foititis foit2) {
        short tmpAM, tmpEtosEisagogis;
        String tmpFirstName, tmpLastName;

        tmpAM = foit1.getAM();
        tmpFirstName = foit1.getFirstName();
        tmpLastName = foit1.getLastName();
        tmpEtosEisagogis = foit1.getEtosEisagogis();

        foit1.setAM(foit2.getAM());
        foit1.setFirstName(foit2.getFirstName());
        foit1.setLastName(foit2.getLastName());
        foit1.setEtosEisagogis(foit2.getEtosEisagogis());

        foit2.setAM(tmpAM);
        foit2.setFirstName(tmpFirstName);
        foit2.setLastName(tmpLastName);
        foit2.setEtosEisagogis(tmpEtosEisagogis);
    }
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
    public static void selectSortEponymo(Foititis[] foitArray) {
        int i, j, min;
        for (i = 0; i < foitArray.length; i++) {
            min = i;
            for (j = i + 1; j < foitArray.length; j++)
                if (foitArray[j].getLastName().compareTo(foitArray[min].getLastName()) < 0)
                    min = j;
            swapFoitites(foitArray[min], foitArray[i]);
        }
    }
}

