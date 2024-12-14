class Solution {
    static node num[];
    static int tar;
    static int ret[];
    public int[] twoSum(int[] nums, int target) {
        tar = target;
        ret = new int[2];
        num = new node[nums.length];
        for(int i=0;i<nums.length;i++) {
            num[i] = new node(nums[i],i);
        }
        Arrays.sort(num);
        for(int i=0;i<nums.length;i++) {
            int idx = findindex(i+1,nums.length-1,num[i].val);
            if (idx != -1) {
                ret[0] = num[i].idx;
                ret[1] = idx;
                return ret;
            }
        }
        return ret;
    }

    public int findindex(int start, int end, int val) {
        while(start <= end) {
            int mid = (end+start) / 2;
            if (num[mid].val + val == tar) {
                return num[mid].idx;
            } else if (num[mid].val+val < tar) {
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static class node implements Comparable<node>{
        int val;
        int idx;
        public node(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(node o) {
            return Integer.compare(this.val,o.val);
        }
    }
}