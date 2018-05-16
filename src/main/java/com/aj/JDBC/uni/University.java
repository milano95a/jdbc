package com.aj.JDBC.uni;

import javax.persistence.*;
import java.util.List;

//@Entity
public class University {

//    @Id
//    @GeneratedValue
    long id;

    String name;

//    @OneToOne
    Language language;

//    @OneToMany(targetEntity = Faculty.class)
    List faculties;

}
