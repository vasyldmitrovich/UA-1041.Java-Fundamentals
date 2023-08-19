package com.softserve.edu08.pt;

public class Department implements Cloneable {
    private String field;
    private Address address;

    public Department() {
    }

    public Department(String field, Address address) {
        this.field = field;
        this.address = address;
    }

    public Department(String field, String city, String street, int building) {
        this.field = field;
        this.address = new Address(city, street, building);
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Department: " + field + "\n" + address;
    }

    @Override
    public Department clone() {
        try {
            Department clone = (Department) super.clone();
            clone.address = address.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address() {

        }

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
            return "Address: " + building + ", " + street + ", " + city;
        }

        @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
