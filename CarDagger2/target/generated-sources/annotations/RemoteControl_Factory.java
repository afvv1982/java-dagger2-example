import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteControl_Factory implements Factory<RemoteControl> {
  private static final RemoteControl_Factory INSTANCE = new RemoteControl_Factory();

  @Override
  public RemoteControl get() {
    return new RemoteControl();
  }

  public static RemoteControl_Factory create() {
    return INSTANCE;
  }

  public static RemoteControl newInstance() {
    return new RemoteControl();
  }
}
