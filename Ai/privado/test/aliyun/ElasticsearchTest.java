

    package ai.privado.test.aliyun;

    import com.aliyun.elasticsearch.Elasticsearch;

    public class ElasticsearchTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Elasticsearch elasticsearch = new Elasticsearch();
            elasticsearch.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    