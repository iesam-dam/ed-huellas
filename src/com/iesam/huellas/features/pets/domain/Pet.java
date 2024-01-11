package com.iesam.huellas.features.pets.domain;

public class Pet {
    private String id;
    private String name;
    private String description;
    private String sex;
    private String dateBorn;
    private String urlImage;

    public Pet(String id, String name, String description, String sex, String dateBorn, String urlImage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.sex = sex;
        this.dateBorn = dateBorn;
        this.urlImage = urlImage;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
