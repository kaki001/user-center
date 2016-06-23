package test.parent;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

//@WebAppConfiguration
@ContextConfiguration({
        "classpath*:spring/application-uc-service.xml"
})

public abstract class BaseTest {


}
