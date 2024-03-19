package org.taquangkhoi.functional_interface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Khoi", "12345"));
        greetCustomerConsumer.accept(new Customer("Khac", "190412"));
    }

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.name +
                                           ", thanks for registering phone number " + customer.phoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name + ", thanks for registering phone number " + customer.phoneNumber);
    }

    static class Customer {
        String name;
        String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
