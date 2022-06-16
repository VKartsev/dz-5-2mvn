import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    public SQRServiceTest() {
    }

    @ParameterizedTest
    @CsvSource({
            "1000,10000,68",
            "100,1000,22",
            "200,300,3",
            "100,10000,90"
    })
    public void test(int min, int max, int x) {
        SQRService service = new SQRService();
        int actual = service.calculate(min, max);
        Assertions.assertEquals(x, actual);
    }
}

