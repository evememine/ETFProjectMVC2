package financial.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class ETFManager {
	/** 판매자 이름 */
	private String name;
	/** 판매자 나이 */
	private int Age;
	/** 판매자 직급 */
	private String rank;
	/** 판매자 휴대폰 번호 */
	private String PhoneNumber;

}
