package entities;

public class PessoaFisica extends Imposto{
    private Double healthExpenditures;

    public PessoaFisica(){super();}

    public PessoaFisica(String nome, Double rendaAnual, Double healthExpenditures) {
        super(nome, rendaAnual);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
      double taxaBasica;
      if (getRendaAnual() <20000.0) {
          taxaBasica = getRendaAnual() * 0.15;
      }else{
          taxaBasica = getRendaAnual() * 0.25;
      }
      taxaBasica -= getHealthExpenditures() * 0.5;
      if (taxaBasica < 0.0){
          taxaBasica = 0.0;
      }
      return taxaBasica;
    }
}
