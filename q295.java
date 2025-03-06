import java.util.*;

class MedianFinder {
  PriorityQueue<Integer> small; // max heap
  PriorityQueue<Integer> large; // min heap

  public MedianFinder() {
    small = new PriorityQueue<>((a,b) -> b - a);
    large = new PriorityQueue<>();
  }
  public void addNum(int num) {

    small.add(num);

    if (!small.isEmpty() && !large.isEmpty() && small.peek() > large.peek()) {
      large.add(small.poll());
    }

    if (small.size() > large.size() + 1) {
      large.add(small.poll());
    } else if (large.size() > small.size() + 1) {
      small.add(large.poll());
    }
  }

  public double findMedian() {
    if (small.size() > large.size()) {
      return small.peek();
    } else if (large.size() > small.size()) {
      return large.peek();
    } else {
      return (small.peek() + large.peek()) / 2.0
    }
  }
}

public class q295 {
  public static void main(String args[]) {

  }
}
