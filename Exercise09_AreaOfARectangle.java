/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise09_AreaOfARectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(areaOfARectangle(3, 8));
		System.out.println(areaOfARectangle(-3, 2));

	}
	/**
	 * This method returns the area of a rectangle
	 * @param height - height of rectangle
	 * @param base - base of rectangle
	 * @return
	 */
	public static int areaOfARectangle(int height, int base) {
		
		int area = 0; 
		
		if (height > 0 && base > 0) {
		area = height * base;
		} else {
			System.out.println("Invalid input");
			return -1;
		}
		return area;
	}
		
	}

