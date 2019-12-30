package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Slots {

private  static Slots slots=null;

private  Map<Integer ,Object> map=null;
private Slots(){
map=new HashMap<>(2);

}
public static Slots getSlots(){
    if(slots==null){
        slots=new Slots();
    }
    return slots;
}
public Map<Integer,Object> getMap(){
    return this.map;
}
private static int count;
public void setCount(){
    count=count+1;
}
public int getCount(){
    return count;
}

}

