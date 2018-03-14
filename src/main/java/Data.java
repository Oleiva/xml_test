import javax.xml.bind.annotation.*;


@XmlRootElement(name = "DATA")
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {

    @XmlElement(name = "QUERIES")
    public Queries queries;

    @Override
    public String toString() {
        return "" + queries;
    }
}

