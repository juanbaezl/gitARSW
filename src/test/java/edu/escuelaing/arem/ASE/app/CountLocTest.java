package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.fail;

import java.io.File;
import org.junit.*;

/**
 * Unit test for CountLoc.
 */
public class CountLocTest {
    @Test
    public void deberiaContarLineasPhyArchivo() {
        try {
            File doc = new File("src\\main\\java\\edu\\escuelaing\\arem\\ASE\\app\\CountLoc.java");
            Assert.assertEquals(55, CountLoc.contador(doc, "phy"));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaContarLineasLocArchivo() {
        try {
            File doc = new File("src\\main\\java\\edu\\escuelaing\\arem\\ASE\\app\\CountLoc.java");
            Assert.assertEquals(48, CountLoc.contador(doc, "loc"));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaContarLineasPhyDir() {
        try {
            File doc = new File("src");
            Assert.assertEquals(106, CountLoc.contadorDir(doc, "phy"));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaContarLineasLocDir() {
        try {
            File doc = new File("src");
            Assert.assertEquals(90, CountLoc.contadorDir(doc, "loc"));
        } catch (Exception e) {
            fail();
        }
    }
}