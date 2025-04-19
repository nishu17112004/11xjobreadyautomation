package ex_14_Collection_framework;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class L005_Vector {
    public static void main(String[] args) {
        Vector v=new Vector<>();
        Vector v1=new Vector();
        v.add("nishu");
        v.add("ankit");
        v.add("nepal");
        System.out.println(v);
        System.out.println(v.contains("ankit"));
        System.out.println(v);
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println("Normal Each loop");
        for(Object o:v){
            System.out.println(o);
        }
        System.out.println(".....Iterator");
        Iterator i=v.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
       ListIterator listIterator=v.listIterator(v.size());
        //while(listIterator.hasNext()){
          //  System.out.println(listIterator.hasNext());
      //  }
        System.out.println("\n backward direcion:");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.hasPrevious());
        }
    }
}
