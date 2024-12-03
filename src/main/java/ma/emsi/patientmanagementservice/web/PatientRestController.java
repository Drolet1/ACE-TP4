package ma.emsi.patientmanagementservice.web;

import lombok.AllArgsConstructor;
import ma.emsi.patientmanagementservice.entities.Patient;
import ma.emsi.patientmanagementservice.repositories.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PatientRestController {
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> patientList() {
        return patientRepository.findAll();
    }

    @GetMapping("/patients/{id}")
    public Patient patientById(@PathVariable Long id) {
        return patientRepository.findById(id).get();
    }

    @PostMapping("/patients")
    public Patient patientById(@RequestBody Patient patient) {
        patientRepository.save(patient);
        return patient;
    }
}
