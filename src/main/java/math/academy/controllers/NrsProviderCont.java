package math.academy.controllers;

import math.academy.services.NrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class NrsProviderCont {


    @Autowired
    private NrsService nrsService;

    @RequestMapping("/new_number")
    public List<Double> getNumber(){
        return nrsService.getNumber();
    }

    @RequestMapping( method = RequestMethod.POST, value = "/numbers")
    public void addCategory(@RequestBody double[] numbers){
        nrsService.vlaidateAnswer(numbers);
    }

    @RequestMapping("/result")
        public double getResult(){
            return nrsService.result;
        }

}


