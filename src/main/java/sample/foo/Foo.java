package sample.foo;

import sample.bar.Bar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Bar bar;// This is a cyclic dependency

}
