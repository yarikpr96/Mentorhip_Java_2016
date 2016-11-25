package SOLID.with.Example1;


import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Order {
    private int id_order;
    private LocalDate localDate;
    private String nameCustomer;
    private List<String> productList;

    public Order() {
    }

    public Order(int id_order, LocalDate localDate, String nameCustomer, List<String> productList) {
        this.id_order = id_order;
        this.localDate = localDate;
        this.nameCustomer = nameCustomer;
        this.productList = productList;
    }


}
