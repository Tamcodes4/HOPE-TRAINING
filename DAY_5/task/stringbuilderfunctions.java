package DAY_5.task;
public class stringbuilderfunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("append(): " + sb);
        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);
        sb.replace(6, 10, "C++");
        System.out.println("replace(): " + sb);
        sb.delete(5, 9);
        System.out.println("delete(): " + sb);
        sb.reverse();
        System.out.println("reverse(): " + sb);
        sb = new StringBuilder("Programming");
        System.out.println("charAt(3): " + sb.charAt(3));
        sb.setCharAt(0, 'p');
        System.out.println("setCharAt(): " + sb);
        System.out.println("length(): " + sb.length());
        System.out.println("capacity(): " + sb.capacity());
        System.out.println("substring(3): " + sb.substring(3));
        System.out.println("substring(3, 7): " + sb.substring(3, 7));
        System.out.println("indexOf('g'): " + sb.indexOf("g"));
        System.out.println("lastIndexOf('g'): " + sb.lastIndexOf("g"));
        sb.deleteCharAt(2);
        System.out.println("deleteCharAt(): " + sb);
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(): " + sb.capacity());
        sb.trimToSize();
        System.out.println("trimToSize(): " + sb.capacity());
        String str = sb.toString();
        System.out.println("toString(): " + str);
    }
}
