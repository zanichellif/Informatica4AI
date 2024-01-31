import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import static java.awt.Font.ITALIC;

public class Schermata extends MioFrame implements ActionListener, WindowListener {

    public Schermata() {
        super();
    }

    public Schermata(String titolo) {
        super(titolo);
        GridLayout gl = new GridLayout(3, 2, 50, 0);
        this.setLayout(gl);

        JLabel casa = new JLabel("Home");
        casa.setFont(new Font("MioFont", ITALIC, 14));
        this.add(casa);

        JLabel ospiti = new JLabel("Guest");
        ospiti.setFont(new Font("MioFont", ITALIC, 14));
        this.add(ospiti);

        JLabel punti_casa = new JLabel("0");
        punti_casa.setFont(new Font("MioFont", Font.BOLD, 42));
        this.add(punti_casa);

        JLabel punti_ospiti = new JLabel("0");
        punti_ospiti.setFont(new Font("MioFont", Font.BOLD, 42));
        this.add(punti_ospiti);

        JButton goal_casa = new JButton("+");
        this.add(goal_casa);

        JButton goal_trasferta = new JButton("+");
        this.add(goal_trasferta);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO listener pulsante
    }
}
