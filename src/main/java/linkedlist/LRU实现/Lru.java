package linkedlist.LRU实现;

import com.mysql.jdbc.util.LRUCache;

/**
 * lru通过LinkedHashMap实现方式
 * @Author 喻可
 * @Date 2021/10/21 15:56
 */
public class Lru {
    public static void main(String[] args) {
        LRUCache<String, String> cache = new LRUCache<>(3);

        cache.put("1", "1");
        cache.put("2", "2");
        cache.put("3", "3");
        cache.get("1");
        cache.get("3");
        cache.put("4", "4");
        cache.get("4");
        cache.put("5", "5");
        System.out.println(cache);
        System.out.println(cache.size());
    }
}
