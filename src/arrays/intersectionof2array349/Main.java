package arrays.intersectionof2array349;

import linkedList.intersectionoftwolLL160.Intersection;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IntersectionOfArray intersection = new IntersectionOfArray();
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection.intersection(num1, num2)));
    }
}
