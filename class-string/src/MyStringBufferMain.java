public class MyStringBufferMain {
    public static void main(String[] args) {
        // Đồng bộ và bất đồng bộ
        // StringBuffer là đồng bộ (synchronized) tức là luồng an toàn.
        // Điều này có nghĩa là không thể có 2 luồng cùng truy cập phương thức của lớp StringBuffer đồng thời.

        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println(buffer);

        // Nối chuỗi
        buffer.append(" Word");
        System.out.println(buffer);
        System.out.println("Length:" + buffer.length());

        // Thêm chuỗi con vào chuỗi cha ban đầu tại một vị trí bất kỳ
        buffer.insert(3, "hi");
        System.out.println(buffer);
        System.out.println("Length:" + buffer.length());

        // Xoá một chuỗi con trong khoảng
        buffer.delete(2,5);
        System.out.println(buffer);
        System.out.println("Length:" + buffer.length());

        // Xoá 1 kí tự tại một vị trí bất kỳ
        buffer.deleteCharAt(6);
        System.out.println(buffer);
        System.out.println("Length:" + buffer.length());
    }
}
