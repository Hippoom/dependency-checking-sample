package sample.messaging;

import sample.domain.ADomainObject;
import org.apache.log4j.Logger;
import sample.domain.AnotherDomainObject;

public class AMessagingImplOfADomainObject implements ADomainObject {
    private Logger logger = Logger.getLogger(this.getClass());
    private AnotherDomainObject anotherDomainObject;
}
