package code;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Log {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> logs = Arrays.asList(
			    "2025-09-17T10:15:30|INFO|System started",
			    "2025-09-17T10:16:00|ERROR|Null pointer exception",
			    "2025-09-17T10:17:00|ERROR|Database connection failed",
			    "2025-09-18T09:00:00|ERROR|Timeout occurred",
			    "2025-09-18T09:05:00|INFO|User login",
			    "2025-09-18T09:10:00|ERROR|Disk full"
			);
		Map<String, Long> map = logs.stream().filter(e->e.contains("|ERROR|"))
				.collect(Collectors.groupingBy(e->e.substring(0,10),Collectors.counting()));
		System.out.print("output "+map);
	}

}
