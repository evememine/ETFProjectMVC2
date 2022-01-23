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
	/** �Ǹ��� �̸� */
	private String name;
	/** �Ǹ��� ���� */
	private int Age;
	/** �Ǹ��� ���� */
	private String rank;
	/** �Ǹ��� �޴��� ��ȣ */
	private String PhoneNumber;

}
