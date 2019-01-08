# Minimal example of failing tests

The tests will fail under the following circumstances:
* Gradle (5.1)[https://github.com/slayful/minimal-jukito-gradle-5.1-failing-project/blob/master/gradle/wrapper/gradle-wrapper.properties#L3] (Gradle 5.0 works just fine)
* JUnit 5's useJUnitPlatform [is used](https://github.com/slayful/minimal-jukito-gradle-5.1-failing-project/blob/master/build.gradle#L10)
* Jukito's @All annotation [is used](https://github.com/slayful/minimal-jukito-gradle-5.1-failing-project/blob/master/src/test/java/com/github/slayful/jukitogradle/NotPassingTest.java#L14) and at least two instances are bound to it
