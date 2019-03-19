package com.example.yannamreddy.onewaybinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {

    private String name;
    private String email;
    private Boolean newmsg;   // added for two-way-binding


    private int age;   // added for one-way-binding


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(com.example.yannamreddy.onewaybinding.BR.email);
    }

   /* @Bindable
    public Boolean getNewmsg() {
        return newmsg;
    }

    public void setNewmsg(Boolean newmsg) {
        this.newmsg = newmsg;
        notifyPropertyChanged(com.example.yannamreddy.androiddatabinding.BR.email);
    }*/

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(com.example.yannamreddy.onewaybinding.BR.age);
    }



}