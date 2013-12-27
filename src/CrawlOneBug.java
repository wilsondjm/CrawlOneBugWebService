import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;



public class CrawlOneBug {
	
	public static String oneBugURLBase = "http://onebug.citrite.net/tmtrack/tmtrack.dll?IssuePage&Template=view&TableId=1000&RecordId=";
	
    public  String crawlFromOneBug(String recordId) {
    	String newUrl = oneBugURLBase + recordId;
		URL getUrl;
		try {
			getUrl = new URL(newUrl);
			Document doc = Jsoup.parse(getUrl, 1000);
			Element status = doc.getElementById("F97");
			if (status != null)
				return status.text();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
    }
    

}