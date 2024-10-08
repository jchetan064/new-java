/**
 * _03_StringBuffer_Builder
 */
public class _03_StringBuffer_Builder {

    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Chetan");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		sb.append("Joshi");
		System.out.println(sb);
		System.out.println(sb.insert(4,"aaa" ));
		// String str=sb.toString();
    }
}