package features;

import java.util.PriorityQueue;

/**
 * Feature #3: Find Median Age
 */
public class F_3_FindMedianAge {

    /**
     * 0) Visualize the problem
     * 1) Verify the constraints
     * 2) Write test cases
     *
     *
     * 3) Figure out a solution without code
     *      a) We will assume x is median age in list > classifying elements greater than or lesser
     *      b) median age will be either
     *          * largest number in the small List  > max Heap
     *          * smallest number in the large list > min Heap
     *
     *      c) Heap - best DS
     *      d) we can calculate the median of the current list of numbers
     *          using the top element of the two heaps
     *
     * 4) Write solution
     * 5) Double check for errors - syntax/errors
     * 6) Test code
     * 7) Analysis
     *      TimeComplexity:
     *          InsertAge: O(log n)
     *          FindMedian: O(1)
     *      SpaceComplexity:    O(n)
     */

    PriorityQueue<Integer> maxHeap; //containing first half of numbers
    PriorityQueue<Integer> minHeap; //containing second half of numbers

    public F_3_FindMedianAge() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        minHeap = new PriorityQueue<>((a, b) -> a - b);
    }

    public void insertNum(int num){
        if(maxHeap.isEmpty() || maxHeap.peek() >= num){
            maxHeap.add(num);
        }else {
            minHeap.add(num);
        }

        //either bot the heaps will have equal number of elements or
        // max-heap will have one more element than the min-heap
        if(maxHeap.size() > minHeap.size() +1){
            minHeap.add(maxHeap.poll());
        }else if(maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian(){
        if(maxHeap.size() == minHeap.size()){
            //we have even number of elements, take the average of middle two elements
            return maxHeap.peek() / 2.0 + minHeap.peek()/2.0;
        }

        //because max-heap will have one more element than the min-heap
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        // Driver code

        F_3_FindMedianAge medianOfAges = new F_3_FindMedianAge();
        medianOfAges.insertNum(22);
        medianOfAges.insertNum(35);
        System.out.println("The recommended content will be for ages under: " + medianOfAges.findMedian());
        medianOfAges.insertNum(30);
        System.out.println("The recommended content will be for ages under: " + medianOfAges.findMedian());
        medianOfAges.insertNum(25);
        System.out.println("The recommended content will be for ages under: " + medianOfAges.findMedian());
    }
}
