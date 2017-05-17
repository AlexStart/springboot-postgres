package my.springboot.postgres.repository;

import my.springboot.postgres.model.User;
import my.springboot.postgres.repository.IUserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by gladivs on 16.05.2017.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@ActiveProfiles("test")
//@SpringBootTest(classes = SpringbootMysqlApplication.class)
public class UserRepositoryTest {

    @Autowired
    private IUserRepository userRepository;

    @Before
    public void setUp() throws Exception {

    }

    //TODO :
    @Test
    public void saveUserTest() {
        User user = new User();
        user.setFirstName("First Name");
        user.setLastName("Last Name");
        user.setAge(100);

        assertNull(user.getId());

        userRepository.save(user);

        assertNotNull(user.getId());

    }

    @After
    public void tearDown() throws Exception {

    }
}
