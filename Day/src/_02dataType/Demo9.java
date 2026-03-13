package _02dataType;

public class Demo9 {
    public static void main(String[] args) {
        // switch 用法
        // switch (表达式){
        // case 表达式 :
        //
        // break;
        // }
        // 表达式中的可允许的数据类型为 byte、short、int、char、枚举类型、String


//        int x = 2;
//        int y = 3;
//        switch(x){
//            default:
//                y++;
//                break;
//            case 3:
//                y++;
//            case 4:
//                y++;
//        }
//        System.out.println("y="+y);//y=4

        int x = 2;
        int y = 3;
        switch(x){
            default:
                y++;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y="+y);//y=6

    }
}
