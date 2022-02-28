package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product2 product2;

    OrderItem(){}

    public OrderItem(Integer quantity, Double price, Product2 product2) {
        this.quantity = quantity;
        this.price = price;
        this.product2 = product2;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double subTotal(){
        return price * quantity;
    }
    @Override
    public String toString(){
        return product2.getName()
                +" $"+String.format("%.2f",price)
                +", Quantity: "
                + quantity
                + ", Sub Total: $" + String.format("%.2f",subTotal());
    }
}
