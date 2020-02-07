package com.dsh.cons;

import com.dsh.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Reference
    TicketService   ticketService;
    public void bugTicket() throws InterruptedException{
        String res=ticketService.sellTicket("dsh");
        Thread.sleep(10000);
        System.out.println("获得信息为"+res);
    }
}
