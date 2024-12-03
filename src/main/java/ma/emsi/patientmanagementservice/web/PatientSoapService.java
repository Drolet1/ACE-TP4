package ma.emsi.patientmanagementservice.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.emsi.patientmanagementservice.dtos.PatientDto;
import ma.emsi.patientmanagementservice.entities.Patient;
import ma.emsi.patientmanagementservice.mapper.PatientMapper;
import ma.emsi.patientmanagementservice.repositories.PatientRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@WebService
public class PatientSoapService {
    private PatientRepository patientRepository;
    private PatientMapper patientMapper;

    public List<Patient> patientList() {
        return patientRepository.findAll();
    }

    @WebMethod
    public Patient patientById(@WebParam(name = "id") Long id) {
        return patientRepository.findById(id).get();
    }

    @WebMethod
    public Patient savePatient(@WebParam(name = "patient") PatientDto patientDto) {
        Patient patient = patientMapper.fromPatientDtoToPatientEntity(patientDto);
        return patientRepository.save(patient);
    }
}
