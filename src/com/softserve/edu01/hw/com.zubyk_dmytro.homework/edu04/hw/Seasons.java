package edu04.hw;

enum Seasons{
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String name;

    Seasons(String name){this.name = name;}

    public String getName(){
        return name;
    }
}
