package ua.lviv.lgs;

import java.lang.reflect.Array;

public class Application {
    public static void main(String[] args) {
        Integer[] array = {1,2,65,4,23,22,23, 43};
        Collection c = new Collection(array);

        Iterator iterator = c.createForward();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Task 2: ");

        Iterator iterator2 = c.createThroughOne();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


        System.out.println("Task 3: ");

        arrayNumerable arr = c.arrayNumerable();

        arr.isThirdElementPair(array);

        System.out.println("Task 4: ");

        arrayMinusable arrayMinusable = c.arrayMinusable();

        arrayMinusable.arrayMinus(array);

        System.out.println("Task 5: ");

        arrayPairToUnpair pairToUnpair = c.changePair();

        pairToUnpair.pairToUnpair(array);

    }
}
