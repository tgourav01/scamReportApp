package com.gourav.scamReportApp.services;


import com.gourav.scamReportApp.model.Number;
import com.gourav.scamReportApp.repository.NumberRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NumberService {
    @Autowired
    private NumberRepo numberRepo;

    public void reportNumber(Number number){
      Optional< Number> num =numberRepo.findById(number.getNumber());
       if(num.isPresent()){
         int x=  num.get().getReportCount()+1;
         num.get().setReportCount(x);
         numberRepo.save(num.get());
       }
       else {
           number.setReportCount(1);
           numberRepo.save(number);
       }
   }
    public int searchNumber(long number){
      Optional< Number> num= numberRepo.findById(number);
       if(num.isPresent())return num.get().getReportCount();
       return 0;
   }
}

