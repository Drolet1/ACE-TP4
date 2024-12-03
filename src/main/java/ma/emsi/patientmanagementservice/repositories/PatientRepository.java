package ma.emsi.patientmanagementservice.repositories;

import ma.emsi.patientmanagementservice.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
