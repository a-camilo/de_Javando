package entities;

public class OutsourceEmplyee extends Employee3{
    private Double additionalCharge;

    public OutsourceEmplyee(){super();}

    public OutsourceEmplyee(String name, Integer hours, Double valuePerhour, Double additionalCharge) {
        super(name, hours, valuePerhour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment(){
        return super.payment() +  additionalCharge * 1.1;
    }
}
