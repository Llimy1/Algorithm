class Solution {
    int[] arr = new int[0];
    int i = 0;

    public int[] solution(int[] numArr) {
        while (this.i < numArr.length) {
            if (this.arr.length == 0) {
                isEmpty(0, numArr[i]);
            } else if (numArr[i] > this.arr[this.arr.length - 1]) {
                addLast(this.arr.length, numArr[i]);
            } else if (numArr[i] <= this.arr[this.arr.length - 1]) {
                removeLast(this.arr.length);
            }
        }
        return this.arr;
    }

    public void isEmpty(int size, int addData) {
        this.arr = new int[size + 1];

        if (size == 0) {
            arr[0] = addData;
        }

        this.i++;
    }

    public void addLast(int size, int addData) {
        int[] arrTemp = this.arr.clone();
        this.arr = new int[size + 1];

        for (int j = 0; j < arrTemp.length; j++) {
            this.arr[j] = arrTemp[j];
        }

        this.arr[this.arr.length - 1] = addData;
        this.i++;
    }

    public void removeLast(int size) {
        int[] arrTemp = this.arr.clone();
        this.arr = new int[size - 1];

        for (int j = 0; j < this.arr.length; j++) {
            this.arr[j] = arrTemp[j];
        }
    }
}