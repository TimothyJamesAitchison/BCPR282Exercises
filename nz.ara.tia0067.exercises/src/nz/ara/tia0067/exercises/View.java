package nz.ara.tia0067.exercises;
import java.io.IOException;

public interface View {
	public void start();
	public String get();
	public <T> void say( T words );
	public void stop() throws IOException;
}