package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentoRg extends Documento {

    private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private String rg;

    public DocumentoRg() {
        super();
    }

    public DocumentoRg(String nome, String uf, Date dataNascimento, String rg) {
        super(nome, uf, dataNascimento);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
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
