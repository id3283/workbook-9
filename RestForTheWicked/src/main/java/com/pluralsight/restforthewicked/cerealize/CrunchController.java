package com.pluralsight.restforthewicked.cerealize;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // ← A type of @Component, this also tells Spring to treat this class as a bean
public class CrunchController {
//    private CapnCrunch capnCrunch;
//
//    @Autowired
//    public void setCapnCrunch(CapnCrunch capnCrunch) {
//        this.capnCrunch = capnCrunch;
//    }

//    @GetMapping("/greeting")  //  ← Handle get requests at http://localhost:8080 + /greeting (http://localhost:8080/greeting)
//    public String home() {
//        return "Cerealize me, Cap'n!!!";
//    }

    // HTTP CRUD
    // Create - POST
    // Read - GET
    // Update - PUT
    // Delete - DELETE

    @GetMapping("/michael")
    public String capn() throws JsonProcessingException {
        return "Mike";
    }
}