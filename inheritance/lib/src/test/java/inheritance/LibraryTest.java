/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void testRestaurantClass() {
        Restaurant testRestaurant = new Restaurant("Fire Fly");
        testRestaurant.setStars(5);
        testRestaurant.setPrice(5);
        String result = "Name: Fire Fly, Total Rate: 5.0, price category: $$$$$, Review: No review added.";
        assertEquals(result , testRestaurant.toString());
    }

    @Test void testReviewClass() {
        Review testReview = new Review( "Good one" ,  "Anas",  5);
        String result = "{Author: Anas, body: Good one, Rate: 5}";
        assertEquals(result , testReview.toString() );
    }

    @Test void testRestaurantWithReview() {
        Restaurant restaurantWithReview = new Restaurant("Dalalah");
        restaurantWithReview.setStars(2);
        restaurantWithReview.setPrice(5);
        restaurantWithReview.addReview("Normal" , "Anas", 2);
        restaurantWithReview.addReview("Normal" , "Anas", 0);
        restaurantWithReview.addReview("Not Bad" , "Anssam", 3);
        String result = "Name:Dalalah, Total Rate: 2.33, price category: $$$$$, Review: [{Author: Anas body: Normal, Rate: 2}, {Author: Anssam, body: Not Bad, Rate: 3}]";
        assertEquals(result , restaurantWithReview.toString() );
    }
}
