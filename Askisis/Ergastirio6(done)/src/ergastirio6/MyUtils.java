package ergastirio6;

public class MyUtils {
    // Veltiomeni ekdosi tis Swap foititon
    public static void swapFoitites(Foititis foit1, Foititis foit2) {
        short tmpAM, tmpEtosEisagogis;
        String tmpFirstName, tmpLastName;

        tmpAM = foit1.getAM();
        tmpFirstName = foit1.getFirstName();
        tmpLastName = foit1.getLastName();
        tmpEtosEisagogis = foit1.getEtosEisagogis();

        foit1.setAllValuesToFoititis(foit2.getAM(), foit2.getFirstName(), foit2.getLastName(), foit2.getEtosEisagogis());
//        foit1.setAM(foit2.getAM());
//        foit1.setFirstName(foit2.getFirstName());
//        foit1.setLastName(foit2.getLastName());
//        foit1.setEtosEisagogis(foit2.getEtosEisagogis());

        foit2.setAllValuesToFoititis(tmpAM, tmpFirstName, tmpLastName, tmpEtosEisagogis);
//        foit2.setAM(tmpAM);
//        foit2.setFirstName(tmpFirstName);
//        foit2.setLastName(tmpLastName);
//        foit2.setEtosEisagogis(tmpEtosEisagogis);
    }

    //Ergastirio 4.1 Seiriaki anazitisi
    public static int anazitisiMeEpwnymo(Foititis[] foitArray, String foit2Search) {
        for (int i = 0; i < foitArray.length; i++)
            if (foitArray[i].getLastName().equals(foit2Search))
                return i;
        return -1;
    }

    //Ergastirio 4.2 Dyadiki anazitisi
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

    //Ergastirio 4.3 Anadromiki dyadiki anazitisi
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

    //Ergastirio 5.1 Taksinomisi me Eisagogi
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
            // Kataxorisi ton prososrinon metavliton sti nea tous thesi [position] ston pinaka
            // Me ti xrisi tis methodou .setAllValuesToFoititis
            foitArray[position].setAllValuesToFoititis(currentAM, tmpFirstNama, tmpLastName, tmpEtosEisagogis);
            // Xoris ti methodo .setAllValuesToFoititis
//            foitArray[position].setAM(currentAM);
//            foitArray[position].setFirstName(tmpFirstNama);
//            foitArray[position].setLastName(tmpLastName);
//            foitArray[position].setEtosEisagogis(tmpEtosEisagogis);
        }
    }

    //Ergastirio 5.2 Taksinomisi me Epilogi
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

    //Ergastirio 5.3 Taksinomisi Fysalidas (Bubblesort)
    public static void bubbleSortEE(Foititis[] foitArray) {
        int i, j;
        boolean found;
        for (i = 1; i < foitArray.length; i++) {
            found = true;
            for (j = 0; j < foitArray.length - i; j++) {
                if (foitArray[j].getEtosEisagogis() > foitArray[j + 1].getEtosEisagogis())
                    swapFoitites(foitArray[j], foitArray[j + 1]);
                found = false;
            }
            if (found)
                return;
            ;
        }
    }

    // Ergastirio 6.1 Quick sort
    public static void quickSortAM(Foititis[] foitArray) {
        quickSort(foitArray, 0, foitArray.length - 1);
    }

    public static void quickSort(Foititis[] foitArray, int first, int last) {
        if (last - first > 0) {
            int pivotIndex = partition(foitArray, first, last);
            quickSort(foitArray, first, pivotIndex - 1);
            quickSort(foitArray, pivotIndex + 1, last);
        }
    }

    public static int partition(Foititis[] foitArray, int first, int last) {
        int retValue = 0;
        int lowerLimit = first;
        int mid = (first + last) / 2;
        swapFoitites(foitArray[first], foitArray[mid]); // ????
        short pivot = foitArray[first].getAM();
        first++;
        while (first < last) {
            while (foitArray[first].getAM() <= pivot && first < last)
                first++;
            while (foitArray[last].getAM() >= pivot && first <= last)
                last--;
            if (first < last)
                swapFoitites(foitArray[first], foitArray[last]);
        }
        if (pivot > foitArray[first].getAM()) {
            swapFoitites(foitArray[first], foitArray[lowerLimit]);
            retValue = first;
        } else {
            if (pivot >= foitArray[last].getAM()) {
                swapFoitites(foitArray[last], foitArray[lowerLimit]);
                retValue = last;
            }
        }
        return retValue;
    }

    // Ergastirio 6.2 Merge sort
    public static void mergeSortEponymo(Foititis[] foitArray) {
        mSort(foitArray, 0, foitArray.length - 1);
    }
    // Merge sort - Synexeia
    public static void mSort(Foititis[] A, int first, int last) {
        if (first == last)
            return;
        int mid = (first + last) / 2;
        mSort(A, first, mid);
        mSort(A, mid + 1, last);
        merge(A, first, last, mid);
    }
    // Merge sort - Synexeia
    public static void merge(Foititis[] A, int first, int last, int mid) {
        int i1 = first, i2 = mid + 1, j = 0;
        int tmpArraySize = last - first + 1;
        Foititis[] tmpArray = new Foititis[tmpArraySize]; // Prosorinos pinakas Foititon
        for (int i = 0; i < tmpArraySize; i++) // Arxikopoiisi antikeimenon prosorinou pinaka
            tmpArray[i] = new Foititis(); // Arxikopoiisi antikeimenon prosorinou pinaka
        while (i1 <= mid && i2 <= last) {
            if (A[i1].getLastName().compareTo(A[i2].getLastName()) < 0) {
                tmpArray[j].setAllValuesToFoititis(A[i1].getAM(), A[i1].getFirstName(), A[i1].getLastName(), A[i1].getEtosEisagogis());
                i1++;
            } else {
                tmpArray[j].setAllValuesToFoititis(A[i2].getAM(), A[i2].getFirstName(), A[i2].getLastName(), A[i2].getEtosEisagogis());
                i2++;
            }
            j++;
        }
        while (i1 <= mid) {
            tmpArray[j].setAllValuesToFoititis(A[i1].getAM(), A[i1].getFirstName(), A[i1].getLastName(), A[i1].getEtosEisagogis());
            i1++;
            j++;
        }
        while (i2 <= last) {
            tmpArray[j].setAllValuesToFoititis(A[i2].getAM(), A[i2].getFirstName(), A[i2].getLastName(), A[i2].getEtosEisagogis());
            i2++;
            j++;
        }
        for (j = 0; j < tmpArraySize; j++) {
            A[first + j].setAllValuesToFoititis(tmpArray[j].getAM(), tmpArray[j].getFirstName(), tmpArray[j].getLastName(), tmpArray[j].getEtosEisagogis());
        }
    }
}
