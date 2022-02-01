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
	/** ETF 이름 */
	private String etfName;
	
	/** ETF DTO */
	private ETF projectEtf;

	/** ETF 구매자 */
	private ETFCustomer projectEtfCustomer;
	
	/** ETF 판매자 */
	private ETFManager projectEtfManager;
	
	/** 프로젝트 시작일 */
	private String startDate;

	/** 진행되는 project의 상세 내용 */
	private String EtfProjectDetail;

	@Override
	public String toString() {
		return "ETFProject [etfName=" + etfName + ", projectEtf=" + projectEtf + ", projectEtfCustomer="
				+ projectEtfCustomer + ", projectEtfManager=" + projectEtfManager + ", startDate=" + startDate
				+ ", EtfProjectDetail=" + EtfProjectDetail + "]";
	}
	


}
