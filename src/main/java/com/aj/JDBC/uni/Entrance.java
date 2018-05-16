package com.aj.JDBC.uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class Entrance {
//    @Id
//    @GeneratedValue
    long id;

    int year;

    double grantScore;

    int grantCount;

    double contractScore;

    int contractCount;
}
