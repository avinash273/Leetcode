package IterableClassUsage;

import java.util.HashMap;
import java.util.Iterator;

public class CustomerRecords implements Iterable<Customer>{
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

    @Override
    public Iterator<Customer> iterator(){
        return records.values().iterator();
    }
}
