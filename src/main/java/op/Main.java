package op;

import io.netty.channel.AbstractChannel;
import io.netty.channel.socket.nio.NioDatagramChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class Main {
  private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    LOGGER.info("Hello World!");

    AbstractChannel ac = new NioDatagramChannel();
    boolean registered = ac.isRegistered();
    LOGGER.info("registered = {}", registered);
  }

}
