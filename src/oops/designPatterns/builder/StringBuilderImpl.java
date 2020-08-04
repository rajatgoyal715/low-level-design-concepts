package oops.designPatterns.builder;

/**
 * String Builder implementation class
 *
 * @author rajatgoyal715
 */
public class StringBuilderImpl {

    int capacity;
    char[] value;
    int count;

    public StringBuilderImpl() {
        capacity = 16;
        value = new char[capacity];
        count = 0;
    }

    public StringBuilderImpl(String str) {
        int len = str.length();
        capacity = (int)(Math.pow(10, Math.log10((double)len) + 1));
        value = new char[capacity];
        for(int i=0;i<len;i++){
            value[count+i] = str.charAt(i);
        }
        count = len;
    }

    public StringBuilderImpl append(String str) {
        int len = str.length();
        if (count + len > capacity) {
            capacity *= 2;
        }
        for(int i=0;i<len;i++){
            value[count+i] = str.charAt(i);
        }
        count += len;
        return this;
    }

    public String toString() {
        return new String(value);
    }
}
