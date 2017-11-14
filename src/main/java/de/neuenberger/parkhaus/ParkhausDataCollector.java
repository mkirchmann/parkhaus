package de.neuenberger.parkhaus;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;

import de.neuenberger.parkhaus.data.CplxParkhausData;

public class ParkhausDataCollector {

	private Unmarshaller unmarshaller;

	public ParkhausDataCollector() throws JAXBException {
		this(createUnmarshaller());
	}

	private static Unmarshaller createUnmarshaller() throws JAXBException {
		System.setProperty("javax.xml.bind.context.factory", "org.eclipse.persistence.jaxb.JAXBContextFactory");
		String name = CplxParkhausData.class.getPackage().getName();
        JAXBContext jc = JAXBContext.newInstance(name);
        
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
        unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
		return unmarshaller;
	}

	public ParkhausDataCollector(Unmarshaller theUnmarshaller) {
		unmarshaller = theUnmarshaller;
	}

	public static void main(String[] args)
			throws JAXBException, URISyntaxException, ClientProtocolException, IOException {

		ParkhausDataCollector parkhausDataCollector = new ParkhausDataCollector();
		String[] ids = new String[] { //
				"18944" // Alte Oper
				, "24277" // Boerse
				, "18499" // Westend
				, "107772" // Goetheplatz
				, "18493" // Junghofstraße
				, "18492" // Schiller-Passage
				, "105480" // Am Theater
				, "105479" // Baseler Platz
				, "24281" // Hbf.-Süd
				, "18496" // Dom Römer
				, "18497" // Hauptwache
				, "24279" // Konstabler
				, "18495" // Am Gericht
				, "18494" // Konrad-Adenauer-Straße
		};
		try (OutputStream fos = new FileOutputStream("log" + System.currentTimeMillis() + ".csv");) {
			while (true) {
				for (String id : ids) {
					try {
						Source source = getStreamFromHttp(id);
						CplxParkhausData unmarshal = parkhausDataCollector.read(source);
						String output = output(unmarshal);
						fos.write(output.getBytes());
						System.out.print(output);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				fos.flush();
				try {
					Thread.sleep(5000 * 60);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
    }
    
	private static String output(CplxParkhausData unmarshal) {
		StringBuilder builder = new StringBuilder();
		builder.append("\n");
		builder.append(unmarshal.getName()).append("\t");
		builder.append(unmarshal.getParkingFacilityStatusTime().toGregorianCalendar().getTime()).append("\t");
		builder.append(unmarshal.getFreespaces()).append("\t");
		builder.append(unmarshal.getOccupiedspaces()).append("\t");
		builder.append(unmarshal.getAllspaces()).append("\t");
		builder.append(unmarshal.getParkingFacilityOccupancy()).append("\t");
		return builder.toString();
	}

	public CplxParkhausData read(Source source) throws JAXBException {
		return unmarshaller.unmarshal(source, CplxParkhausData.class).getValue();
	}



	private static Source getStreamFromHttp(String id) throws URISyntaxException, IOException, ClientProtocolException {
        HttpClientBuilder builder = HttpClientBuilder.create();

		// HttpHost proxy = new HttpHost("hostname",8080,"http");
		// builder.setProxy(proxy );
		// CredentialsProvider credentialsProvider = new
		// BasicCredentialsProvider();
		// credentialsProvider.setCredentials(
		// new AuthScope("hostname", 8080),
		// new UsernamePasswordCredentials("username", "passwprd"));
		// builder.setDefaultCredentialsProvider(credentialsProvider);

        HttpClient httpClient = builder.build();
        URI uri = new URI("http://www.parkhausfrankfurt.de/_extern/mdm_import/PBG/_extern/mdm_import/2781002/"+id+".json");
        HttpUriRequest request = new HttpGet(uri );
        HttpResponse response = httpClient.execute(request );
        InputStream content = response.getEntity().getContent();
        return new StreamSource(content);
    }
}
