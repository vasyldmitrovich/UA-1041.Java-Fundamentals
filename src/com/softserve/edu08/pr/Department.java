package com.softserve.edu08.pr;

public class Department implements Cloneable {
    private String name;
     Address address;//Address should be private too

    //Add constructor without parameters

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public static class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
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
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        @Override
        public Address clone(){
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
    @Override
    public Department clone(){
        Department res = null;
        try {
            res =  (Department) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        res.address = address.clone();
        return res;
    }
}



