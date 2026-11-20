class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] results = new int[temps.length];
        Deque<Integer> indexQueue = new ArrayDeque<>();
        int days = 0;
        int lastIndex = 0;

        for (int i = 0; i < temps.length; i++) {
            while (!indexQueue.isEmpty() && temps[i] > temps[indexQueue.peek()]) {
               lastIndex = indexQueue.pop();
                days = i - lastIndex;
                results[lastIndex] = days;
            } 
                indexQueue.push(i);
            
        }
    return results;

    }
}

