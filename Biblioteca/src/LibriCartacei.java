public class LibriCartacei extends Libri{
    private int numero_pagine;

    public LibriCartacei(String titolo, String autore, int numero_pagine, String data) {
        super(titolo, autore, data);
        this.numero_pagine = numero_pagine;
    }

    public int getNumero_pagine() {
        return numero_pagine;
    }

    public void setNumero_pagine(int numero_pagine) {
        this.numero_pagine = numero_pagine;
    }

    @Override
    public String toString() {
        String risultato = super.toString();
        risultato +=
                "numero_pagine=" + numero_pagine +
                        '}';

        return risultato;


    }
}