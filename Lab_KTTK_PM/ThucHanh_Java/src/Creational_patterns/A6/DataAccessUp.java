package Creational_patterns.A6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccessUp {
    private static Dictionary<String, DataAccessUp> dataAccess = new Hashtable<>();
    List<String> dsSP = new ArrayList<>();
    public static DataAccessUp getInstance(String tag)
    {
        if (dataAccess.get(tag) == null)
        {
            DataAccessUp d = new DataAccessUp();
            dataAccess.put(tag,d);
        }
        return dataAccess.get(tag);
    }



}
