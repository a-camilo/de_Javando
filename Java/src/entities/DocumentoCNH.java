package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentoCNH extends Documento {

    private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

    private String numeroCNH;
    private Character categoria;
    private Date validade;

    public DocumentoCNH(){super();}

    public DocumentoCNH(String nome, String uf, Date dataNascimento, String numeroCNH, Character categoria, Date validade) {
        super(nome, uf, dataNascimento);
        this.numeroCNH = numeroCNH;
        this.categoria = categoria;
        this.validade = validade;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public Character getCategoria() {
        return categoria;
    }

    public Date getValidade() {
        return validade;
    }

    @Override
    public String mostraDoc() {
        return "CNH emitido: "
                + "\n"
                + "Nome: " + getNome()
                + ", CNH: "+ getNumeroCNH()
                + ", Categoria: " + getCategoria()
                + ", UF: " + getUf()
                + ", Validade: " + SDF.format(getValidade());
    }
}
