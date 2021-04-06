package Location;

public class Location {
	
	private static Point position;
	private static Size size;
	
	public static Point getPosition() {
		return position;
	}
	public static void setPosition(Point position) {
		Location.position = position;
	}
	public static Size getSize() {
		return size;
	}
	public static void setSize(Size size) {
		Location.size = size;
	}


}
