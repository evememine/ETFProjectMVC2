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
	/**������ �̸� */
	private String name;
	/** ������ ����*/
	private int Age;
	/**������ �ڻ� */
	private String asset;
	/** ������ �޴�����ȣ */
	private String PhoneNumber;
}
