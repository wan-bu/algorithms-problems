import java.util.*; 
import java.io.*;
import java.util.stream.Collectors;

public class LRUCache{

  public static String LRUCache(String[] strArr) {
      LinkedList<String> cache = new LinkedList();
      cache.addFirst(strArr[0]);
      int cacheSize = 3;
      for(int i =1;i<strArr.length;i++){
          boolean exist = false;
          for(int j=0;j<cache.size();j++){
               if(strArr[i].equals(cache.get(j))){
                   exist=true;
                   cache.remove(j);
                   cache.addLast(strArr[i]);
                   break;
               }
          }
          if(!exist){
              cache.addLast(strArr[i]);
          }
          if(cache.size()==cacheSize){
              cache.removeFirst();
          }
      }
      return cache.stream().collect(Collectors.joining("-"));
  }

  public static void main (String[] args) {  
    String[] str = {"A", "B", "A", "C", "A", "B"};
    System.out.println("expected ===> C-A-B");
    System.out.println("Actual ===> "+LRUCache(str)); 
  }

}