package IterableClassUsage;

public class MainForCustomer {
    public static void main(String[] args){
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("Avinash"));
        records.addCustomer(new Customer("Akash"));


    }
}
