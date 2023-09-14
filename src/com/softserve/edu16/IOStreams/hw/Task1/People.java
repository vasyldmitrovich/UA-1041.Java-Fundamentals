package com.softserve.edu16.IOStreams.hw.Task1;


public class People {
    String name;
    String birthday;

    public People() {
    }

    public People(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return
                "name=" + name  +
                ", birthday=" + birthday;
    }
}