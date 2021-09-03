package Øving1;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;


class MethodsTest {
    @Test
    void shouldConvert1ToI() {
        assertEquals("I", Methods.toRoman(1));
    }

}