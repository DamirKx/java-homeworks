package junit_tests.task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FortuneCookieControllerTest {
    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;


    @BeforeAll
    static void create(){
        goodFactoryController  = new FortuneCookieController(
                new FortuneCookieFactory(
                        new FortuneConfig(true),
                        Collections.singletonList("Вам повезло"),
                        Collections.singletonList("Следующий раз повезет")
                )
        );
        badFactoryController = new FortuneCookieController(
                new FortuneCookieFactory(
                        new FortuneConfig(false),
                        Collections.singletonList("Вам повезло"),
                        Collections.singletonList("Следующий раз повезет")
                )
        );
    }

    @Test
    public void shouldReturnPositiveFortune() {
        goodFactoryController.tellFortune();
        assertEquals("Вам повезло", goodFactoryController.tellFortune().getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune() {
        badFactoryController.tellFortune();
        assertEquals("Следующий раз повезет", badFactoryController.tellFortune().getFortuneText());
    }
}
