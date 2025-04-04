import java.util.*;

class Notes {
	public static void main(String[] args) {
		//Merge Sort

		Random rndm = new Random();
		int[] randomArray = new int[10000000];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = rndm.nextInt(100);
		}

		// System.out.println(Arrays.toString(randomArray));

		//merge sort

		mergeSort(randomArray);

		System.out.println("\n\n\n\n");
		System.out.println(Arrays.toString(randomArray));
	}

	public static void mergeSort(int[] arr) {

		//base case
		if (arr.length < 2) { //length == 0 or == 1
			return;
		}

		//create both arrays for each side
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		//copy values to the new arrays
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		for (int i = mid; i < arr.length; i++) {
			right[i-mid] = arr[i];
		}

		mergeSort(left);
		mergeSort(right);

		merge(left, right, arr);

	}

	public static void merge(int[] left, int[] right, int[] og) {

		int leftIndex = 0;
		int rightIndex = 0;
		int ogIndex = 0;

		while (leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] < right[rightIndex]) {
				og[ogIndex] = left[leftIndex];
				leftIndex++;
				ogIndex++;
			}
			else {
				og[ogIndex] = right[rightIndex];
				rightIndex++;
				ogIndex++;
			}
		}

		while (leftIndex < left.length) {
			og[ogIndex] = left[leftIndex];
			leftIndex++;
			ogIndex++;
		}
		while (rightIndex < right.length) {
			og[ogIndex] = right[rightIndex];
			rightIndex++;
			ogIndex++;
		}



	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// public static void mergeSort(int[] arr) {

	// 	//base case

	// 	if (arr.length < 2) {//arr.length == 0 or == 1
	// 		return;
	// 	}

	// 	// recursive step

	// 	//split the array into 2

	// 	int mid = arr.length / 2;

	// 	int[] left = new int[mid];
	// 	int[] right = new int[arr.length - mid];

	// 	//copy the elements

	// 	//left array
	// 	for (int i = 0; i < left.length; i++) {
	// 		left[i] = arr[i];
	// 	}

	// 	//right array
	// 	for (int i = 0; i < right.length; i++) {
	// 		right[i] = arr[i+mid];
	// 	}

	// 	mergeSort(left);
	// 	mergeSort(right);

	// 	merge(left, right, arr);
		
	// }

	// public static void merge(int[] left, int[] right, int[] og) {

	// 	int leftIndex = 0;
	// 	int rightIndex = 0;
	// 	int ogIndex = 0;
		
	// 	//comparing as long as both arrays have values left to compare.
	// 	while(leftIndex < left.length && rightIndex < right.length) {
	// 		if (left[leftIndex] < right[rightIndex]) {
	// 			og[ogIndex] = left[leftIndex++]; //line of code runs before ++
	// 			// leftIndex++;
	// 		}
	// 		else {
	// 			og[ogIndex] = right[rightIndex++];
	// 			// rightIndex++;
	// 		}
	// 		ogIndex++;
	// 	}
		
	// 	//fill the original with the left overs from left
	// 	while(leftIndex < left.length) {
	// 		og[ogIndex++] = left[leftIndex++]; //line of code runs before ++
	// 	}

	// 	//fill the original with the left overs from right
	// 	while(rightIndex < right.length) {
	// 		og[ogIndex++] = right[rightIndex++]; //line of code runs before ++
	// 	}	
	// }





















}
