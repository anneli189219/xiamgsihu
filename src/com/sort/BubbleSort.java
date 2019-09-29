package com.sort;
import java.util.Arrays;

/**
 * 字符串排序 未完成
 * @author anneli
 * @date 2019年9月29日 上午9:11:09 
 *
 */
public class BubbleSort {
    public void bubbleSort(Integer[] arr, int n) {
        if (n <= 1) return;
 
        for (int i = 0; i < n; ++i) {
          
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {  
          
                if (arr[j] > arr[j + 1]) {     
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
    public String[] sbubbleSort(String sArr[], int n) {
        if (n <= 1) return sArr;     
        
        for (int i = 0; i < n; ++i) {
           
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {        
               
                if (sArr[j].compareTo(sArr[j + 1])==1) {       
                    String temp = new String(sArr[j]);
                    sArr[j] = new String(sArr[j + 1]);
                    sArr[j + 1] = new String(temp);
                    flag = true;
                }
                
            }
            if (!flag) break;
            
        }
		return sArr;
    }
    
    public static void main(String[] args) {
        Integer arr[] = {2, 4, 7, 6, 8, 5, 9};
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
        System.out.println();
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
        System.out.println();
        
        String sArr[] = {"java","python","php","c#","C Programing","c++"};
        for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i]+" ");
		}
        System.out.println();
        
        //sArr=bubbleSort.sbubbleSort(sArr, sArr.length);
        Arrays.sort(sArr);
        for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i]+" ");
		}
        
        
    }
}