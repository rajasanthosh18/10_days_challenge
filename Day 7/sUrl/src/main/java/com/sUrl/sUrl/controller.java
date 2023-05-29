package com.sUrl.sUrl;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @Autowired
    service s ;

    @PostMapping("/generate")
    public List<url> getAllURL(){
        return service.getURL();
    }

}
