package com.softserve.edu08.pr;

class MainDepartment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department(
                "IT", new Department.Address("Lviv", "T. Shevchenka", 125)
        );
        Department department2 = department.clone();
        department2.address.setCity("Kyiv");
        System.out.println(department);
        System.out.println(department2);
    }
}
