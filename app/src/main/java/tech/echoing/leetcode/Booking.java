package tech.echoing.leetcode;

/**
 * Created by journey on 2019-12-16.
 */

public class Booking {
  public static void main(String[] args) {
    System.out.println("asd");
  }

  public static long roundPrice(int price, int n) {
    int ten = 10 ^ n;
    int f = price / ten;
    int l = price % ten;
    if (l>=5){
      f = f + 1;
    }
    return f*ten;
  }
}
