//******************************************************************
//  Activity 36
//  Name: Ben Keys
//  Data Structures Date: 04/17/2023
//******************************************************************
//  A demonstration of StringBuilder.
//******************************************************************

import java.util.ArrayList;

public class CustomerRecord {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void add(Customer customer) {
        customers.add(customer);
    }

    public String getRecords() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Customer customer : customers) {
            stringBuilder.append(customer.getCustomerInfo());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
