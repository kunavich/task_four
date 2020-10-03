package by.kunavich.task4.model;

import java.util.Arrays;
import java.util.List;

public class Array {

    private int[] array;
    public Array()
    {
        this.array =new int[0];
    }


    public Array(int[] newArray)
    {
        this.array= newArray;

        List<Integer> l;
        ////l.

    }

    public void add(int element)
    {
        int[] tempArray = array;
        array = new int[tempArray.length+1];
        int iterator=0;
        for (int el:tempArray ) {
            array[iterator]=el;
            iterator++;
        }

        array[iterator]=element;
    }
    public void addAll(int[] massive){
        //TODO todo proply addALL
        for (int element:massive) {
            add(element);
        }
    }

    public boolean isEmpty()
    {
        return array.length==0;
    }
    public Array(Array newArray)
    {
        array= newArray.getData();
    }

    public int[] getData() {
        return array;
    }

    public int size() {
        return array.length;
    }
    public int get(int index){
        return array[index];
    }


    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    public void set(int index,int element)
    {
        array[index]=element;
    }
    public void clear(){
        array = new int[0];
    }

    public static Array parseArray(String line)
    {
        String[] split = line.split(" ");
        Array array= new Array();
        for (String num:split) {
            array.add(Integer.parseInt(num));
        }
        return array;
    }

    public void mergeSort() {
        if (this.size() < 2) {
            return;
        }
        int mid = this.size() / 2;
        Array leftPart = new Array();
        Array rightPart = new Array();

        for (int i = 0; i < mid; i++) {
            int element= this.get(i);
            leftPart.add(element);
        }
        for (int i = mid; i < this.size(); i++) {
            int element= this.get(i);
            rightPart.add(element);
        }
        leftPart.mergeSort();
        rightPart.mergeSort();

        merge(this, leftPart, rightPart, mid, this.size() - mid);
    }

    private void merge(Array array, Array leftPart, Array rightPart, int left, int right) {

        int i = 0, j = 0, k = 0;


        while (i < left && j < right) {
            if (leftPart.get(i) <= rightPart.get(j)) {
                int element = leftPart.get(i++);
                array.set(k++,element);
            }
            else {
                int element = rightPart.get(j++);
                array.set(k++,element);
            }
        }

        while (i < left) {
            int element = leftPart.get(i++);
            array.set(k++,element);
        }

        while (j < right) {
            int element = rightPart.get(j++);
            array.set(k++,element);
        }
    }
}
