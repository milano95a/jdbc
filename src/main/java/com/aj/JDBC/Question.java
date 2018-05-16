package com.aj.JDBC;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue
    long id;

    String question;

    @OneToMany( targetEntity=Answer.class )
    List answers;

    @OneToOne
    Answer me;

    public Question() {
    }

    public Question(String question, List answers, Answer me) {
        this.question = question;
        this.answers = answers;
        this.me = me;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List getAnswers() {
        return answers;
    }

    public void setAnswers(List answers) {
        this.answers = answers;
    }

    public Answer getMe() {
        return me;
    }

    public void setMe(Answer me) {
        this.me = me;
    }
}
