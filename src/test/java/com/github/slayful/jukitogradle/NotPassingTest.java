package com.github.slayful.jukitogradle;

import static org.junit.Assert.assertEquals;

import org.jukito.*;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JukitoRunner.class)
@UseModules({NotPassingTest.Module.class})
public class NotPassingTest {

  @Test
  public void sayHello(@All("any-name") Anything sut) {
    assertEquals("Hello, World!", sut.sayHello());
  }
  @Test
  public void sayBello(@All("any-name") Anything sut) {
    assertEquals("Hello, World!", sut.sayHello());
  }

  public static class Module extends JukitoModule {

    @Override
    protected void configureTest() {
      bindManyNamedInstances(Anything.class, "any-name", new PoliteAnything(), new PoliteAnything());
    }
  }
}