package com.qiqi.sevice.javasevice.control;


import com.qiqi.sevice.javasevice.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;



@Controller
public class HelloController {

    @Autowired
    private LocationMapper locationMapper;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public  Object getHello() {

        return locationMapper.getAll();
    }

}
