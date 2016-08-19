package bundle1.tests;

import org.junit.Test;

import bundle1.Dummy;

import org.junit.Assert;

public class DummyTest {
	@Test
    public void test() {
    	Assert.assertNotNull(Dummy.helloDummy("Niels"));
    }
}
