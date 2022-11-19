import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.jetbrains.annotations.TestOnly;
import org.junit.Test;

public class TestLogAddAppender {

//    @Test
//    public void testLogAddAppender() {
//        Logger logger = Logger.getLogger(TestLogAddAppender.class);
//        ConsoleAppender appender = new ConsoleAppender();
//        logger.addAppender(appender);
//        logger.info("oi");
//    }

    @Test
    public void testLogAddAppender() {
        Logger logger = Logger.getLogger("MyLogger");
        logger.removeAllAppenders();
        logger.addAppender(new ConsoleAppender(
        new PatternLayout("%d %t %m%n"),
        ConsoleAppender.SYSTEM_OUT));
        logger.info("oi");

    }
}
