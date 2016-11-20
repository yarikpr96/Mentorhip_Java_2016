package SOLID.with.Example1;


import SOLID.with.Iinterface.OrderRepository;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Order implements OrderRepository {
    private int id_order;
    private double sum_order;
    private LocalDate localDate;
    private String nameCustomer;
    private List<String> productList;

    public Order() {
    }

    public Order(int id_order, double sum_order, LocalDate localDate, String nameCustomer, List<String> productList) {
        this.id_order = id_order;
        this.sum_order = sum_order;
        this.localDate = localDate;
        this.nameCustomer = nameCustomer;
        this.productList = productList;
    }

    public void addNewOrder() {
        //...
    }

    public void allOrder() {
        //...
    }

    @Override
    public void saveOrder() {
        //...
    }

    @Override
    public void updateOrder() {
//...
    }

    @Override
    public void deleteOrder() {
//...
    }
}
