class Solution {
    public int longestCycle(int V, int[][] edges) {
        int[] next = new int[V];
        for (int i = 0; i < V; i++) next[i] = -1;
        for (int[] e : edges) next[e[0]] = e[1];

        boolean[] visited = new boolean[V];
        int res = -1;

        for (int i = 0; i < V; i++) {
            if (visited[i]) continue;

            int curr = i;
            int step = 0;
            int[] time = new int[V];
            for (int j = 0; j < V; j++) time[j] = -1;

            while (curr != -1 && !visited[curr]) {
                visited[curr] = true;
                time[curr] = step++;
                curr = next[curr];

                if (curr != -1 && time[curr] != -1) {
                    res = Math.max(res, step - time[curr]);
                    break;
                }
            }
        }
        return res;
    }
}