package io.github.wonyoungpark.springbootjunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootJunit5ApplicationTests {

	@Test
	public void contextLoads() {
        System.out.println("테스트");
        Assertions.assertTrue(true);
	}
}
