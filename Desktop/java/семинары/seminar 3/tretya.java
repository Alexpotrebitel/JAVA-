//создать список типа Arraylist
//поместить в него как строки так и целые числа
// пройти по списку найти и удалить целые числа


    
    import java.util.ArrayList;
    import java.util.Iterator;
    import java.util.List;
    
    public class tretya {
      
    public static void main(String[] args) {
        List list = listAdd();
        System.out.println(list);
        listRemoveIntIter(list);
        System.out.println(list);
    }

    public static void listRemoveIntIter(List list){
        Iterator inter = list.iterator();
        while (inter.hasNext()){
            if (inter.next() instanceof Integer){
                inter.remove();
            }
        }
    }

    public static void listRemoveInt(List list){

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }

    }

    public static List listAdd(){

        List list = new ArrayList();
        list.add(32);
        list.add(66);
        list.add("adfa");
        list.add("a");
        list.add(45);
        list.add("45");
        list.add(45.4);
        list.add('4');
        list.add(true);

        return list;
    }

}
