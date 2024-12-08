package optionalClass;

import java.util.Optional;

import ch.qos.logback.core.net.SyslogOutputStream;

public class OptionalClassEx {
	
	public static void main(String[] args) {
		OptionalClassEx obj = new OptionalClassEx();
		obj.OptionaTesting();
	}
	
	public static Optional<String> getname(){
		
		String name = "sagar";
		return Optional.ofNullable(name);
		
	}
	
	public void OptionaTesting() {
	
	//String str = "Srtgf";
	String str = null;
	
	Optional<String> optional = Optional.ofNullable(str);
	
	boolean result = optional.isPresent();
	
	System.out.println("Result is " + result);
	
	//if optional is null then it will print it is null
	System.out.println(optional.orElse("It is null"));
	
	
	Optional<String> name = getname();
	
	System.out.println(name.orElse("It is null"));
	}
	

}
