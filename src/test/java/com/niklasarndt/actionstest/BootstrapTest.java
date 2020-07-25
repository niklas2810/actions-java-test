package com.niklasarndt.actionstest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Niklas on 2020/07/25
 */
public class BootstrapTest {

    private Bootstrap instance;

    @Before
    public void setUp() {
        instance = new Bootstrap();
    }

    @Test
    public void testObvious() {
        assertTrue("What the hell happended here?!", instance.isObvious());
    }

}