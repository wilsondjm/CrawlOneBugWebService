import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

@javax.jws.WebService(targetNamespace = "http://bugtrackingsystem.citrite.net", serviceName = "CrawlOneBugService", portName = "CrawlOneBugPort")
public class CrawlOneBugDelegate {

	CrawlOneBug crawlOneBug = new CrawlOneBug();

	public String crawlFromOneBug(String recordId) {
		return crawlOneBug.crawlFromOneBug(recordId);
	}

}