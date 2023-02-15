

    package ai.privado.test.oracle;

    import com.adobe.stock.Stock;

    public class StockTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Stock stock = new Stock();
            stock.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    