/*package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "test1")
public class User implements Serializable {
    private static final long serialVersionUID = -8706689714326132798L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String animal_type;

    //Important to Hibernate!
    public User() {
    }



    public User(String name, String animal_type) {
        this.setName(name);
        this.setAnimalType(animal_type);
    }

    public String getName() {
            return name;
        }

    public void setName(String name) {
            this.name = name;
        }


    public String getAnimalType() {
            return animal_type;
        }

    public void setAnimalType(String animal_type) {
            this.animal_type = animal_type;
        }
}
*/