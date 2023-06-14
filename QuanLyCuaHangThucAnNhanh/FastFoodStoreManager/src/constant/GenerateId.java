package constant;

import java.util.Date;
import java.util.Random;

public class GenerateId {
	public static String generateId() {
		return new Date().toString() + new Random().nextInt();
	}
}
