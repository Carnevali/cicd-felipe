package br.com.detinho.demos.cicdpeta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CicdPetaApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void teste1() {
		String x = "1";
		assertEquals("X deve ser igual a 1", "1", x);
	}

	@Test
	public void teste2() {
		long x = 2L;
		assertEquals("X deve ser igual a 2", 2L, x);
	}

}
