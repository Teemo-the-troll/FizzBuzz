import java.util.Iterator;

public class FizzBuzzIterator<String> implements Iterator<String> {
    private int i = 0;
        @Override
        public boolean hasNext() {
         return true;
        }

        @Override
        public String next() {
            i++;

            if (isBuzzable(i) && isFuzzable(i))
                return (String) "FizzBuzz";

            if (isFuzzable(i))
                return (String) "Fizz";

            if (isBuzzable(i))
                return (String) "Buzz";

            return (String) Integer.toString(i);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();

        }

        private boolean isFuzzable(int i){
            if (i%3 == 0)
                return true;
            else return false;
        }


        public boolean isBuzzable(int i){
            if (i%5 == 0)
                return true;
            else return false;
        }



}