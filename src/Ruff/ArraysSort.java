/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruff;

import java.util.Arrays;

/**
 *
 * @author U6032545
 */
public class ArraysSort {
    
    public static void main(String args[]){
    int a [] = new int[5];
    a[0] =99;
    a[1]=46;
    a[2]=3;
    a[3]=1000;
    a[4]=37;
    Arrays.sort(a);
    for(int i=0;i<5;i++){
      System.out.println(a[i]);
    
    }
    String st [] = new String[5];
    st[0] ="vinod";
    st[1]="Z";
    st[2]="A";
    st[3]="X";
    st[4]="B";
    Arrays.sort(st,String.CASE_INSENSITIVE_ORDER);
    for(int i=0;i<5;i++){
      System.out.println(st[i]);
    
    }
    
    
    }
    
}
