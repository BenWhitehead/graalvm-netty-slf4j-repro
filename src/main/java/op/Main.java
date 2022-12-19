package op;

//import io.netty.channel.AbstractChannel;
//import io.netty.channel.socket.nio.NioDatagramChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

final class Main {
  private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    LOGGER.info("Hello World!");

    Storage storageClient = StorageOptions.getDefaultInstance().getService();


//    AbstractChannel ac = new NioDatagramChannel();
//    boolean registered = ac.isRegistered();
    LOGGER.info("registered = {}", storageClient);
  }

}
