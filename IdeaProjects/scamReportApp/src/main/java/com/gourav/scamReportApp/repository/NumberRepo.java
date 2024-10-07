package com.gourav.scamReportApp.repository;

import com.gourav.scamReportApp.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepo extends JpaRepository<Number,Long> {
}
