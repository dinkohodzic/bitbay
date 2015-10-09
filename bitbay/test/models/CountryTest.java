package models;

import org.junit.Before;
import org.junit.Test;
import play.test.WithApplication;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;

/**
 * Created by Adnan on 18.09.2015..
 */
public class CountryTest extends WithApplication {

    @Before
    public void configureDatabase(){
        fakeApplication(inMemoryDatabase());
    }

    @Test
    public void newCountryTest(){
        Country c = new Country();
        c.name = "BiH";
        c.save();

    }

    @Test
    public void findCountry(){
        Country country = Country.findCountryByName("Sweden");
        assertNull(country);
    }

    @Test
    public void recommendationTest(){
        User u = new User();
        u.firstName = "Enver";
        Category c = new Category("Water");
        Recommendation r = new Recommendation(u, c);
        r.save();
        assertNotNull(r);

    }
}
