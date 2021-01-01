package ch.hearc.ig.guideresto.application;

import ch.hearc.ig.guideresto.persistence.AbstractDAOFactory;
import ch.hearc.ig.guideresto.presentation.CLI;
import ch.hearc.ig.guideresto.service.RestaurantService;
import com.gs.fw.common.mithra.MithraManager;
import com.gs.fw.common.mithra.MithraManagerProvider;
import java.io.InputStream;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;

public class Main {

  public static void main(String[] args) {
    BasicConfigurator.configure();

    MithraManager mithraManager = MithraManagerProvider.getMithraManager();
    InputStream is = Main.class
        .getResourceAsStream("/MithraRuntimeConfig.xml");
    mithraManager.readConfiguration(is);

    var scanner = new Scanner(System.in);
    var restaurantService = new RestaurantService(AbstractDAOFactory.getDAOFactory());
    var printStream = System.out;
    var cli = new CLI(scanner, printStream, restaurantService);
    cli.start();
  }
}
