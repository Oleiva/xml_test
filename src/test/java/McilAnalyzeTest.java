import org.junit.Test;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class McilAnalyzeTest  {

    @Test
    public void test() throws Exception {
        boolean isSpouse = false;

        ClassLoader classLoader = getClass().getClassLoader();
        String response = new String(Files.readAllBytes(Paths.get(classLoader.getResource("test.xml").getFile())));

        try {
            McilAnalyze mcilAnalyze = new McilAnalyze(response, isSpouse);
            mcilAnalyze.run();

        } catch (JAXBException | XMLStreamException | IOException e) {
            System.out.println("JAXBException "+e);
        }


    }



}