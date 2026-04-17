package htw.webtech.foodtracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class CalorieController {

    @GetMapping(path = "/food-entry")
    public ResponseEntity<FoodEntry> getFoodEntry() {
        final FoodEntry entry = new FoodEntry("Apfel", 95, 1.0, "Anna");
        return ResponseEntity.ok(entry);
    }
}