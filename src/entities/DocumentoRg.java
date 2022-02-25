package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentoRg extends Documento {

    private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private int rg;

    public DocumentoRg() {
        super();
    }

    public DocumentoRg(String nome, String uf, Date dataNascimento, int rg) {
        super(nome, uf, dataNascimento);
        this.rg = rg;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public String mostraDoc() {
        return "RG emitido: "
                + "Nome: " + getNome()
                + ", RG: "+ getRg()
                + ", UF: " + getUf()
                + ", Data de Nascimento: " + SDF.format(getDataNascimento());
    }
}
