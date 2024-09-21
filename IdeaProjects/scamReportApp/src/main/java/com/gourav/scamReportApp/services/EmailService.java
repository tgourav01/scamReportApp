package com.gourav.scamReportApp.services;


import com.gourav.scamReportApp.model.Email;
import com.gourav.scamReportApp.repository.EmailRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmailService {
       @Autowired
      private EmailRepo emailRepo;

        public int searchEmail(String email){
            Optional<Email> obj =emailRepo.findById(email);
            if(obj.isPresent()) return obj.get().getReportCount();
            return 0;
        }

        public void reportEmail(Email email){
             Optional<Email> obj=emailRepo.findById(email.getEmail());
             if(obj.isPresent()){
                 int count=obj.get().getReportCount()+1;
                 obj.get().setReportCount(count);
                    emailRepo.save(obj.get());
             }
             else{
                  email.setReportCount(1);
                  emailRepo.save(email);
             }
        }
}
