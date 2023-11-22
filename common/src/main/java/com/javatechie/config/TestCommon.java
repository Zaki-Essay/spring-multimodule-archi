package com.javatechie.config;


import com.javatechie.model.doctor.Doctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


public class TestCommon {

    public String testCommonModule(){
        return "new module";
    }

}
