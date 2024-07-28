import java.util.*;
public class NumbersContaining1_2_and_3 {

    public static ArrayList<Integer> filterByDigits(ArrayList<Integer> arr) {

        ArrayList<Integer> list =  new ArrayList<Integer>();
        int n = 0;
        int a = 0;
        int c1=0;
        int c2=0;


        for(int ele : arr)
        {
            n = ele;
            c1 = 0;
            c2 = 0;

            while(n>0){
                a = n%10;
                n /= 10;
                c1 += 1;

                if(a==1 || a==2 || a==3){
                    c2++;

                    continue;
                }

                else{
                    break;
                }
            }

            if(c1==c2)
            {
                list.add(ele);
            }

        }


        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(13);
        list.add(4);

        ArrayList<Integer> res = filterByDigits(list);

        System.out.println(res);

    }
}
