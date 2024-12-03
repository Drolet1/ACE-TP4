package ma.emsi.patientmanagementservice.mapper;

import ma.emsi.patientmanagementservice.dtos.PatientDto;
import ma.emsi.patientmanagementservice.entities.Patient;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Patient fromPatientDtoToPatientEntity(PatientDto patientDto) {
        Patient patient = modelMapper.map(patientDto, Patient.class);
        return patient;
    }
}
