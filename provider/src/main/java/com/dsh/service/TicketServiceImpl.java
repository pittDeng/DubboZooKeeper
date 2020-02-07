package com.dsh.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component//放在容器中
@Service//通过dubbo的注解将服务发布出去
public class TicketServiceImpl implements TicketService{
    @Override
    public String sellTicket(String name) {
        return "Hello"+name;
    }
}
