package com.softserve.edu08.Practica.task1;

 class Department implements Cloneable {
     String name;
     Address address;

     public Department(String name, Address address) {
         this.name = name;
         this.address = address;
     }

     public static class Address implements Cloneable {
         String city;
         String street;
         int building;


         public Address(String city, String street, int building) {
             this.city = city;
             this.street = street;
             this.building = building;
         }

         @Override
         public String toString() {
             return "Address{" +
                     "city='" + city + '\'' +
                     ", building=" + building +
                     ", street='" + street + '\'' +
                     '}';
         }
         @Override
         public Address clone()  {
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
                 ", address='" + address + '\'' +
                 '}';
     }



     @Override
     public Department clone()  {
                  try {
            var res = (Department) super.clone();
                      res.address = address.clone();
                      return res;
         } catch (CloneNotSupportedException e) {
             throw new RuntimeException(e);
         }

     }
 }
