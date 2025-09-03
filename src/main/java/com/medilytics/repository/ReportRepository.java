package com.medilytics.repository;

import com.medilytics.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByUploadedBy(String uploadedBy);
}
