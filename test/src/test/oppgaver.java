package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class oppgaver {

    private String toRoman(int i) {
        return "I";
    }

    @Test
    void shouldConvert1toI(){
        assertEquals("I", toRoman(1));
    }

    
}
