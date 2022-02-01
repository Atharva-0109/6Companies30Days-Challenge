//Program to find Nth Ugly Number.
class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        TreeSet<Long> tree = new TreeSet<>();
        tree.add(1L);
        int i=1;
        while(i<n)
        {
            long temp = tree.pollFirst();
            tree.add(temp*2);
            tree.add(temp*3);
            tree.add(temp*5);
            i++;
        }
        return tree.pollFirst();
    }
}
