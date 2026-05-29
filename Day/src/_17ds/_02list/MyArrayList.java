package _17ds._02list;

import java.util.Arrays;

public class MyArrayList {
    // 数组容量
    private static final int DEFAULT_CAPACITY = 6;
    // 数组
    private String[] elements;
    // 当前数组元素
    private int size;

    MyArrayList() {
        elements = new String[DEFAULT_CAPACITY];
    }

    // 判断数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == elements.length;
    }

    public int getSize(){
        return size;
    }

    // 对数组进行扩容
    private void grow(){
        // 数组的容量*2
        String[] newArray = new String[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    public void print(){
        for(int i = 0; i < size; i++){
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    // 增删改查

    // 添加元素到第几个，不是数组下标
    public void add(int index,String element){
        // 判断数组是否满了
        if(isFull()){
            // 数组满了，则扩容
            grow();
        }

        for(int i = size;i >= index; i--){
            elements[i] = elements[i - 1];
        }

        elements[index - 1] = element;
        size++;
    }

    // 默认添加到末尾
    public void add(String element){
        if(isFull()){
            grow();
        }
        elements[size++] = element;
    }

    // 删除元素
    // 删除线性表中第几个元素
    public void remove(int index){
        // 判断下标是否合法
        if(index <= 0 || index > size){
            throw new RuntimeException("下标不合法，请输入1到size大小的范围！");
        }else{
            for(int i = index; i < size; i++){
                elements[i-1] = elements[i];
            }
        }
        size--;
    }

    // 按内容查找
    public int contains(String element){
        if(isEmpty()){
            throw new RuntimeException("线性表为空！");
        }else{
            for(int i = 0; i < size; i++){
                if(elements[i].equals(element)){
                    // 返回是数组的第几个元素
                    return i + 1;
                }
            }
        }
        return -1;
    }

    // 访问线性表的第i个元素
    public String contains(int index){
        if(isEmpty()){
            throw new RuntimeException("线性表为空！");
        }

        if(index <= 0 || index > size){
            throw new RuntimeException("访问位置不合法！");
        }

        return elements[index - 1];
    }

    public void set(int index,String element){
        if(index < 0 || index > size){
            throw new RuntimeException("访问位置不合法！");
        }
        elements[index - 1] = element;
    }

}
