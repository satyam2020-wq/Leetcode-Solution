class MyHashMap {

    private int[] arr;

    // Initialize the array and mark every key as absent
    public MyHashMap() {
        arr = new int[1000001];
        java.util.Arrays.fill(arr, -1);
    }

    // Insert a new key or update an existing key
    public void put(int key, int value) {
        arr[key] = value;
    }

    // Return the value if present; otherwise, return -1
    public int get(int key) {
        return arr[key];
    }

    // Remove the key by marking its position as absent
    public void remove(int key) {
        arr[key] = -1;
    }
}
