package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
	}
	
	public int countWords(String words){
		String[] separatedWord = StringUtils.split(words, ' ');
		return (separatedWord == null) ? 0 : 0;
	}
	

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	//System.out.println(app.countWords("hola que tal"));
	
    }
}