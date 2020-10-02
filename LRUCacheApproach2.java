import java.util.*;
import java.util.stream.Collectors;

public class LRUCacheApproache2{

  public static String LRUCache(String[] strArr) {
      LinkedList<String> cache = new LinkedList();
      cache.addFirst(strArr[0]);
      int cacheSize = 3;
      for(String str:strArr){
          if(cache.contains(str)){
                   cache.remove(cache.indexOf(str));
                   cache.addLast(str);
          }else{
              cache.addLast(str);
          }
          if(cache.size()>cacheSize){
              cache.removeFirst();
          }
      }
      return cache.stream().collect(Collectors.joining("-"));
  }

  public static void main (String[] args) {  
    String[] str = {"A", "B", "A", "C", "A", "B","D"};
    System.out.println("expected ===> A-B-D");
    System.out.println("Actual ===> "+LRUCache(str)); 
  }

}