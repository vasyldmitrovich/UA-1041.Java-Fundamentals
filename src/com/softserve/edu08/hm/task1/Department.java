package com.softserve.edu08.hm.task1;

public class Department implements Cloneable {

    private String type;

    private Address address;


    public Department(String type, Address address) {
        this.type = type;
        this.address = address;
    }


    public Department copy() {


        try {
            Department newDep = (Department) super.clone();

            newDep.address = address.copy();

            return newDep;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return type + ", " + address;
    }


    public static class Address implements Cloneable {
        private String city;
        private String street;
        private int building;


        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }


        public Address copy() throws CloneNotSupportedException {
            return (Address) this.clone();
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return street + ", " + building + ", " + city;
        }

    }
}
