package com.softserve.edu08.practicalrask;

public class Department implements Cloneable {
    private String name;
    private Address address;

    protected Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Address getAddress() {
        return address;
    }

    protected void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Department clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) address.clone();
        return copyOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" + "name='" + name + '\'' + ", address=" + address + '}';
    }

    public String getInfo() {
       return toString();
    }

    protected static class Address implements Cloneable {
        private String city;
        private String street;

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
        public String getInfo(){
           return toString();
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
    }
}

