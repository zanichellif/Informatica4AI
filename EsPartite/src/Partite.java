import java.util.StringJoiner;

public class Partite {
    private int goal_casa, goal_trasferta;

    public Partite(int goal_casa, int goal_trasferta) {
        this.goal_casa = goal_casa;
        this.goal_trasferta = goal_trasferta;
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


    @Override
    public String toString() {
        return "Partite{" +
                "goal_casa=" + goal_casa +
                ", goal_trasferta=" + goal_trasferta +
                '}';
    }

    public String toFile(){
        return Integer.toString(goal_casa)+'\n'+ Integer.toString(goal_trasferta)+'\n';
    }
}
