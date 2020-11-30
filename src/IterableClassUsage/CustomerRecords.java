package IterableClassUsage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer>{
    private HashMap<String, Customer> records;

    public CustomerRecords(){
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c){
        this.records.put(c.getName(), c);
    }

    /**
     * called escaping references
     * I am returning new HashMap so that client cannot corrupt the original value
     * this is a very interesting topic, need to revist it sometime
     * https://www.linkedin.com/learning/java-memory-management/an-escaping-references-example?u=56687537
     *
     * @return
     */
    public Map<String, Customer> getCustomer(){
        //this is very imporatant line of code
        //return new HashMap<String, Customer>(this.records);

        /**
         * More elegant solution of using unmodifiable class
         */
        return Collections.unmodifiableMap(this.records);
    }

    @Override
    //override is not exactly required
    public Iterator<Customer> iterator(){
        return records.values().iterator();
    }
}
