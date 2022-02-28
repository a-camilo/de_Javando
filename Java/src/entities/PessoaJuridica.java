package entities;

public class PessoaJuridica extends Imposto{

    private Integer numberOfEmployees;

    public PessoaJuridica(){super();}

    public PessoaJuridica(String nome, Double rendaAnual, Integer numberOfEmployees) {
        super(nome, rendaAnual);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {

        if (numberOfEmployees > 10){
           return getRendaAnual() * 0.14;
        }else {
            return getRendaAnual() * 0.16;
        }

    }


}
