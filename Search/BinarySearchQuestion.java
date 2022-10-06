// Question Broken Economy 
 static void BE(int[] arr, int data) {
        // This is known as Lower and Upper bound algorithm.
        
        int low = 0;
        int high = arr.length - 1;
        int ceil = 0, floor = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (data > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else if (data < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            } else {
                floor = arr[mid];
                ceil = arr[mid];
            }
        }
        System.out.println(ceil + " " + floor);
    }

