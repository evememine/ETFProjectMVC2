package financial.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ETFproject {
	/** ETF �̸� */
	private String etfName;
	
	/** ETF DTO */
	private ETF projectEtf;

	/** ETF ������ */
	private ETFCustomer projectEtfCustomer;
	
	/** ETF �Ǹ��� */
	private ETFManager projectEtfManager;
	
	/** ������Ʈ ������ */
	private String startDate;

	/** ����Ǵ� project�� �� ���� */
	private String EtfProjectDetail;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(System.getProperty("line.separator"));
		builder.append("ETFProject [etfName=");
		builder.append(etfName);
		builder.append(System.getProperty("line.separator"));
		builder.append("ETF ��ü : ");
		builder.append(projectEtf);
		builder.append(System.getProperty("line.separator"));
		builder.append("������ : ");
		builder.append(projectEtfCustomer);
		builder.append(System.getProperty("line.separator"));
		builder.append("�Ǹ��� : ");
		builder.append(projectEtfManager);
		builder.append(System.getProperty("line.separator"));
		builder.append("ETF �ż��� ��¥ : ");
		builder.append(startDate);
		builder.append(", ������Ʈ �� ���� : ");
		builder.append(EtfProjectDetail);
		builder.append("]");
		builder.append(System.getProperty("line.separator"));
		return builder.toString();
	}


}
