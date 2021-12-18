package ua.lviv.lgs;

public interface Iterator {
    Object next();
    boolean hasNext();
}

class Collection {
    private static Integer[] array;

    Collection(Integer[] array) {
        Collection.array = array;
    }

    public static class Forward implements Iterator {

        int count = 0;

        @Override
        public Object next() {
            if (array[count++] % 2 == 0) {
                return array[count];
            } else
                return 0;
        }

        @Override
        public boolean hasNext() {
            return count < array.length;
        }
    }

    public static class throughOne implements Iterator{
        int count = 0;

        @Override
        public Object next() {
            if (count++ % 2 == 0) {
                return array[count];
            } else
                return "";
        }


        @Override
        public boolean hasNext() {
            return count < array.length;
        }
    }

    public throughOne createThroughOne() {
        return new throughOne();
    }

    public Forward createForward() {
        return new Forward();
    }

    public arrayNumerable arrayNumerable() {
        return new arrayNumerable() {
            @Override
            public void isThirdElementPair(Integer[] array) {
                int count = array.length - 1;

                for (int i = count; i >= 0; i--) {
                    if (i % 3 == 0) {
                        if (array[i] % 2 != 0) {
                            System.out.println(array[i] + 1);
                        }
                    }
                }
            }
        };
    }

    public arrayMinusable arrayMinusable() {
        class minusable implements arrayMinusable {
            @Override
            public void arrayMinus(Integer[] array) {

                for (int i = 0; i < array.length; i++) {
                    if (i % 5 == 0) {
                        if (array[i] % 2 == 0) {
                            System.out.println(array[i] - 100);
                        }
                    }
                }
            }
        }
        return new minusable();
    }

    private static class pairToUnpair implements arrayPairToUnpair {

        @Override
        public void pairToUnpair(Integer[] array) {
            for (int i = 1; i < array.length; i++) {
                 if (i % 2 == 0) {
                     if (array[i] % 2 == 0) {
                         System.out.println(array[i] + 1);
                     } else
                         System.out.println(array[i] - 1);
                 }
            }
        }
    }

    public arrayPairToUnpair changePair() {
        return new pairToUnpair();
    }
}
