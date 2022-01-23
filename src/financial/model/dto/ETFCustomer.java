package financial.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class ETFCustomer {
	/**구매자 이름 */
	private String name;
	/** 구매자 나이*/
	private int Age;
	/**구매자 자산 */
	private String asset;
	/** 구매자 휴대폰번호 */
	private String PhoneNumber;
}
