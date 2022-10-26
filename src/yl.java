public class yl {
    public static void main(String[] args) {
        String[] h = {"white", "blue", "red"};
        for (int i=0; i< h.length; i++){
            System.out.println(h[i]);
        }
        System.out.println();
        int a = h.length;
        String temp;
        for (int i = 0; i<a/2; i++) {
            temp = h[a-i-1];
            h[a-i-1] = h[i];
            h[i] = temp;
        }
        for (int i=0; i< h.length; i++){
            System.out.println(h[i]);
        }
    }
}
