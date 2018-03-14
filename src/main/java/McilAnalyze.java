import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class McilAnalyze {

    private Data data;
    private String response;
    private boolean isSpouse;

    public McilAnalyze(String response, boolean isSpouse) throws JAXBException, XMLStreamException, IOException {
        this.response = response;
        this.isSpouse = isSpouse;
        try (InputStream stream = new ByteArrayInputStream(this.response.getBytes("UTF-8"))) {
            JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
            XMLInputFactory xif = XMLInputFactory.newInstance();
            XMLStreamReader xsr = xif.createXMLStreamReader(stream, "UTF-8");

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            this.data = (Data) unmarshaller.unmarshal(xsr);

            System.out.println(this.data + this.data.toString());
            xsr.close();

        }
    }


    public void run() {

        if (data.queries.queriesBySectors.sectorsQueries.sectorQueries != null) {
            List<Queries.QueryCount> queryCount = data.queries.queriesBySectors.sectorsQueries.sectorQueries.get(12).queryCount;
            System.out.println(queryCount);
        }
    }


}
