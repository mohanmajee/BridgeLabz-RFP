package Day15;

public class HashTable {
	HashNode[] bucket;    
    int noOfBuckets;    
    int size;                                                                // number k,V pair in hash table;
    public HashTable() {        
        this(10);
    }

    public HashTable(int capacity) {        
        this.noOfBuckets = capacity;        
        this.bucket = new HashNode[noOfBuckets];        
        this.size = 0;
    }

    class HashNode {        
        Integer key ;        
        String value;        
        HashNode next;
        public HashNode(Integer key, String value) {            
            this.key = key;            
            this.value = value;            
            this.next = null;
        }
    }
    
    public int getBucketIndex(Integer key) {        
        return key%noOfBuckets;
    }

    public void put(Integer key , String value) {        
        if (key == null || value == null) {            
            throw new IllegalArgumentException("key or value found null");
        }        
        int bucketIndex = getBucketIndex(key);        
        HashNode head = bucket[bucketIndex] ;                                                                                  
        while (head != null) {                                                        
        	// check existing node value in table;
            if (head.key.equals(key)) {                
                head.value = value;                
                return;
            }            
            head = head.next;
        }        
        size++;        
        head = bucket[bucketIndex];        
        HashNode hashNode = new HashNode(key, value);        
        hashNode.next = hashNode;        
        bucket[bucketIndex] = hashNode;
        System.out.println(bucket);
    }    
    public String getValueOfKey (int key ) {        
        int bucketIndex = getBucketIndex(key);        
        HashNode head = bucket[bucketIndex] ;        
        while (head != null) {            
            if (head.key.equals(key)) {                
                return head.value;
            }            
            head = head.next;         
        }        
        return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable hashTable = new HashTable();        
        hashTable.put(5,"Goldy");        
        hashTable.put(5,"Jhon");        
        hashTable.put(5,"mike");        
        System.out.println("the size of hash table is ::  "+hashTable.size);        
        System.out.println(hashTable.getValueOfKey(5));

	}

}
