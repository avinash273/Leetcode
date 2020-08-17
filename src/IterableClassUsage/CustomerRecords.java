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

    /**
     * I am returning new HashMap so that client cannot corrupt the original value
     * this is a very interesting topic, need to revist it sometime
     * https://www.linkedin.com/learning/java-memory-management/an-escaping-references-example?u=56687537
     */
    public HashMap<String, Customer> getCustomer(){
        return new HashMap<String, Customer>(this.records);
    }

    @Override
    public Iterator<Customer> iterator(){
        return records.values().iterator();
    }
}
