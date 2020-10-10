package pack;

public class gitLearn {
    public  int add(int a,int b){
        int i=a+b;
        System.out.println(i);
        return i;
    }
    public int sub(int b){
        int x=100-b;
    return x;
    }

    public static void main(String[] args) {
        gitLearn g=new gitLearn();
        g.add(5,6);
        System.out.println(g.sub(45));
    }
}
