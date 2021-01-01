package ch.hearc.ig.guideresto.persistence.reladomo;

import com.gs.fw.common.mithra.MithraManagerProvider;
import java.util.function.Supplier;

public class ReladamoDataSource {
  public static <T> T inTransaction(Supplier<T> inTransaction) {
    return MithraManagerProvider.getMithraManager().executeTransactionalCommand(__ -> inTransaction.get());
  }

  public static void inTransaction(Runnable inTransaction) {
    MithraManagerProvider.getMithraManager().executeTransactionalCommand(__ -> {
      inTransaction.run();
      return null;
    });
  }

}
