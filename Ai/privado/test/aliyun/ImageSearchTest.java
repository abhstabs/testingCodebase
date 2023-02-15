

    package ai.privado.test.aliyun;

    import com.aliyun.imagesearch.ImageSearch;

    public class ImageSearchTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ImageSearch imageSearch = new ImageSearch();
            imageSearch.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    