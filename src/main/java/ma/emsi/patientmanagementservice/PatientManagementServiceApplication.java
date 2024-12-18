package ma.emsi.patientmanagementservice;

import ma.emsi.patientmanagementservice.entities.Patient;
import ma.emsi.patientmanagementservice.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PatientManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientManagementServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(Patient.builder().name("Zineb").email("Zineb@gmail.com").description_diagnostic("Check-up").build());
            patientRepository.save(Patient.builder().name("Ahmed").email("Ahmed@gmail.com").description_diagnostic("Scanner").build());
            patientRepository.save(Patient.builder().name("Ayoub").email("Ayoub@gmail.com").description_diagnostic("Medical Analysis").build());
            patientRepository.save(Patient.builder().name("Rayan").email("Rayan@gmail.com").description_diagnostic("Check-up").build());
        };
    }

}
