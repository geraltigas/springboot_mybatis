package com.geraltigas.midclass;

import com.geraltigas.pojo.Scinews;
import com.geraltigas.pojo.User;

import java.util.List;

public class CrossSelrct {
    public User user;
    public List<Scinews> newsList;

    public CrossSelrct(List<User> user,List<Scinews> newsList){
        this.user = user.get(0);
        this.newsList = newsList;
    }
}
