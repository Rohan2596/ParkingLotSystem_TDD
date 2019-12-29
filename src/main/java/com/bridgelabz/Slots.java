package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Slots {

private  static Slots slots=null;

private  Map<String ,Object> map=null;
private Slots(){
map=new HashMap<>(2);

}
public static Slots getSlots(){
    if(slots==null){
        slots=new Slots();
    }
    return slots;
}
public Map<String,Object> getMap(){
    return this.map;
}
private static int count;
public void setCount(){
    count=count+1;
}
public int getCount(){
    return count;
}
public void addToMap(Object object){
    map.put("1",object);
}
public void removeToMap(Object object){
    map.remove(object);
}
}

