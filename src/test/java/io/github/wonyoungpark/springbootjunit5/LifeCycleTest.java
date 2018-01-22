package io.github.wonyoungpark.springbootjunit5;

import org.junit.jupiter.api.*;

/**
 * Package : io.github.wonyoungpark.springbootjunit5
 * Developer Team : Mrblue WebPlatform Developer Team
 * Developer: wyparks2
 * Date : 2018. 1. 22.
 * Time : PM 2:48
 * Created by IntelliJ IDEA.
 */
@DisplayName("라이프사이클 테스트")
public class LifeCycleTest {

    @BeforeAll
    public static void initAll() {
        System.out.println("initAll");
    }

    @BeforeEach
    public void init() {
        System.out.println("init");
    }

    @DisplayName("호잇호잇")
    @Test
    public void someTest() {
        System.out.println("someTest");
    }

    @Disabled
    @Test
    public void anyTest() {
        System.out.println("anyTest");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("tearDownAll");
    }
}
