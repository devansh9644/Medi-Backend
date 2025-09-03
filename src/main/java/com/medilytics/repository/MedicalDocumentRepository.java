package com.medilytics.repository;

import com.medilytics.model.MedicalDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MedicalDocumentRepository extends JpaRepository<MedicalDocument, Long> {
    List<MedicalDocument> findByUserId(Long userId);
}
