package com.autobot.practice.Strings;

public class RemoveSpecialCharacterFromString {

    public void solution1(String a) {

        System.out.println(a.replaceAll("[^A-Z,a-z,1-100]", ""));
    }

    public void solution2(String a) {
      char c[]=a.toCharArray();
      String ans ="";
      for(Character c1 :c) {
          if ((c1 >= 'a' && c1 <= 'z') || (c1 >= 'A' && c1 <= 'Z') || (c1 >= '0' && c1 <= '9')) {
              ans += c1;
          }
      }
      System.out.println(ans);
    }

    public static void main(String[] args) {
        RemoveSpecialCharacterFromString rs = new RemoveSpecialCharacterFromString(
        );
        rs.solution2("QWERTYUI1a5sdf6g4hj4584!@#$%^&*(}?-1");

    }

}
