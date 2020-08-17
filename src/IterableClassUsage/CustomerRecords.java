package IterableClassUsage;

import java.util.HashMap;

public class CustomerRecords {
    private HashMap<String, Customer> records;

    public CustomerRecords(){
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c){
        this.records.put(c.getName(), c);
    }

    public HashMap<String, Customer> getCustomer(){
        return this.records;
    }
}
