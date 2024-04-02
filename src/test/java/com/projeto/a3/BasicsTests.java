package com.projeto.a3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicsTests {
    @Test
    public void compare() {
        Basics basicTests = new Basics();
        int value = basicTests.compare(2,1);
        Assertions.assertEquals(1, value);
    }
}
