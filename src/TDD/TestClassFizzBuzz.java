package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	int input = fizzBuzz.getInt(1);

	@Test
	void input_is_1_expect_ouput_is_1() {
		assertEquals(1, input);
	}

}
