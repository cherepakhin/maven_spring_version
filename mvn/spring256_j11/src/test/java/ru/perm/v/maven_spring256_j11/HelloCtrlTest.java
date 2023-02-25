package ru.perm.v.maven_spring256_j11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloCtrlTest {

    @Test
    void get() {
        HelloCtrl helloCtrl = new HelloCtrl();
        HelloDto hello = helloCtrl.get();
        HelloDto sample = new HelloDto();
        assertEquals(sample, hello);
    }
}