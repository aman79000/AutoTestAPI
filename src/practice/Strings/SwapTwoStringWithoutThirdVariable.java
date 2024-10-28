package com.autobot.practice.Strings;

public class SwapTwoStringWithoutThirdVariable {

//Without third Vairable
    public void solution1(String a, String b) {
        a = a + b;
        b = a.replace(b, "");
        a = a.replace(b, "");
        System.out.println(a + " " + b);
    }

    // With third Variable
    public void solution2(String a, String b) {
        String c = "";
        c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);

    }

    // With SubString
    public void solution3(String a, String b) {
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println(a + "" + b);

    }

    public static void main(String[] args) {
        SwapTwoStringWithoutThirdVariable st = new SwapTwoStringWithoutThirdVariable();
        st.solution1("Test", "ing");
        st.solution2("Test", "ing");

    }

}
