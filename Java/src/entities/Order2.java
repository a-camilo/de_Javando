package entities;

import entities.enums.OrderStatus2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order2 {

    private static SimpleDateFormat sdf = new SimpleDateFormat();
    private Date moment;
    private OrderStatus2 status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order2() {
    }

    public Order2(Date moment, OrderStatus2 status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus2 getStatus() {
        return status;
    }

    public void setStatus(OrderStatus2 status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem it : items) {
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment: ").append("\n");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Order Status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client).append("\n");
        sb.append("Order Items: ").append("\n");
        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total Price: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();


    }
}
