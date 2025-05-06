import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll(){
        System.out.println("\n### Один раз перед всеми тестами\n");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("### Один раз после всех тестов\n");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("### Перед каждым тестом");
        result = getResult();
    }

    @AfterEach
    void afterEach(){
        System.out.println("### После каждого теста\n");
        result = 0;
    }

    @Test
    void firstTest() {
        System.out.println("###     1-ый тест");
        Assertions.assertTrue(result > 2);
    }

    private int getResult() {
        return 3;
    }

    @Test
    void secondTest() {
        System.out.println("###     2-ый тест");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void thirdTest() {
        System.out.println("###     3-ый тест");
        Assertions.assertTrue(result > 2);
    }
}
