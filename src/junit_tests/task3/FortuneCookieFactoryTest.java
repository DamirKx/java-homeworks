package junit_tests.task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FortuneCookieFactoryTest {

    private static FortuneCookieFactory cookieFactory;

    @BeforeEach
    public void beforeEach() {
        cookieFactory = new FortuneCookieFactory(
                new FortuneConfig(true),
                Collections.singletonList("Вам повезло"),
                Collections.singletonList("Следующий раз повезет")
        );
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        cookieFactory.bakeFortuneCookie();
        assertEquals(1, cookieFactory.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        cookieFactory.bakeFortuneCookie();
        cookieFactory.bakeFortuneCookie();
        assertEquals(2, cookieFactory.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        cookieFactory.bakeFortuneCookie();
        assertEquals(1, cookieFactory.getCookiesBaked());

        cookieFactory.resetCookiesCreated();
        assertEquals(0, cookieFactory.getCookiesBaked());
    }
}
