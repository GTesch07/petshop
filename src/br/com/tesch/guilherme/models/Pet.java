package br.com.tesch.guilherme.models;

public class Pet {
    private String name;
    private Boolean clean;

    public Pet(String name){
        this.name = name;
        this.clean = false;
    }

    public String getName(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public Boolean getClean(){
        return clean;
    }

    public void setClean(Boolean clean){
        this.clean = clean;
    }

}
