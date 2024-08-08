import java.util.*;
class basics{
    //country=k and population=value
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        // //Insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        map.put("China", 180);
        // System.out.println(map);

        // //Search
        // if(map.containsKey("UK")){
        //     System.out.println("Key is present");
        // }
        // else{
        //     System.out.println("Key is not  present");
        // }

        // System.out.println(map.get("China"));
        // System.out.println(map.get("UK"));

        // //Iteration in array

        // int arr[]={16,108,16108,32,64};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // for(int val:arr){
        //     System.out.println(val);
        // }

        
        // Iteration in maps
        // System.out.println("ram");
        // for(Map.Entry<String,Integer> val: map.entrySet()){
        //     // System.out.println(val);
        //     System.out.println(val.getKey());
        //     System.out.println(val.getValue());
        // }


        //Key Set

        Set<String> keys=map.keySet();

        for(String key:keys){
            System.out.println(key);
            System.out.println(key+" "+map.get(key));
        }

        //Deletion

        map.remove("China");
        System.out.println(map);
        
    }
}