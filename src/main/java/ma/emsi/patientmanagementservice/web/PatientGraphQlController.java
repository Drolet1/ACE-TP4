package ma.emsi.patientmanagementservice.web;

import lombok.AllArgsConstructor;
import ma.emsi.patientmanagementservice.dtos.PatientDto;
import ma.emsi.patientmanagementservice.entities.Patient;
import ma.emsi.patientmanagementservice.mapper.PatientMapper;
import ma.emsi.patientmanagementservice.repositories.PatientRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientGraphQlController {

    private final PatientRepository patientRepository;
    private PatientMapper patientMapper;

    @QueryMapping
    public List<Patient> allPatients() {
        return patientRepository.findAll();
    }

//    @QueryMapping
//    public Patient patientById(@Argument Long id) {
//        Patient patient = patientRepository.findById(id).orElse(null);
//        if(patient == null) throw new RuntimeException(String.format("Patient %s not found ", id));
//        return patient;
//    }

    @QueryMapping
    public Patient patientById(@Argument Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
    }

    @MutationMapping
    public Patient savePatient(@Argument PatientDto patient) {
        Patient c = patientMapper.fromPatientDtoToPatientEntity(patient);
        return patientRepository.save(c);
    }
}
