package com.softserve.edu04.hw;

public enum Breed {
    BEAGLE("Beagle"),
    BOXER("Boxer"),
    BULLDOG("Bulldog"),
    DACHSHUND("Dachshund"),
    GERMAN_SHEPHERD("German Shepherd"),
    GOLDEN_RETRIEVER("Golder Retriever"),
    LABRADOR_RETRIEVER("Labrador Retriever"),
    POODLE("Poodle"),
    ROTTWEILER("Rottweiler"),
    SIBERIAN_HUSKY("Siberian Husky");

    private final String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }
}
