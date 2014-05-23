package info.patan;

import java.util.*;
class ArrayListEx{

@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String ar[]){

ArrayList hs = new ArrayList();
hs.add("Khan");
hs.add("Pathan");
hs.add("Shaukath");
hs.add("Ali"); 
hs.add(101);
hs.add(2, "Sowkat");
hs.remove("Ali");
//hs.removeAll(hs);
ArrayList al = new ArrayList();
//hs.addAll(hs);
al.addAll(hs);
//al.removeAll(hs);
al.clear();
System.out.println(hs.get(3));

System.out.println("Elements in ArrayList<AL>:");
for(Object str:al){
System.out.print(str+" ");
}
System.out.println("Elements in ArrayList<HS>:");
for(Object str:hs){
System.out.print(str+" ");
}

}
}
