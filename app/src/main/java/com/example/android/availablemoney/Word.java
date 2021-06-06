package com.example.android.availablemoney;

 class Word {

    private String name; // название
    private String surname;  // столица

    public Word(String name, String surname){

        this.name=name;
        this.surname=surname;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}