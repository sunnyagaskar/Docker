package flights;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;


@RestController
public class FlightsController {


    private static final Flight[] flights = {
        new Flight("QF400", "MEL", "SYD", "2020-06-10T09:00:23Z", "2020-06-10T10:25:23Z"),
        new Flight("EK100", "MEL", "DXB", "2020-06-10T09:00:23Z", "2020-06-10T10:25:23Z"),
        new Flight("CX200", "MEL", "HKA", "2020-06-10T09:00:23Z", "2020-06-10T10:25:23Z")
    };

    @GetMapping("/flights")
    public Flight[] flights() {
        return flights;
    }

    @GetMapping("/flights/{id}")
    public Flight flight(@PathVariable String id) {
        for (Flight flight : flights) {
            if (flight.getflightNumber().indexOf(id)!=-1) {
                return flight;
            }
			
        } 
        throw new ResponseStatusException(
            HttpStatus.NOT_FOUND, "Entity not found"
        );        
    }

}