package com.hana.distTranSample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
class DistTranSampleApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("실패테스트")
	void sampleTest2() {
		assertThat("abc").isNotEqualTo(123);
	}

	@Test
	@DisplayName("성공테스트")
	void a_few_simple_assertions(){
		assertThat("The Lord of the Rings").isNotNull()
			.startsWith("The")
			.contains("Lord")
			.endsWith("Rings");
	}
}
