package com.aj.JDBC.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
public class Faculty {

//    @Id
//    @GeneratedValue
    long id;

    String name;

    @OneToOne
    Language language;
}
