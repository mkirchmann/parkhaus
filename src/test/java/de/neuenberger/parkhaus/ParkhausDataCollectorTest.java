package de.neuenberger.parkhaus;

import java.io.StringReader;

import javax.xml.bind.JAXBException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import de.neuenberger.parkhaus.data.CplxParkhausData;

public class ParkhausDataCollectorTest {

	@Test
	public void test() throws JAXBException {
		CplxParkhausData parkhausData = new ParkhausDataCollector().read(getStream());

		Assertions.assertThat(parkhausData.getFreespaces()).isEqualTo(106);
	}

	static Source getStream() {
		String content = "{\n" + "\"parking_facility_reference\":\"18499[Westend]\",\n"
				+ "\"originalname\":\"18499[Westend]\",\n" + "\"id\":\"18499\",\n" + "\"name\":\"Westend\",\n"
				+ "\"parkingFacilityStatus\":\"open\",\n" + "\"open\":true,\n"
				+ "\"parking_facility_status_time\":\"2017-11-13T16:18:00.000+01:00\",\n" + "\"free\":true,\n"
				+ "\"parking_facility_occupancy\":0.8301282,\n" + "\"totalNumberOfVacantParkingSpaces\":106,\n"
				+ "\"freespaces\":106,\n" + "\"total_number_of_occupied_parking_spaces\":518,\n"
				+ "\"occupiedspaces\":518,\n" + "\"total_parking_capacity_override\":624,\n" + "\"allspaces\":624,\n"
				+ "\"total_parking_capacity_long_term_override\":0,\n"
				+ "\"total_parking_capacity_short_term_override\":624,\n" + "\"shortcode\":\"\"}";

		return new StreamSource(new StringReader(content));
	}
}
