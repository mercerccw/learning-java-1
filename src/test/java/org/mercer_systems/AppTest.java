package org.mercer_systems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void testIsEven() {
        assertTrue(App.isEven(0));
        assertTrue(App.isEven(2));
        assertFalse(App.isEven(5));
        assertFalse(App.isEven(101));
    }
    @Test
    public void testFooBar() {
        Assert.assertEquals("Foo",App.fooBar(3));
        Assert.assertEquals("Bar", App.fooBar(5));
        Assert.assertEquals("FooBar", App.fooBar(15));
        Assert.assertEquals("Whoops", App.fooBar(4));
    }
    @Test
    public void testFibonacci() {
        Assert.assertEquals(2, App.fibonacci(3));
        Assert.assertEquals(13, App.fibonacci(7));
        Assert.assertEquals(75025, App.fibonacci(25));
        Assert.assertEquals(832040, App.fibonacci(30));
    }
}
