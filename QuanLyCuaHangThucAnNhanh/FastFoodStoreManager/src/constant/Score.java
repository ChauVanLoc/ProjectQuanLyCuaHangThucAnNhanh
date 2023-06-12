package constant;

public class Score {
	public static int UP_TO_SILVER = 300;
	public static int UP_TO_GOLD = 1000;
	public static int UP_TO_DIAMOND = 3000;

	private static String SILVER = "SILVER";
	private static String GOLD = "GOLD";
	private static String DIAMOND = "DIAMOND";

	public static void changeScore(String type, int targetScore) {
		if (type == SILVER) {
			UP_TO_SILVER = targetScore;
		} else if (type == GOLD) {
			UP_TO_GOLD = targetScore;
		} else if (type == DIAMOND) {
			UP_TO_DIAMOND = targetScore;
		}
	}
}
