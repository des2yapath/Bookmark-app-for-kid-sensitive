package bookmarkio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import bookmarkio.constants.MovieGenre;
import bookmarkio.managers.BookmarkManager;



public class MovieTest {

    @Test
    void testIsKidFriendlyEligible() {
        // Test using the "Sector 36" movie from your data, which has the CRIME genre.
        // This test expects that the CRIME genre is not kid-friendly.
        Movie movie = BookmarkManager.getInstance().createMovie(3002, "https://www.netflix.com/in/title/81447464", "Sector 36", 2024, new String[]{"Aditya Nimbalkar"}, new String[]{"Vikrant Massey", "Deepak Dobriyal"}, MovieGenre.CRIME, 7.2);

        // Call the method to be tested
        boolean isKidFriendly = movie.isKidFriendlyEligible();

        // Assert that the result is false, as a crime movie should not be kid-friendly.
        assertFalse(isKidFriendly, "for CRIME Genre - isKidFriendly must be false");
    }

}
