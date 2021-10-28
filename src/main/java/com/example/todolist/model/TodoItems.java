package com.example.todolist.model;
import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class TodoItems {
    private Long id;
    @NotNull
    private String registerName;
    private String title;
    private String password;
    private boolean work;

    public TodoItems() {
    }

    public TodoItems(Long id, String registerName, String title, String password, boolean work) {
        this.id = id;
        this.registerName = registerName;
        this.title = title;
        this.password = password;
        this.work = work;
    }
    @Id
    @GeneratedValue

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }
}
