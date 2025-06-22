public class stringtest
{
    public static void main(String[] args) {
        String s;
        s="Hello";
        String c;
        c=s.concat(" World");
        System.out.println(c+c.length());
        StringBuffer sb=new StringBuffer("FEI");
        sb.append("NT");
        sb.reverse();

        System.out.println(sb);
    }
}
