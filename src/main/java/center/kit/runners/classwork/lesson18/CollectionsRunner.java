package center.kit.runners.classwork.lesson18;

import com.sun.xml.internal.ws.server.ServerRtException;
import sun.applet.resources.MsgAppletViewer;

import javax.print.attribute.HashAttributeSet;
import java.io.Serializable;
import java.util.*;

public class CollectionsRunner {
    public static void main(String[] args) {

        Random r = new Random();

        HashSet hashSet = new HashSet();
        hashSet.add("foo");
        hashSet.add(555);
        hashSet.add(true);
        hashSet.add(555);
        hashSet.add(556);

        System.out.println(hashSet);


        ArrayList arrayList = new ArrayList();
        arrayList.add(444);
        arrayList.add(true);
        arrayList.add("arraelist");
        arrayList.add("arraelist");

        System.out.println(arrayList);
        arrayList.remove((Integer)444);
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);

    }
}
