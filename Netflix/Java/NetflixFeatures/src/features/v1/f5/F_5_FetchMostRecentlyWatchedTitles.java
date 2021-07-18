package features.v1.f5;

import java.util.HashMap;

/**
 * Feature #5: Fetch Most Recently Watched Titles
 */
public class F_5_FetchMostRecentlyWatchedTitles {

    /**
     * 0. Visualize the problem
     *      Implement a feature so that the user can view the n titles
     *      that they've watched or accessed most recently
     *      a) the DS should maintain titles in order of time since last access
     *      b) if the DS is at its capacity, an insertion should replace the
     *          least recently accessed item
     *
     *      LRU Cache
     *
     * 1. Verify the constraints
     * 2. Write test cases
     *
     * 3. Figure out a solution without code
     *      a) if the element exists in the hashmap, our first step is to
     *          move the accessed element to the tail of the linked list
     *      b) if the DS is at its capacity, remove the element at the head
     *          of the linked list and the HashMap
     *          Then, add the new element at the tail of the linked list
     *          and in the HashMap
     *      c) Finally, we retrieve the element and return
     *
     *
     * 4. Write solution
     * 5. Double check for errors - syntax or logic
     * 6. Test code
     * 7. Analysis
     *      TimeComplexity: Get O(1), Set O(1)
     *      SpaceComplexity: O(k), where k is the size of the cache
     *
     */
}
class LRUCache {

    int capacity;
    HashMap<Integer, LinkedListNode> cache;
    MyLinkedList cacheVals;

    public LRUCache(int capacity){
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        cacheVals = new MyLinkedList();
    }

    LinkedListNode Get(int key){
        if(!cache.containsKey(key)){
            return null;
        }else {
            int value = cache.get(key).data;
            cacheVals.removeNode(cache.get(key));
            cacheVals.insertAtTail(key, value);
            return cacheVals.getTail();
        }
    }

    void Set(int key, int value){
        if(!cache.containsKey(key)){
            evictIfNeeded();
            cacheVals.insertAtTail(key, value);
            cache.put(key, cacheVals.getTail());
        }
    }

    void evictIfNeeded() {
        if(cacheVals.size >= capacity){
            LinkedListNode node = cacheVals.removeHead();
            cache.remove(node.key);
        }
    }

    void print() {
        LinkedListNode curr = cacheVals.head;
        System.out.print("H ");
        while(curr != null){
            System.out.print("(" + curr.key + "," + curr.data + ")");
            curr = curr.next;
        }
        System.out.println(" T");
    }

    public static void main(String[] args){
        LRUCache cache = new LRUCache(3);
        System.out.print("The most recently watched titles are: (key, value)");
        cache.Set(10,20);
        cache.print();

        cache.Set(15,25);
        cache.print();

        cache.Set(20,30);
        cache.print();

        cache.Set(25,35);
        cache.print();

        cache.Set(5,40);
        cache.print();

        cache.Get(25);
        cache.print();
    }
}