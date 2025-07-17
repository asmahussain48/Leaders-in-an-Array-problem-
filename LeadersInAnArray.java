import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {

        int[] Arr={16, 17, 4, 3, 5, 2};
        int size=Arr.length;
        int max=Arr[size - 1];
        ArrayList<Integer> list = new ArrayList<>();

        int[] result=new int[size];
        for (int i=size-1; i >= 0; i--) {
                if(Arr[i] <= max ){
                    list.add(max);
                }
                max = Arr[i];

        }
        System.out.println(list);
    }
}
