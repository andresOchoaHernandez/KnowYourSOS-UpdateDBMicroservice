package knowyoursos.updatedbmicroservice.services;

import knowyoursos.updatedbmicroservice.entities.Ambulance;
import knowyoursos.updatedbmicroservice.entities.Country;
import knowyoursos.updatedbmicroservice.entities.Fire;
import knowyoursos.updatedbmicroservice.entities.Police;
import knowyoursos.updatedbmicroservice.repositories.AmbulanceRepository;
import knowyoursos.updatedbmicroservice.repositories.CountryRepository;
import knowyoursos.updatedbmicroservice.repositories.FireRepository;
import knowyoursos.updatedbmicroservice.repositories.PoliceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UpdateDBService {

    private final CountryRepository countryRepository;
    private final AmbulanceRepository ambulanceRepository;
    private final FireRepository fireRepository;
    private final PoliceRepository policeRepository;

    private final WebClient webClient = WebClient.create();

    public boolean updateDB(){

        String url = "https://raw.githubusercontent.com/EmergencyNumberAPI/data/refs/heads/master/data.json";

        String result = webClient.get()
                                       .uri(url)
                                       .retrieve()
                                       .bodyToMono(String.class)
                                       .block();
        System.out.println(result);

        return true;
    }

    public List<Ambulance> getAllAmbulanceNumbers() {
        return ambulanceRepository.findAll();
    }

    public List<Fire> getAllFireNumbers() {
        return fireRepository.findAll();
    }

    public List<Police> getAllPoliceNumbers() {
        return policeRepository.findAll();
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}