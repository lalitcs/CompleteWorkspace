package Map;

public class HashMapDemo {
	static int[] hashmap;
	
	static void createHashmap(int size) {
		hashmap=new int[size];
		for(int i=0;i<hashmap.length;i++) {
			hashmap[i]=-1;
		}
		System.out.println("Hashmap has been created with size " + size+"successfully");
	}
	static void put(int ele) {
		int in=ele%hashmap.length;
		if(hashmap[in]!=-1) {
			System.out.println("key is already occupied..||");
		}
		else {
			hashmap[in]=ele;
			System.out.println(ele + "had been stored in hashmap with the key value"+in);
		}
	}
	static void remove(int ele) {
		int in =ele%hashmap.length;
		if(hashmap[in]==ele) {
			hashmap[in]=-1;
			System.out.println("data had been been removed");
		}
		else {
			System.out.println("value not found");
		}
	}
	static void display() {
		for(int ele:hashmap) {
			if(ele!=-1) {
				System.out.println(ele);
			}
		}
	}
	public static void main(String[] args) {
		createHashmap(5);
		put(99);
		put(32);
		put(8);
		put(101);
		put(220);
		put(67);
		remove(42);
		remove(32);
		
		
		
	}

}
