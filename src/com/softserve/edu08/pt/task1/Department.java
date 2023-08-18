package com.softserve.edu08.pt.task1;

public class Department implements Cloneable{
    private String field;
    private Address address = new Address();

    public Department(String field, String city, String street, int buildingField) {
        this.field = field;
        this.address.city = city;
        this.address.street = street;
        this.address.buildingField = buildingField;
    }

    class Address{
        private String city;
        private String street;
        private int buildingField;

        @Override
        public String toString() {
            return "Address: " +
                     city + ", " +
                     street + ", " +
                     buildingField;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Department: " +
                field + " " +
                address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}