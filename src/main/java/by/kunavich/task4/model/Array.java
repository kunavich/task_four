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
       // List<Integer> l;
       // l.

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
}
