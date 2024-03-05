package com.groupeisi.projetcid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
public class CIDController {
    public List<Object> search(){
        return List.of(new CID(1, "Hello", 1));
    }
}
