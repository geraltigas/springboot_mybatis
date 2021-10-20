package com.geraltigas.service;

import com.geraltigas.midclass.CrossSelrct;
import org.springframework.stereotype.Component;

@Component
public class CrossSelectByIdService {

    private final ScinewsService scinewsService;
    private final UserService userService;

    CrossSelectByIdService(ScinewsService scinewsService, UserService userService){
        this.scinewsService = scinewsService;
        this.userService = userService;
    }

    public CrossSelrct ClossSelectById(String id){
        return new CrossSelrct(this.userService.getUsersById(id),this.scinewsService.findByUserId(id));
    }

}
