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



    public Schermata(String titolo) throws IOException {
        super(titolo);
        if (!f.exists())
            p = new Partita();
        else
            this.importaRisultato();

        GridLayout gl = new GridLayout(3, 2, 50, 0);
        this.setLayout(gl);

        JLabel casa = new JLabel("Home");
        casa.setFont(new Font("MioFont", ITALIC, 14));
        this.add(casa);

        JLabel ospiti = new JLabel("Guest");
        ospiti.setFont(new Font("MioFont", ITALIC, 14));
        this.add(ospiti);

        punti_casa = new JLabel(String.valueOf(p.getGoal_casa()));
        punti_casa.setFont(new Font("MioFont", Font.BOLD, 42));
        this.add(punti_casa);

        punti_ospiti = new JLabel(String.valueOf(p.getGoal_trasferta()));
        punti_ospiti.setFont(new Font("MioFont", Font.BOLD, 42));
        this.add(punti_ospiti);

        JButton goal_casa = new JButton("+");
        this.add(goal_casa);
        goal_casa.setActionCommand("goal_casa");
        goal_casa.addActionListener(this);

        JButton goal_trasferta = new JButton("+");
        this.add(goal_trasferta);
        goal_trasferta.setActionCommand("goal_trasferta");
        goal_trasferta.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("goal_casa")){
            p.aggiungiGoal_casa();
            punti_casa.setText(String.valueOf(p.getGoal_casa()));
        }
        else if (e.getActionCommand().equals("goal_trasferta")) {
            p.aggiungiGoal_trasferta();
            punti_ospiti.setText(String.valueOf(p.getGoal_trasferta()));
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
