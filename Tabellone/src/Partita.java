public class Partita {

    private int goal_casa;
    private int goal_trasferta;

    public Partita(){
        //TODO import da file
        goal_casa = 0;
        goal_trasferta = 0;
    }

    public int getGoal_casa() {
        return goal_casa;
    }

    public void setGoal_casa(int goal_casa) {
        this.goal_casa = goal_casa;
    }

    public int getGoal_trasferta() {
        return goal_trasferta;
    }

    public void setGoal_trasferta(int goal_trasferta) {
        this.goal_trasferta = goal_trasferta;
    }
}
