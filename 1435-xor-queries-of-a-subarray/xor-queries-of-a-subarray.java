class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        //int[] prefixor = new int[arr.length];
        int[] result = new int[queries.length];
        //prefixor[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] ^ arr[i - 1];
        }
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int total = arr[right];
            int remove = (left > 0)? arr[left - 1]:0;
            result[i] = total ^ remove;
        }
        return result;
    }
}