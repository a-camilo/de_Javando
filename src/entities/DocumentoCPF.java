package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentoCPF extends Documento{

    private SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private Integer cpf;

    DocumentoCPF(){super();}

    public DocumentoCPF(String nome, String uf, Date dataNascimento, Integer cpf) {
        super(nome, uf, dataNascimento);
        this.cpf = cpf;
    }

    public Integer getCpf() {
        return cpf;
    }

    @Override
    public String mostraDoc() {
        return "CPF emitido: "
                + "Nome: " + getNome()
                + ", CPF: "+ getCpf()
                + ", UF: " + getUf()
                + ", Data de Nascimento: " + SDF.format(getDataNascimento());
    }
}
