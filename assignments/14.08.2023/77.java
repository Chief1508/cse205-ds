import java.util.ArrayList;
import java.util.List;

 class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; i++) {
            path.add(i);
            backtrack(i + 1, n, k, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        int n = 4;
        int k = 2;
        List<List<Integer>> output = combinations.combine(n, k);
        System.out.println(output);
    }
}