import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Libri  {
    protected String titolo;
    private String autore;
    static String pattern = "dd/MM/yyyy";
    static SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    private Date data;


    public Libri(String titolo, String autore, String input) {
        this.titolo = titolo;
        this.autore = autore;
        //String pattern = "dd/MM/yyyy";
        //SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            this.data = sdf.parse(input);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean devo_restituire(){
        Date oggi = new Date();
        if(data.after(oggi))
            return false;
        return true;

    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", data=" + data;
    }
}
