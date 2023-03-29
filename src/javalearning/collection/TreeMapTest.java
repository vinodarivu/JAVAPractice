package javalearning.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*Map.Entry<K,V> ceilingEntry(K key)	It returns the key-value pair having the least key, greater than or equal to the specified key, or null if there is no such key.

K ceilingKey(K key)	It returns the least key, greater than the specified key or null if there is no such key.

void clear()	It removes all the key-value pairs from a map.

Object clone()	It returns a shallow copy of TreeMap instance.

Comparator<? super K> comparator()	It returns the comparator that arranges the key in order, or null if the map uses the natural ordering.

NavigableSet<K> descendingKeySet()	It returns a reverse order NavigableSet view of the keys contained in the map.


NavigableMap<K,V> descendingMap()	It returns the specified key-value pairs in descending order.

Map.Entry firstEntry()	It returns the key-value pair having the least key.

Map.Entry<K,V> floorEntry(K key)	It returns the greatest key, less than or equal to the specified key, or null if there is no such key.

void forEach(BiConsumer<? super K,? super V> action)	It performs the given action for each entry in the map until all entries have been processed or the action throws an exception.

SortedMap<K,V> headMap(K toKey)	It returns the key-value pairs whose keys are strictly less than toKey.

NavigableMap<K,V> headMap(K toKey, boolean inclusive)	It returns the key-value pairs whose keys are less than (or equal to if inclusive is true) toKey.

Map.Entry<K,V> higherEntry(K key)	It returns the least key strictly greater than the given key, or null if there is no such key.
K higherKey(K key)	It is used to return true if this map contains a mapping for the specified key.


Set keySet()	It returns the collection of keys exist in the map.

Map.Entry<K,V> lastEntry()	It returns the key-value pair having the greatest key, or null if there is no such key.

Map.Entry<K,V> lowerEntry(K key)	It returns a key-value mapping associated with the greatest key strictly less than the given key, or null if there is no such key.

K lowerKey(K key)	It returns the greatest key strictly less than the given key, or null if there is no such key.

NavigableSet<K> navigableKeySet()	It returns a NavigableSet view of the keys contained in this map.

Map.Entry<K,V> pollFirstEntry()	It removes and returns a key-value mapping associated with the least key in this map, or null if the map is empty.

Map.Entry<K,V> pollLastEntry()	It removes and returns a key-value mapping associated with the greatest key in this map, or null if the map is empty.

V put(K key, V value)	It inserts the specified value with the specified key in the map.

void putAll(Map<? extends K,? extends V> map)	It is used to copy all the key-value pair from one map to another map.

V replace(K key, V value)	It replaces the specified value for a specified key.

boolean replace(K key, V oldValue, V newValue)	It replaces the old value with the new value for a specified key.

void replaceAll(BiFunction<? super K,? super V,? extends V> function)	It replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.

NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)	It returns key-value pairs whose keys range from fromKey to toKey.

SortedMap<K,V> subMap(K fromKey, K toKey)	It returns key-value pairs whose keys range from fromKey, inclusive, to toKey, exclusive.

SortedMap<K,V> tailMap(K fromKey)	It returns key-value pairs whose keys are greater than or equal to fromKey.

NavigableMap<K,V> tailMap(K fromKey, boolean inclusive)	It returns key-value pairs whose keys are greater than (or equal to, if inclusive is true) fromKey.

boolean containsKey(Object key)	It returns true if the map contains a mapping for the specified key.

boolean containsValue(Object value)	It returns true if the map maps one or more keys to the specified value.

K firstKey()	It is used to return the first (lowest) key currently in this sorted map.

V get(Object key)	It is used to return the value to which the map maps the specified key.

K lastKey()	It is used to return the last (highest) key currently in the sorted map.

V remove(Object key)	It removes the key-value pair of the specified key from the map.
cil
Set<Map.Entry<K,V>> entrySet()	It returns a set view of the mappings contained in the map.

int size()	It returns the number of key-value pairs exists in the hashtable.
Collection values()	It returns a collection view of the values contained in the map.
* */

public class TreeMapTest {
	
	public static void main(String args[]) {
		TreeMap<Integer,String> treeMp = new TreeMap();
		treeMp.put(1, "Vinod");
		treeMp.put(10, "Sunil");
		treeMp.put(3, "Dinesh");
		treeMp.put(45, "Suresh");
		treeMp.put(32, "Rajesh");
		treeMp.put(2, "Swathi");
		treeMp.put(8, "Geetha");
		treeMp.put(8, "Radha");
		treeMp.put(25, "Latha");
		treeMp.put(18,"yellaiah");
		treeMp.put(14, "Ramesh");
		
		Set<Map.Entry<Integer,String>> treeSet = treeMp.entrySet();
		treeSet.stream().forEach(System.out::println);
		
		System.out.println("********ceilingEntry below **********");
		Map.Entry<Integer,String> ceil =  treeMp.ceilingEntry(19);
		System.out.println(ceil.getKey() +"="+ceil.getValue());
		System.out.println("********headMap below **********");
		TreeMap<Integer,String> headMap =  new TreeMap(treeMp.headMap(25,true));
		Set<Map.Entry<Integer,String>> headtreeSet = headMap.entrySet();
		headtreeSet.stream().forEach(System.out::println);
		System.out.println("headMap===>"+treeMp.headMap(11));
		
		System.out.println("********tailMap below **********");
		TreeMap<Integer,String> tailMap =  new TreeMap(treeMp.tailMap(25,true));
		Set<Map.Entry<Integer,String>> taildtreeSet = tailMap.entrySet();
		taildtreeSet.stream().forEach(System.out::println);
		System.out.println("tailMp===>"+treeMp.tailMap(11));
		
		System.out.println("seiling key =======>"+treeMp.ceilingKey(11));
		
		
		
		System.out.println("lastEntry====>"+treeMp.lastEntry()); 
		System.out.println("firstEntry====>"+treeMp.firstEntry());
		
		System.out.println("************subMap**************");
		TreeMap<Integer,String> subMap =  new TreeMap(treeMp.subMap(11,true,25,true));
		Set<Map.Entry<Integer,String>> subtreeSet = subMap.entrySet();
		subtreeSet.stream().forEach(System.out::println);
		
		
		
	}

}
