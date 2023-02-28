package ru.perm.v.maven_spring302_j11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckJavaVersionTest {
    @Test
    void checkJavaVersion() {
        String version = System.getProperty("java.version");
        assertEquals("11.0.10", version);
    }
}
