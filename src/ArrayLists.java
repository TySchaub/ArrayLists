import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> folks = new ArrayList<String>();
        folks.add("Tom");
        folks.add("Hazem");
        folks.add("Britney");

        // no indexing with the enhanced for loop
        for (String f : folks)
        {
            System.out.println(f);
        }

        for(int x = 0; x < folks.size(); x++)
        {
            System.out.println(folks.get(x)); // get(x) array[x]
        }

        folks.set(0, "Bob");
        for (String f: folks)
        {
            System.out.println(f);
        }

        folks.add(1, "Tom");
        for (String f: folks)
        {
            System.out.println(f);
        }

        ArrayList<Integer> numns = new ArrayList<>();

        numns.add(1);
        numns.add(2);
        numns.add(3);

        System.out.println(numns);

        ArrayList<Double> doubles = new ArrayList<>();

        doubles.add(1.5);
        doubles.add(2.5);
        doubles.add(3.5);

        System.out.println(doubles);

    }
}