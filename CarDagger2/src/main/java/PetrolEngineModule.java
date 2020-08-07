import dagger.Binds;
import dagger.Module;

@Module
public interface PetrolEngineModule {
	@Binds
	abstract Engine bindEngine(PetrolEngine engine);
}
