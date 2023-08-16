package com.softserve.edu04.Practical.task4;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("bread",23.5,5);

        Product pr2 = new Product("butter",88.6,1);

        Product pr3 = new Product("ice_cream",35.5,10);

        Product pr4 = new Product("jam",55.3,3);




        System.out.println("You buy :" + pr1.getName()+ "\t" +"by\t"+ pr1.getPrice()+"\t"+"grn"+ "\t=" + pr1.getQuantity()+
                "\t" + "\n" +pr2.getName()+ "\t" +"by\t"+ pr2.getPrice()+"grn"+"\t=" + pr2.getQuantity() +
                "\n" +pr3.getName()+ "\t" +"by\t"+ pr3.getPrice()+"grn"+"\t"+"\t=" + pr3.getQuantity() +
                "\n" +pr4.getName()+ "\t" +"by\t"+ pr4.getPrice()+"grn"+"\t"+"\t=" + pr4.getQuantity());

        if (pr1.getPrice()>pr2.getPrice() && pr1.getPrice()>pr3.getPrice() && pr1.getPrice()>pr4.getPrice())
            System.out.println("Most expensive product is: " + pr1.getName()+"\t"+"\t" + pr1.getQuantity());
        if (pr2.getPrice()>pr1.getPrice() && pr2.getPrice()>pr3.getPrice() && pr2.getPrice()>pr4.getPrice())
            System.out.println("Most expensive product is: " + pr2.getName() +"\t"+ pr2.getQuantity());
        if (pr3.getPrice()>pr2.getPrice() && pr3.getPrice()>pr1.getPrice() && pr3.getPrice()>pr4.getPrice())
            System.out.println("Most expensive product is: " + pr3.getName() +"\t"+ pr3.getQuantity());
        if (pr4.getPrice()>pr2.getPrice() && pr4.getPrice()>pr3.getPrice() && pr4.getPrice()>pr1.getPrice())
            System.out.println("Most expensive product is: " + pr4.getName()+"\t" + pr4.getQuantity());


        if (pr1.getQuantity()>pr2.getQuantity() && pr1.getQuantity()>pr3.getQuantity() && pr1.getQuantity()>pr4.getQuantity())
            System.out.println("Product with biggest quantity is: "+"\t" + pr1.getName());
        if (pr2.getQuantity()>pr1.getQuantity() && pr2.getQuantity()>pr3.getQuantity() && pr2.getQuantity()>pr4.getQuantity())
            System.out.println("Product with biggest quantity is: "+"\t" + pr1.getName());
        if (pr3.getQuantity()>pr2.getQuantity() && pr3.getQuantity()>pr1.getQuantity() && pr3.getQuantity()>pr4.getQuantity())
            System.out.println("Product with biggest quantity is: "+"\t" + pr3.getName());
        if (pr4.getQuantity()>pr2.getQuantity() && pr4.getQuantity()>pr3.getQuantity() && pr4.getQuantity()>pr1.getQuantity())
            System.out.println("Product with biggest quantity is: "+"\t" + pr1.getName());


    }









    }




