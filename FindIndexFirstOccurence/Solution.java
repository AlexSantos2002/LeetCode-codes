package FindIndexFirstOccurence;


class Solution {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        if (index != -1) {
            System.out.println(needle + " occurs at index " + index);
        }
        return index;
    }
}