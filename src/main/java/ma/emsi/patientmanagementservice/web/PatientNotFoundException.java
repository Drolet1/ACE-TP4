package ma.emsi.patientmanagementservice.web;

public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException(Long id) {
        super(String.format("Patient %d not found", id));
    }
}