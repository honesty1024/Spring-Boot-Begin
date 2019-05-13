package com.user.Module;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    private Long id;
    private String user_name;
    private String user_password;
    private String real_name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setReal_Name(String real_name) {
        this.real_name = real_name;
    }

    public Long getId() {
        return id;
    }

    public String getReal_Name() {
        return real_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_name() {
        return user_name;
    }
}
