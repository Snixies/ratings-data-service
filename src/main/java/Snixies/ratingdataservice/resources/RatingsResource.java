package Snixies.ratingdataservice.resources;

import Snixies.ratingdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{beerId}")
    public Rating getRating (@PathVariable("beerId") int beerId){
        return new Rating(beerId, 4);
    }
}
