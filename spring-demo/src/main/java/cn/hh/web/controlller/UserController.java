package cn.hh.web.controlller;

import cn.hh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/user2")
    public List<User> findUser2(String name){
        System.out.println("传来的参数"+name);
        List<User> list=new ArrayList<>();
        list.add(new User("tom1","男"));
        list.add(new User("tom2","男"));
        list.add(new User("tom3","男"));
        return list;
    }
        public List<User> findUser(){
            List<User> list=new ArrayList<>();
            list.add(new User("tom1","男"));
            list.add(new User("tom2","男"));
            list.add(new User("tom3","男"));
            return list;
        }
}
