public class OddsAndEvens {
	// this method returns how many elements in array are odd
	// when odd is true. When odd is false, it returns how many
	// elements are even.
	public static int countEm(int[] array, boolean odd) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (odd) {
				if (array[i] % 2 == 1) {
					count++;
				}
			} else {
				if (array[i] % 2 == 0) {
					count++;
				}
			}
		}
		return count;
	}

	// use the method countEm in the next two methods
	public static int[] getAllEvens(int[] array) {
		int num = countEm(array, false);
		int[] arr = new int[num];
		int x = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				arr[x] = array[i];
				x++;
			}
		}

		return arr;
	}

	public static int[] getAllOdds(int[] array) {
		int num = countEm(array, true);
		int[] arr = new int[num];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				arr[index] = array[i];
				index++;
			}
		}

		return arr;
	}
}
