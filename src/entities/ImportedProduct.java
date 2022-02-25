package entities;

import java.text.ParseException;

public class ImportedProduct extends Product3{

    private Double customsFee;

    public ImportedProduct(){super();};

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() throws ParseException {
        return getName()+" $"
                +String.format("%.2f",totalPrice())
                +" (Customs fee: $ "
                + String.format("%.2f",customsFee)
                +")";
    }
}
