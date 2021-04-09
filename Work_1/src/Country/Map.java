package Country;

public class Map {
	
private static Settlement[] settlements;

public static Settlement[] getSettlements() {
	return settlements;
}

public static void setSettlements(Settlement[] settlements) {
	Map.settlements = settlements;
}
}
