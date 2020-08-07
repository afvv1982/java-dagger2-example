import dagger.Binds;
import dagger.Module;

@Module
public interface DieselEngineModule {
	@Binds
	abstract Engine bindEngine(DieselEngine engine);
}
