class DynamicArray {
    int [] array;
    int length;
    int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        array = new int[this.capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;

    }

    public void pushback(int n) {
        if (this.length == this.capacity){
            resize();
        }

        this.array[this.length] = n;
        this.length++;
    }

    public int popback() {
        length --;
        return array[length];
    }

    private void resize() {
        int[] newArray = new int[this.capacity * 2];
        for (int i = 0; i < this.length; i++){
            newArray[i] = this.array[i];
        } 

        this.array = newArray;
        this.capacity *= 2;

    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
