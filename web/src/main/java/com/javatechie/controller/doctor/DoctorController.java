package com.javatechie.controller.doctor;

import com.javatechie.config.TestCommon;
import com.javatechie.model.doctor.Doctor;
import com.javatechie.service.doctor.DoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class DoctorController {

    private final DoctorService service;



    @Autowired
    public DoctorController(DoctorService service) {
        this.service = service;

    }



    @GetMapping("/doctors")
    public List<Doctor> getDoctors(){
        log.warn("your Doctor is {}");
        return service.getDoctors();
    }


}
