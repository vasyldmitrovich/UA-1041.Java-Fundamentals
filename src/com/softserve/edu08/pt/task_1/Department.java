package com.softserve.edu08.pt.task_1;

public class Department implements Cloneable {
    private String name;
    private Address address = new Address();

    public Department() {
    }

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address.city = city;
        this.address.street = street;
        this.address.building = building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.address.city;
    }

    public void setCity(String city) {
        this.address.city = city;
    }

    public String getStreet() {
        return this.address.street;
    }

    public void setStreet(String street) {
        this.address.street = street;
    }

    public int getBuilding() {
        return this.address.building;
    }

    public void setBuilding(int building) {
        this.address.building = building;
    }

    @Override
    public Department clone() {
        try {
            var res = (Department) super.clone();
            res.address = this.address.clone();
            return res;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public class Address implements Cloneable {
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

        @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }


}
