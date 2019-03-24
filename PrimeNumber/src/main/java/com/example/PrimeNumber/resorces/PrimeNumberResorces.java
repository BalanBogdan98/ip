package com.example.PrimeNumber.resorces;

import com.example.PrimeNumber.models.Nrp;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/prim")

public class PrimeNumberResorces {
    @RequestMapping("/{userId}")
    public List<Nrp> getCatalog(@PathVariable("userId") String userId){
        return Collections.singletonList(
                new Nrp(-3)
        );
    }
}
