public class Partita {

    private int goal_casa;
    private int goal_trasferta;

    public Partita(){
        goal_casa = 0;
        goal_trasferta = 0;
    }

    public Partita(int goal_casa, int goal_trasferta) {
        this.goal_casa = goal_casa;
        this.goal_trasferta = goal_trasferta;
    }

    public int getGoal_casa() {
        return goal_casa;
    }

    public int getGoal_trasferta() {
        return goal_trasferta;
    }


    public void aggiungiGoal_casa(){
        goal_casa++;
    }

    public void aggiungiGoal_trasferta(){
        goal_trasferta++;
    }

    public void togliGoal_casa(){
        if(goal_casa > 0)
            goal_casa--;
    }

    public void togliGoal_trasferta(){
        if (goal_trasferta > 0)
            goal_trasferta--;
    }

    public void azzera_punteggio(){
        goal_casa = 0;
        goal_trasferta = 0;
    }

    public String toFile(){
        return String.valueOf(this.goal_casa) + '\n' + this.goal_trasferta + '\n';
    }
}
