package com.github.slayful.jukitogradle;

import static org.junit.Assert.assertEquals;

import org.jukito.JukitoModule;
import org.jukito.JukitoRunner;
import org.jukito.UseModules;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

/* These tests will pass normally */
@RunWith(JukitoRunner.class)
@UseModules({AnyClassTest.Module.class})
public class AnyClassTest {

  @Inject
  private Anything sut;

  @Test
  public void sayHello() {
    assertEquals("Hello, World!", sut.sayHello());
  }

  public static class Module extends JukitoModule {

    @Override
    protected void configureTest() {
      bind(Anything.class).toInstance(new PoliteAnything());
    }
  }
}