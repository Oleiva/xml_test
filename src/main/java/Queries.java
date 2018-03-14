
import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "QUERIES")
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
public class Queries {

    @XmlElement(name = "QueriesBySectors")
    public QueriesBySectors queriesBySectors;

    @XmlAccessorType(XmlAccessType.PROPERTY)
    public static class QueriesBySectors {
        @XmlElement(namespace = "http://tempuri.org/",name = "SectorsQueries")
//        @XmlElement(name = "SectorsQueries")
        public SectorsQueries sectorsQueries;

        @Override
        public String toString() {
            return "QueriesBySectors{" +
                    "sectorsQueries=" + sectorsQueries +
                    '}';
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class SectorsQueries{
        @XmlElement(name = "SectorQueries")
        public List<SectorQueries> sectorQueries;

        @Override
        public String toString() {
            return "QueriesBySectors{" +
                    "sectorQueries=" + sectorQueries +
                    '}';
        }
    }


    public static class SectorQueries {
        @XmlElement(name = "SectorNameLT")
        public String sectorNameLT;

        @XmlElement(name = "SectorNameEN")
        public String SectorNameEN;

        @XmlElement(name = "QueryCount")
        public List<QueryCount> queryCount;

        @Override
        public String toString() {
            return "SectorQueries{" +
                    "sectorNameLT='" + sectorNameLT + '\'' +
                    ", SectorNameEN='" + SectorNameEN + '\'' +
                    ", queryCount='" + queryCount + '\'' +
                    '}';
        }
    }

    public static class QueryCount{
        @XmlAttribute(name="Days")
        public long days;

        @XmlAttribute(name="Count")
        public long count;

        @Override
        public String toString() {
            return "QueryCount{" +
                    "days=" + days +
                    ", count=" + count +
                    '}';
        }
    }



    @Override
    public String toString() {
        return "Queries{" +
                "queriesBySectors=" + queriesBySectors +
                '}';
    }
}

