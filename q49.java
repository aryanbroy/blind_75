public class q49 {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> hmap = new HashMap<>();

    int[] arr = new int[26];

    for (String str : strs) {
      Arrays.fill(arr, 0);

      for (char ch : str.toCharArray()) {
        arr[ch - 'a'] += 1;
      }

      StringBuilder sb = new StringBuilder();

      for (int num : arr) {
        sb.append("#");
        sb.append(num);
      }

      String key = sb.toString();

      if (!hmap.containsKey(key)) {
        List<String> temp = new ArrayList<>();
        temp.add(str);
        hmap.put(key, temp);
      }
      hmap.get(key).add(str);
    }

    return new ArrayList<>(hamp.values());
  }
}
