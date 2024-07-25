public class test1 {
    public static void main(String[] args) {
        int int_a = 10; //  4byte   2^31
        // 자료형 변수명 = 변수값
        // 안바뀌는 변수는 상수라고 합니다. 
        Long lng_a = 10L;   //  8byte   2^63
        String str_a;   //  문자열
        double db_a;    // 실수
        float ft_a = 1.1f;  //  실수
        boolean bl_a;   //  조건    이산수학
        boolean bl_b; 

        int_a = 10*100;
        lng_a = 20*100L;

        System.out.println(int_a);
        System.out.println(lng_a);
        System.out.println(int_a + lng_a);

        str_a = "홍길동 나이 :";
        int_a = 25;

        System.out.println(str_a + int_a);

        bl_a = false;

        if (bl_a != true) {
        System.out.println("진실입니다!");
        } else {
            System.out.println("거짓입니다!");
        }

        bl_b = true;

        if (bl_a){

        } else if (bl_b){
            System.out.println("bl_b는 참!");
        }

    }
}