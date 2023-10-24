import java.util.ArrayList;
import java.util.List;

class Solution {
  public static List<Integer> fiveSort(List<Integer> array) {
    int right = array.size()-1;
    int temp;
    for (int left=0;left<right;left++){
      while (array.get(right)==5){
        right--;
      }
      if (array.get(left)==5){
        temp = array.get(right);
        array.set(right, array.get(left));
        array.set(left, temp);
        right--;
      }
    }
    return array;
  }

  public static void run() {
    List<Integer> array = new ArrayList<>(List.of(5, 2, 5, 6, 5, 1, 10, 2, 5, 5));
    Solution.fiveSort(array);
    System.out.println(array);
  }

  public static void main(String[] args){
    run();
  }
}
