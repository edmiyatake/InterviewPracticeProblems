public class DynamicArray {
    // private variables
    private int[] arr;
    private int length;

    // initial constructor
    public DynamicArray(int capacity) {
        int[] newArr = new int[capacity];
        this.arr = newArr;
        this.length = capacity;
    }

    // get insert function
    public void insert(int index, int element) {
        if (index < length) {
            arr[index] = element;
        }
        else {
            System.out.println("Please enter a valid index");
        }
    }

    // removeAt function

    public void removeAt(int index) {
        // make a shallow copy of everything at that index

        if (index < length) {
            int[] afterCopy = new int[this.length - 1];
            for (int i = 0; i < index; i++) {
                afterCopy[i] = arr[i];
            }
            for (int i = index + 1; i < this.length; i++) {
                afterCopy[i-1] = arr[i];
            }
            this.length = afterCopy.length;
            this.arr = afterCopy;

        }
        else {
            System.out.println("Please enter a valid index");
        }
    }

    // indexOf function
    public int indexOf(int value) {
        for (int i = 0; i < this.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // getLength function
    public int getLength() {
        return this.length;
    }

    // print function
    public void print() {
        for (int i = 0; i < this.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        DynamicArray newArray = new DynamicArray(5);
        newArray.insert(0,5);
        newArray.insert(1,3);
        newArray.removeAt(1);
        newArray.insert(2,47);
        System.out.println(newArray.indexOf(47));
        System.out.println(newArray.indexOf(32));
        newArray.print();
    }

}