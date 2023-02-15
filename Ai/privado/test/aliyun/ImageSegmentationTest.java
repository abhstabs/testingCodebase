

    package ai.privado.test.aliyun;

    import com.aliyun..imageseg.ImageSegmentation;

    public class ImageSegmentationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ImageSegmentation imageSegmentation = new ImageSegmentation();
            imageSegmentation.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    