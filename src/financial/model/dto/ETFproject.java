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

public class ETFProject {
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
		return "ETFProject [etfName=" + etfName + ", projectEtf=" + projectEtf + ", projectEtfCustomer="
				+ projectEtfCustomer + ", projectEtfManager=" + projectEtfManager + ", startDate=" + startDate
				+ ", EtfProjectDetail=" + EtfProjectDetail + "]";
	}
	


}
