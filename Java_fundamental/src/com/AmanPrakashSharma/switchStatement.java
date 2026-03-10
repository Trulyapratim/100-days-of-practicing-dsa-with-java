package com.AmanPrakashSharma;

public class switchStatement {
    public static void main(String[] args){
        int op = 1;
        switch(op){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("9");
        }
    }
}
//output will be 1 \n 2 \n 9 as switch statement does not have break statement;
// hence the code will fall through;
