package race;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValueTest {

	@DisplayName("사용자 입력값 중 5자를 초과한 이름이 포함된 여부 확인 테스트")
	@Test
	void 입력값_허용치_초과_테스트() {
		assertThatThrownBy(() -> {
			InputValue.ofSeparatorValues("test101010,test");
		})
			.isInstanceOf(IllegalInputNameException.class)
			.hasMessageContaining(String.format(IllegalInputNameException.ILLEGAL_INPUT_FORMAT_MESSAGE, CarName.MAX_INPUT_NAME_LENGTH));
	}
}
