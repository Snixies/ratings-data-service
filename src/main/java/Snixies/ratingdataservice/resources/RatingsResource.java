package Snixies.ratingdataservice.resources;

import Snixies.ratingdataservice.models.Rating;
import Snixies.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{beerId}")
    public Rating getRating (@PathVariable("beerId") int beerId){
        return new Rating(beerId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating (@PathVariable("userId") int userId){
        List<Rating> ratings = Arrays.asList(
                new Rating(1,4),
                new Rating(2,5)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRatings(ratings);
        return userRating;
    }
}
