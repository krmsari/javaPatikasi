package Java102.CollectionMap.Map;

import java.util.HashMap;
import java.util.Map;

public class ValueKey {

    public void map(){
        //ilk giren ilk çıkar gibi bir garantisi yoktur.
        Map<String,String> map = new HashMap<String, String>();

        map.put("TR", "TURKEY");
        map.put("GR", "GERMANY");
        map.put("EN", "ENGLAND");


        System.out.println(map.get("TR"));
    }

}
