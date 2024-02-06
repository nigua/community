package com.newcode.community.until;

import com.newcode.community.entity.User;
import com.newcode.community.service.UserService;
import org.springframework.stereotype.Component;

/**
 * 持有用户的信息，用于代替session对象
 */
@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user){
        users.set(user);
    }
    public User getUser(){
        return users.get();
    }

    public void clear(){
        users.remove();
    }


}
