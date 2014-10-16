package sample.bar;

import sample.foo.Foo;
import org.apache.log4j.Logger;

public class Bar {
    private Logger logger = Logger.getLogger(this.getClass());
    private Foo foo;
}
