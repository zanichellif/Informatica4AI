public class Partita {
    private String giocatore1;
    private String giocatore2;
    private int set1;
    private int set2;
    private int game1;
    private int game2;
    private int punti1;
    private int punti2;

    public Partita(){
        giocatore1 = "Federer";
        giocatore2 = "Nadal";
        set1 = 0;
        set2 = 0;
        game1 = 0;
        game2 = 0;
        punti1 = 0;
        punti2 = 0;
    }

    public String stampaPunti1(){
        return stampaPunti(punti1);
    }

    public String stampaPunti2(){
        return stampaPunti(punti2);
    }
    public String stampaPunti(int puntiGenerico) {
        switch (puntiGenerico) {
            case 0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            case 4:
                return "AD";
            default:
                return "FF";
        }
    }

    public void aggiungi_punto1(){
        punti1++;
        if(punti1 - punti2 >= 2 && punti1 >= 4){
            punti1 = 0;
            punti2 = 0;
            game1++;
        }
        if (punti1 == 4 && punti2 == 4){
            punti1 = 3;
            punti2 = 3;
        }
        if(game1 - game2 >= 2 && game1 >= 6){
            punti1 = 0;
            punti2 = 0;
            game1 = 0;
            game2 = 0;
            set1++;
        }
    }

    //TODO fare modifica servizio alla fine di un game
    //TODO fare tiebreak
    //TODO fare avvertimento set point/match point

    public void aggiungi_punto2(){
        punti2++;
        if(punti2 - punti1 >= 2 && punti2 >= 4){
            punti1 = 0;
            punti2 = 0;
            game2++;
        }
        if (punti1 == 4 && punti2 == 4){
            punti1 = 3;
            punti2 = 3;
        }
        if(game2 - game1 >= 2 && game2 >= 6){
            punti1 = 0;
            punti2 = 0;
            game1 = 0;
            game2 = 0;
            set2++;
        }
    }

    public String getGiocatore1() {
        return giocatore1;
    }

    public void setGiocatore1(String giocatore1) {
        this.giocatore1 = giocatore1;
    }

    public String getGiocatore2() {
        return giocatore2;
    }

    public void setGiocatore2(String giocatore2) {
        this.giocatore2 = giocatore2;
    }

    public int getSet1() {
        return set1;
    }

    public void setSet1(int set1) {
        this.set1 = set1;
    }

    public int getSet2() {
        return set2;
    }

    public void setSet2(int set2) {
        this.set2 = set2;
    }

    public int getGame1() {
        return game1;
    }

    public void setGame1(int game1) {
        this.game1 = game1;
    }

    public int getGame2() {
        return game2;
    }

    public void setGame2(int game2) {
        this.game2 = game2;
    }

    public int getPunti1() {
        return punti1;
    }

    public void setPunti1(int punti1) {
        this.punti1 = punti1;
    }

    public int getPunti2() {
        return punti2;
    }

    public void setPunti2(int punti2) {
        this.punti2 = punti2;
    }
}
