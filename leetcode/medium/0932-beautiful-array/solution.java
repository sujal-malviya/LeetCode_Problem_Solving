class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        while (result.size() < n) {
            List<Integer> next = new ArrayList<>();

            // Generate odd numbers: 2 * x - 1
            for (int x : result) {
                int odd = 2 * x - 1;
                if (odd <= n) {
                    next.add(odd);
                }
            }

            // Generate even numbers: 2 * x
            for (int x : result) {
                int even = 2 * x;
                if (even <= n) {
                    next.add(even);
                }
            }

            result = next;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}