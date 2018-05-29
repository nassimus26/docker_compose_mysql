package org.jenkins.mysql.test;

import org.assertj.core.api.Assertions;
import org.jenkins.mysql.test.model.User;
import org.jenkins.mysql.test.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testInsertUser() {
        userRepository.save(User.builder().name("nassimus").build());
        User user = userRepository.findByName("nassimus");
        Assertions.assertThat(user).isNotNull();
    }

}
