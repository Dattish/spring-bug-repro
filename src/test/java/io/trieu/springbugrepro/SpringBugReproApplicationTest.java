package io.trieu.springbugrepro;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = SpringBugReproApplication.class)
class SpringBugReproApplicationTest {

	@Test
	void contextLoads() {
	}

}
