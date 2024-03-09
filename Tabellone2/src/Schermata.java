import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;

import static java.awt.Font.ITALIC;

public class Schermata extends MioFrame implements ActionListener, WindowListener {

    private Partita p;
    JLabel punti_casa;
    JLabel punti_ospiti;
    File f = new File ("src" + File.separator + "salvataggio.txt");
    //ciao


    public Schermata(String titolo) throws IOException {
        super(titolo);
        if (!f.exists())
            p = new Partita();
        else
            this.importaRisultato();

        GridLayout gl = new GridLayout(0, 4, 50, 0);
        this.setLayout(gl);

        JLabel casa = new JLabel("Home");
        casa.setFont(new Font("MioFont", ITALIC, 14));
        this.add(casa);

        punti_casa = new JLabel(String.valueOf(p.getGoal_casa()));
        punti_casa.setFont(new Font("MioFont", Font.BOLD, 42));
        this.add(punti_casa);

        JButton goal_casa = new JButton("+");
        this.add(goal_casa);
        goal_casa.setActionCommand("goal_casa");
        goal_casa.addActionListener(this);

        JButton togli_goal_casa = new JButton("-");
        this.add(togli_goal_casa);
        togli_goal_casa.setActionCommand("togli_goal_casa");
        togli_goal_casa.addActionListener(this);

        JLabel ospiti = new JLabel("Guest");
        ospiti.setFont(new Font("MioFont", ITALIC, 14));
        this.add(ospiti);

        punti_ospiti = new JLabel(String.valueOf(p.getGoal_trasferta()));
        punti_ospiti.setFont(new Font("MioFont", Font.BOLD, 42));
        this.add(punti_ospiti);

        JButton goal_trasferta = new JButton("+");
        this.add(goal_trasferta);
        goal_trasferta.setActionCommand("goal_trasferta");
        goal_trasferta.addActionListener(this);

        JButton togli_goal_trasferta= new JButton("-");
        this.add(togli_goal_trasferta);
        togli_goal_trasferta.setActionCommand("togli_goal_trasferta");
        togli_goal_trasferta.addActionListener(this);

        JButton reset= new JButton("Azzera");
        this.add(reset);
        reset.setActionCommand("azzera");
        reset.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "goal_casa": {
                p.aggiungiGoal_casa();
                punti_casa.setText(String.valueOf(p.getGoal_casa()));
                break;
            }
            case "goal_trasferta" : {
                p.aggiungiGoal_trasferta();
                punti_ospiti.setText(String.valueOf(p.getGoal_trasferta()));
                break;
            }
            case "togli_goal_casa":{
                p.togliGoal_casa();
                punti_casa.setText(String.valueOf(p.getGoal_casa()));
                break;
            }
            case "togli_goal_trasferta":{
                p.togliGoal_trasferta();
                punti_ospiti.setText(String.valueOf(p.getGoal_trasferta()));
                break;
            }
            case "azzera":{
                p.azzera_punteggio();
                punti_casa.setText(String.valueOf(p.getGoal_casa()));
                punti_ospiti.setText(String.valueOf(p.getGoal_trasferta()));
                break;
            }
        }
    }

    public void importaRisultato() throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        int import_goal_casa = Integer.parseInt(br.readLine());
        int import_goal_trasferta = Integer.parseInt(br.readLine());
        p = new Partita(import_goal_casa, import_goal_trasferta);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        FileWriter fw;
        try {
            fw = new FileWriter(f);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(p.toFile());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        super.windowClosing(e);
    }
}
