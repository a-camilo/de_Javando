package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Documento {

    private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private String nome;
    private String uf;
    private Date dataNascimento;

    public Documento() {
    }

    public Documento(String nome, String uf, Date dataNascimento) {
        this.nome = nome;
        this.uf = uf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public  abstract String mostraDoc();
}
