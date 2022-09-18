package Entities;

import EntitiesEnum.OrderStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;

    public Order(Date moment, OrderStatus orderStatus) {
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    private OrderStatus orderStatus;

    private Double total;

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    private Client client;

    private List<OrderItem> itens = new ArrayList<>();

    public List<OrderItem> getItens() {
        return itens;
    }

    public void addItens(OrderItem item) {
        itens.add(item);
    }

    public void removeItens(OrderItem item) {
        itens.remove(item);
    }



    public double total() {
        double sum = 0;
        for (OrderItem orderItem : itens) {
            sum += + orderItem.subTotal();
        }
        return sum;
    }
    @Override
    public String toString() {
        return "Total: $" + total();
    }
}
