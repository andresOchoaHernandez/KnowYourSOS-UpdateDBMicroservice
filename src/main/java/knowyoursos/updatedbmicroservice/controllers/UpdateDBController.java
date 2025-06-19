package knowyoursos.updatedbmicroservice.controllers;

import knowyoursos.updatedbmicroservice.services.UpdateDBService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/updatedb")
public class UpdateDBController {

    private final UpdateDBService updateDBService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Boolean> getAllCountries()
    {
        return ResponseEntity.ok(updateDBService.updateDB());
    }
}
