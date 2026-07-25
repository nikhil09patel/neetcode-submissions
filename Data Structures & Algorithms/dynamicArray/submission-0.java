class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return arr[size];
    }

    public void resize() {
        // Create new array with double capacity
        int[] newArr = new int[this.capacity * 2];
        // Copy elements over
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        // Update the reference and capacity variable
        this.arr = newArr;
        this.capacity *= 2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
