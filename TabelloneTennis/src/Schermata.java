import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class Schermata extends MioFrame implements ActionListener, WindowListener {
    private Partita p = new Partita();

    private JLabel punti1, set1, game1, punti2, set2, game2;
    public Schermata (String titolo){
        super(titolo);
        Font mioFont = new Font("mioFont", Font.BOLD, 16);
        Font mioFont2 = new Font("mioFont", Font.BOLD, 26);
        BorderLayout bl = new BorderLayout();
        this.setLayout(bl);
        JPanel pannelloNord = new JPanel();
        JPanel pannelloSud = new JPanel();
        JPanel pannelloCentro = new JPanel();
        JPanel pannelloEst = new JPanel();
        JPanel pannelloOvest = new JPanel();

        JLabel torneo = new JLabel("The Championship", SwingConstants.CENTER);
        torneo.setFont(new Font("font nuovo", Font.ITALIC, 16));
        pannelloNord.add(torneo);


        JLabel sponsor = new JLabel("Rolex", SwingConstants.CENTER);
        sponsor.setFont(new Font("font nuovo", Font.ITALIC, 14));
        sponsor.setForeground(new Color(205, 154, 62));
        pannelloSud.add(sponsor);

        pannelloEst.setLayout(new GridLayout(3, 1));
        JLabel paperino = new JLabel(" ");
        pannelloEst.add(paperino);
        JButton aggiungi_giocatore1 = new JButton("+");
        aggiungi_giocatore1.setActionCommand("punti1");
        aggiungi_giocatore1.addActionListener(this);
        pannelloEst.add(aggiungi_giocatore1);
        JButton aggiungi_giocatore2 = new JButton("+");
        aggiungi_giocatore2.setActionCommand("punti2");
        aggiungi_giocatore2.addActionListener(this);
        pannelloEst.add(aggiungi_giocatore2);

        pannelloOvest.setLayout(new GridLayout(3, 1));
        JLabel pippo = new JLabel(" ");
        pannelloOvest.add(pippo);
        JLabel servizio1 = new JLabel("▶\s\s");
        pannelloOvest.add(servizio1);
        JLabel servizio2 = new JLabel("▶\s\s");
        servizio2.setVisible(false);
        pannelloOvest.add(servizio2);

        pannelloCentro.setLayout(new GridLayout(3, 4, 30, 30));
        JLabel giocatori = new JLabel("Giocatori");
        JLabel set = new JLabel("set");
        JLabel game = new JLabel("game");
        JLabel punti = new JLabel("punti");
        JLabel giocatore1 = new JLabel(p.getGiocatore1());
        set1 = new JLabel(String.valueOf(p.getSet1()));
        game1 = new JLabel(String.valueOf(p.getGame1()));
        punti1 = new JLabel(p.stampaPunti1());
        JLabel giocatore2= new JLabel(p.getGiocatore2());
        set2 = new JLabel(String.valueOf(p.getSet2()));
        game2 = new JLabel(String.valueOf(p.getGame2()));
        punti2 = new JLabel(p.stampaPunti2());
        giocatore1.setFont(mioFont);
        set1.setFont(mioFont2);
        game1.setFont(mioFont2);
        punti1.setFont(mioFont2);
        giocatore2.setFont(mioFont);
        set2.setFont(mioFont2);
        game2.setFont(mioFont2);
        punti2.setFont(mioFont2);

        pannelloCentro.add(giocatori);
        pannelloCentro.add(set);
        pannelloCentro.add(game);
        pannelloCentro.add(punti);
        pannelloCentro.add(giocatore1);
        pannelloCentro.add(set1);
        pannelloCentro.add(game1);
        pannelloCentro.add(punti1);
        pannelloCentro.add(giocatore2);
        pannelloCentro.add(set2);
        pannelloCentro.add(game2);
        pannelloCentro.add(punti2);

        this.add(pannelloNord, BorderLayout.NORTH);
        this.add(pannelloCentro, BorderLayout.CENTER);
        this.add(pannelloSud, BorderLayout.SOUTH);
        this.add(pannelloEst, BorderLayout.EAST);
        this.add(pannelloOvest, BorderLayout.WEST);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("punti1"))
            p.aggiungi_punto1();
        else if (e.getActionCommand().equals("punti2"))
            p.aggiungi_punto2();

        punti1.setText(p.stampaPunti1());
        game1.setText(String.valueOf(p.getGame1()));
        set1.setText(String.valueOf(p.getSet1()));
        punti2.setText(p.stampaPunti2());
        game2.setText(String.valueOf(p.getGame2()));
        set2.setText(String.valueOf(p.getSet2()));
    }
}
