package com.autobot.practice;

public class StarTriangleQuestions {

    public void test() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    public void test2() {
        for (int i = 6; i > 0; i--) {
            System.out.println("");
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
        }
    }

    public void test3()
    {
        for(int i=0;i<6;i++)
        {
            System.out.println("");
            for (int j = 6; j > i; j--)
            {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
        }
    }

    public void test4() {
        for (int i = 0; i < 6; i++) {
            System.out.println("");
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
        }
    }

    public void test5() {
        for (int i = 0; i < 6; i++) {
            System.out.println("");
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < i * 2; k++) {
                System.out.print("*");
            }
        }
    }

    public void test6() {
        for (int i = 0; i < 6; i++) {
            System.out.println("");
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }

        }
        for (int i = 0; i < 6; i++) {
            System.out.println("");
            for (int l = i; l < 6; l++) {
                System.out.print(" ");
            }
            for (int l = 6; l > i; l--) {
                System.out.print("*");
            }
        }
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StarTriangleQuestions st = new StarTriangleQuestions();
        st.test4();
    }

}
