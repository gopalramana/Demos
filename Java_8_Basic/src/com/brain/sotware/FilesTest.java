package com.brain.sotware;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*unicomp6.unicomp.net [01/Jul/1995:00:00:06 -0400] "GET /shuttle/countdown/ HTTP/1.0" 200 3985
burger.letters.com [01/Jul/1995:00:00:11 -0400] "GET /shuttle/countdown/liftoff.html HTTP/1.0" 304 0
burger.letters.com [01/Jul/1995:00:00:12 -0400]  "GET /images/NASA-logosmall.gif HTTP/1.0" 304 0*/


public class FilesTest {

	private static final String SEPARATOR = " ";

	public static void main(String[] args) {
		String fileName = "/home/ciri/eclipse-workspace/Java_8_Basic/src/com/brain/sotware/lines.txt";
		List<Host> list = new ArrayList<>();
		List<String> lines = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            
			lines=stream.collect(Collectors.toList());
			lines.forEach(line->{
					if(line!=null){
						String[] arr=line.split(SEPARATOR);
						Host host=new Host();
						host.setHostName(arr[0]);
						list.add(host);
					}
				});
         
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	     Map<String, Long> counting = list.stream().collect(Collectors.groupingBy(Host::getHostName, Collectors.counting()));
	     counting.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
      }
	}


	
class Host {

private String hostName;


/**
* @param hostName
*/
public Host(String hostName) {
super();
this.hostName = hostName;
}

public Host() {
}

/**
* @return the hostName
*/
public String getHostName() {
return hostName;
}

/**
* @param hostName the hostName to set
*/
public void setHostName(String hostName) {
this.hostName = hostName;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((hostName == null) ? 0 : hostName.hashCode());
	return result;
}


}

