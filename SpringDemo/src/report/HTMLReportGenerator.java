package report;

import org.springframework.stereotype.Component;

@Component(value="htmlGenerator")
public class HTMLReportGenerator implements ReportGenerator {

	@Override
	public String generateReport(int recordsPerPage) {
		// TODO Auto-generated method stub
		return "Generated report in HTML with"+recordsPerPage+" records";
	}

}
