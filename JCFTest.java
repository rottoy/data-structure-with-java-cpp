import java.util.*;

public class JCFTest {
    public static void main(String[] args) {
        //배열
        int []primitives=new int[3];
        System.out.println(primitives[2]);
        //List : LinkedList, Stack, Vector , ArrayList
        //LinkedList : c++의 list, ArrayList : c++ 의 vector
        //List : 삽입/삭제에 유리 , 조회는 좋지 않
        /*

        List<String> list = new LinkedList<String>();
        List<String> temp = new LinkedList<String>();
        list.add("hello");
        list.add("mother");
        list.add("father");
        temp.add("i am");
        temp.add("your son");

        list.addAll(temp); //list 마지막 원소 뒤에 컬렉션 삽입
        list.addAll(0,temp); // index에 컬렉션 삽입
        list.addAll(Arrays.asList("this","is","amazing")); // inline으로 삽입하기
        Collections.addAll(list,"this","is","also","possible");

        System.out.println(list.indexOf("mother")); // return 1
        System.out.println(list.get(0)); // return "hello" , 시간복잡도 : O(N)
        list.remove(2);
        System.out.println(list.toString()); // return ["hello","mother"]
        */

        //Stack
        /*
           Stack<Integer> stack= new Stack<>();
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        if (stack.empty()){
            System.out.println("i am empty");
            System.out.println("stack size : "+stack.size());
        }

         */


        //Queue

        //ArrayList
        /*
        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(3,5,6,2));
        System.out.println(arrayList);
        System.out.println(arrayList.get(0)); // 시간 복잡도 : O(1)
        arrayList.remove(2);// 시간 복잡도 : O(N)
        */

        //Set : HashSet, SortedSet(TreeSet)
        //HashSet : c++의 unordered_map , TreeSet : c++의 map
        /*
        //Set<Integer> set = new HashSet<>(); //자동 정렬 x
        Set<Integer> set = new TreeSet<>(); //자동 정렬  o
        Set<Integer> otherSet = new HashSet<>();
        set.add(1);
        set.add(2);
        set.addAll(Arrays.asList(30,40,50));
        otherSet.add(1);
        otherSet.add(3);
        set.addAll(otherSet);
        System.out.println(set);
        System.out.println(set.retainAll(otherSet));
        System.out.println(set.containsAll(otherSet));
        */

        //Map : 키와 값으로 데이터 보관
        //add 가 아닌 put이 쓰임.
        //HashTable , HashMap, SortedMap(TreeMap)
        Map<String ,Integer> map = new HashMap<>(); // 자동 정렬 x
        map.put("hello",3);
        map.put("mother",32);
        map.put("father",322); // 데이터 삽입
        map.get("father"); // 데이터 조회
        for(String something : map.keySet()){ // key 순회
            System.out.println(something);
            System.out.println(map.get(something));
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){ // key ,value 순회
            System.out.println(entry);
        }
        System.out.println(map.toString());

    }
}
