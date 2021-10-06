// TC : O(log n)
// SC : O(1)
class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0)
            return 0;
        int n = citations.length;
        int low = 0;
        int high = n - 1;
        while(low <= high) {
            int mid = low + ((high - low) >> 1);
            if(citations[mid] == n - mid)
                return n - mid;
            else if(citations[mid] > n - mid)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return n - low;
    }
}