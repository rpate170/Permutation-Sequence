class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        StringBuilder sb = new StringBuilder();
        for (k--; n > 0; n--) {
            // System.out.println("fact: " + fact);
            // System.out.println("k: " + k);
            fact /= n;
            sb.append(list.remove(k/fact));
            k %= fact;     
        }
        
        return sb.toString();
    }
}