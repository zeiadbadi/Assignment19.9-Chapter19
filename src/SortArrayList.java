import java.util.ArrayList;

public class SortArrayList <E>{
        private static ArrayList myList;



    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        E temp1, temp2;
        myList = list;
        for (int i = 0; i < list.size(); i++){

                for (int j = i + 1; j < list.size(); j++){

                    if(list.get(i).compareTo(list.get(j)) > 0){

                        temp1 = list.get(i);
                        temp2 = list.get(j);

                        list.remove(i);

                        list.add(i, temp2);

                        list.remove(j);
                        list.add(j, temp1);
                    }
                }
        }
        
    }

    public String toString() {
        String list="";
                for (int i = 0; i < myList.size(); i++){
                    list +=myList.get(i) + " ";
        }
        return list;
    }


}
