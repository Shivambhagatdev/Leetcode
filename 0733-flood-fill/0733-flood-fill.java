class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int original = image[sr][sc];

        // Agar same color hai to kuch change nahi karna
        if (original == color) {
            return image;
        }

        Queue<int[]> q = new LinkedList<>();

        // Starting cell
        q.add(new int[]{sr, sc});
        image[sr][sc] = color;

        // 4 directions: up, down, left, right
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!q.isEmpty()) {

            int[] current = q.poll();

            int r = current[0];
            int c = current[1];

            for (int[] d : directions) {

                int nr = r + d[0];
                int nc = c + d[1];

                // Boundary + same original color
                if (nr >= 0 && nr < image.length &&
                    nc >= 0 && nc < image[0].length &&
                    image[nr][nc] == original) {

                    image[nr][nc] = color;

                    q.add(new int[]{nr, nc});
                }
            }
        }

        return image;
    }
}