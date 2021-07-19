package features.v1.f6;

/**
 * Feature #6: Fetch Most Frequently Watched Titles
 */
public class F_6_FetchMostFrequentlyWatchedTitles {

    /**
     * 0. Visualize the problem
     *      Implement a feature so that the user can view the n titles
     *      in order of viewing/access frequency
     *      a) when the DS is at capacity, a newly inserted item will replace the
     *          least frequently accessed item
     *      b) in case of a tie, the least recently accessed item should be replaced
     *
     *      LFU Cache
     *
     * 1. Verify the constraints
     * 2. Write test cases
     *
     * 3. Figure out a solution without code
     *      a) If an element is accessed and is present in our data structure, we will
     *          > increase its frequency count
     *          > move it to the end of its respective list
     *          
     *      b) If an element is added & there is space for it in our data-structure, 
     *          we create a node with the specified key and value, 
     *          assign the node a frequency count of 1, and increase the size of the structure.
     *       
     *      c) If an element is added & eviction is needed, we will delete the keys and references 
     *          of the least frequent node from both the Hash Mpas.
     *          Then, we simply repeat step 2.
     *       
     *       d) If a key already exists for a certain key-value pair, 
     *          we update the value of the node for the respective key.
     *
     * 4. Write solution
     * 5. Double check for errors - syntax or logic
     * 6. Test code
     * 7. Analysis
     *      TimeComplexity: 
     *                         HashSet: Get O(1), Set O(1)
     *                         LinkedList:
     *                              Delete head when adding a new element: O(1)
     *                              Adding a new element to tail         : O(1)
     *                              
     *      SpaceComplexity: O(n), where n is the capacity of the cache
     *
     */
}

