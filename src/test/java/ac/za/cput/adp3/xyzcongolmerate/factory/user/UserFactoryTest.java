package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {
        User u = UserFactory.buildUser("try@test.com", "John", "Salumu");
        assertNotNull(u);
        assertEquals("try@try.com", u.getUserEmail());
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 1. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 2. Test the UserFactory class
         * 3. Assert that the an object is created.
         */
    }
}