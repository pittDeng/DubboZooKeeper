package com.dsh.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class NameServiceImpl implements NameService{
    public String getName(String firstName,String lastName){
        return firstName+lastName;
    }
}
