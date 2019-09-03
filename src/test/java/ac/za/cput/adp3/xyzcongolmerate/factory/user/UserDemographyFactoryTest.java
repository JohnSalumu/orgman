package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {
        UserDemography ud = UserDemographyFactory.buildUserDemography("try@try.com", "Mr", "1", "1", new Date());
        assertNotNull(ud);
        assertEquals("test@test.com", ud.getUserEmail());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserDemographyFactory class
         * 4. Assert that the an object is created.
         */
    }
}