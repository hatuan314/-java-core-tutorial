public class MyStringMain {
    public static void main(String[] args) {
        // String -> chuỗi: tập hợp của các kí tự, mảng kiểu char
        // String -> là 1 class
        // String, StringBuilder, StringBuffer
        String txt = new String("hello");

        String text = "Hello";
        // charAt -> Trả về một ký tự tại vị trí có chỉ số được chỉ định.
        System.out.println("text.charAt(2) -> " + text.charAt(2));
        // So sánh hai chuỗi theo từ điển. (Phân biệt chữ hoa chữ thường)
        System.out.println("text.compareTo(\"Hello\") -> " + text.compareTo("Hi"));
        // So sánh hai chuỗi theo từ điển. (Không phân biệt chữ hoa chữ thường)
        System.out.println("text.compareToIgnoreCase(\"hello\") -> " + text.compareToIgnoreCase("hello"));
        // Nối chuỗi được chỉ định đến cuối của chuỗi này.
        System.out.println("text.concat(\" KIT\") -> " + text.concat(" KIT"));
        // Trả về độ dài chuỗi.
        System.out.println("text.length() -> " + text.length());
        // Tách chuỗi này thành các chuỗi con
        System.out.println("text.split(\"\") -> ");
        for(int index = 0; index < text.split("l").length; index++) {
            String item = text.split("l")[index];
            System.out.println(index + " -> " + item);
        }
        // Trả về một String mới, sau khi loại bỏ các ký tự trắng (whitespace) bên trái và bên phải.
        System.out.println("text.trim() -> " + text.trim());

        // Toán tử "==" -> so sánh giá trị (Nội dung) 2 biến và vị trí lưu trữ giá trị đó
        // Phương thức Equals/CompareTo -> chỉ só sánh, giá trị (Nội dung) của 2 biến
        String s1 = "Hello"; // String literal
        String s2 = "Hello";
        String s3 = s1;
        String s4 = new String("Hello");  // Tạo mới một đối tượng String
        String s5 = new String("Hello");

        System.out.println("s1 == s1 -> " + (s1 == s1));
        System.out.println("s1 == s2 -> " + (s1 == s2));
        System.out.println("s1 == s3 -> " + (s1 == s3));
        System.out.println("s1 == s4 -> " + (s1 == s4));
        System.out.println("s1 == s5 -> " + (s1 == s5));

        System.out.println("s1.equals(s3) -> " + s1.equals(s3));
        System.out.println("s1.equals(s4) -> " + s1.equals(s4));
        System.out.println("s1.equals(s5) -> " + s1.equals(s5));
    }
}
