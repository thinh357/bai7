package com.review;

public class Calculator {
    // Cố ý đặt tên biến sai: không camelCase
    private int my_VALUE;

    public int add(int a, int b) {
        my_VALUE = a + b;     // Gán cho biến ít dùng
        return my_VALUE;
    }

    // Thiếu Javadoc, tên phương thức không viết thường
    public int Subtract(int a, int b) {
        return a - b;
    }
}