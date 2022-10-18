package com.zurich.inventory.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserType {


    @Id
    @GeneratedValue
    private String name;
    private boolean active;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_user_type")
    private  List<UserType>userTypes;
}
