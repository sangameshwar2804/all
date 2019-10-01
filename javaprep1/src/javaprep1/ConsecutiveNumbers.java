package javaprep1;

public class ConsecutiveNumbers {
	public static int getMaxOfConsecutiveOnes(int[] arr) {

		int sum = 0;
		int finalSum = 0;

		if (arr == null || arr.length == 0) {

			return sum;
		}

		boolean oneStarted = false;

		for (int i : arr) {

			if (!oneStarted && i == 1) {

				sum += 1;
				oneStarted = true;
			} else {
				oneStarted = false;
				if (sum > finalSum) {
					finalSum = sum;
				}
				sum = 0;

			}

		}

		return finalSum;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0,0, 1, 1, 1, 1 };
		System.out.println(getMaxOfConsecutiveOnes(arr));
		;

	}
}
