package com.gourav.scamReportApp.repository;


import com.gourav.scamReportApp.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepo extends JpaRepository<Email,String> {
}
