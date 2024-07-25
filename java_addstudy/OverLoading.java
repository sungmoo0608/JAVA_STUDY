class Loading{
    public int getInt(int a){
        return 1;
    }

    public int getInt(double b){
        return (int)b;
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Loading load = new Loading();
        System.out.println(load.getInt(10));
        System.out.println(load.getInt(50.55));
    }
}
