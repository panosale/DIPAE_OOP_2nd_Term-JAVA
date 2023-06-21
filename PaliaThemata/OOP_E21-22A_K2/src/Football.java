public class Football extends Championship implements Play{
    private int[] vathmoi;
    private int[][] results;

    public Football(int teams) {
        super.setTeamNo(teams);
        results = new int[teams][teams];
        vathmoi = new int[teams];
        for (int i = 0; i < vathmoi.length; i++)
            vathmoi[i] = 0;
    }
    public void play() {
        int tmp;
        for (int i = 0; i < results.length; i++)
            for (int j = 0; j < results[i].length; j++) {
                if (i == j) results[i][j] = 0;
                else {
                    tmp = (int) Math.round(Math.random() * 3);
                    setResults(i, j, tmp);
                }
/*
                    try {
                        tmp = (int) Math.round(Math.random() * 3);
                        if (tmp == 0)
                            throw new InvalidGameResultException();
                        results[i][j] = tmp;
                    }
                    catch (InvalidGameResultException s) {
                        System.out.println("Λάθος αποτέλεσμα αγώνα.");
                    }
*/
            }
        // Χειροκίνητο γέμισμα για έλεγχο & διασταύρωση
        results[0][0] = 0;
        results[0][1] = 1;
        results[0][2] = 2;
        results[0][3] = 3;
        results[0][4] = 1;
        results[1][0] = 1;
        results[1][1] = 0;
        results[1][2] = 1;
        results[1][3] = 2;
        results[1][4] = 2;
        results[2][0] = 1;
        results[2][1] = 3;
        results[2][2] = 0;
        results[2][3] = 2;
        results[2][4] = 2;
        results[3][0] = 1;
        results[3][1] = 3;
        results[3][2] = 3;
        results[3][3] = 0;
        results[3][4] = 1;
        results[4][0] = 2;
        results[4][1] = 3;
        results[4][2] = 2;
        results[4][3] = 3;
        results[4][4] = 0;
    }

    public void setResults(int xPos, int yPos, int val) {
        try {
            if (val == 0 && (xPos != yPos))
                throw new InvalidGameResultException("error1 on: val == 0 && (xPos != yPos)");
            results[xPos][yPos] = val;
        }
        catch (InvalidGameResultException s) {
            System.out.println("Λάθος αποτέλεσμα αγώνα. xPos: " + xPos + ", yPos: " + yPos + ". " + s + ". Αλλαγή σε νέα τυχαία τιμή.");
            results[xPos][yPos] = (int) (Math.round(Math.random()) * 2) + 1;
        }
    }
    public int getResult(int xPos, int yPos) {
        return results[xPos][yPos];
    }

    public void showResults() {
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[i].length; j++) {
                System.out.print(results[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public void vathmologia() { // Χρειάζεται διόρθωση
        for (int i = 0; i < results.length; i++)
            for (int j = 0; j < results[i].length; j++)
                switch (results[i][j]) {
                    case 1:
                        this.vathmoi[i] = this.vathmoi[i] + 3;
                        break;
/*
                    case 2:
                        this.vathmoi[j] = this.vathmoi[j] + 0;
                        break;
*/
                    case 3:
                        this.vathmoi[i] = this.vathmoi[i] + 1;
                        break;
                }
    }
    public void showVathmoi() {
        for (int i = 0; i < vathmoi.length; i++)
            System.out.println(vathmoi[i]);
    }
    public void setTeamNo(int teams) {
        this.setTeamNo(teams);
        results = new int[teams][teams];
        vathmoi = new int[teams];
        for (int i = 0; i < vathmoi.length; i++)
            vathmoi[i] = 0;
    }
}
