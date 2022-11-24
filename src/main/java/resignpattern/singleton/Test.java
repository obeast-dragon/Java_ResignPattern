package resignpattern.singleton;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 8:47
 */
public class Test {
//    public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//            new Thread(() -> {
//                try {
//                    System.out.println(Mg08.INSTANCE.hashCode());
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }).start();
//        }
//    }

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    Mg00 mg00 = new Mg00();
                    System.out.println(mg00.hashCode());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
    //enum反编码的样子
/**
 public static final com.example.resignpattern_2.singleton.Mg08 INSTANCE;
 descriptor: Lcom/example/resignpattern_2/singleton/Mg08;
 flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_ENUM

 public static com.example.resignpattern_2.singleton.Mg08[] values();
 descriptor: ()[Lcom/example/resignpattern_2/singleton/Mg08;
 flags: ACC_PUBLIC, ACC_STATIC
 Code:
 stack=1, locals=0, args_size=0
 0: getstatic     #1                  // Field $VALUES:[Lcom/example/resignpattern_2/singleton/Mg08;
 3: invokevirtual #2                  // Method "[Lcom/example/resignpattern_2/singleton/Mg08;".clone:()Lj
 ava/lang/Object;
 6: checkcast     #3                  // class "[Lcom/example/resignpattern_2/singleton/Mg08;"
 9: areturn
 LineNumberTable:
 line 12: 0

 public static com.example.resignpattern_2.singleton.Mg08 valueOf(java.lang.String);
 descriptor: (Ljava/lang/String;)Lcom/example/resignpattern_2/singleton/Mg08;
 flags: ACC_PUBLIC, ACC_STATIC
 Code:
 stack=2, locals=1, args_size=1
 0: ldc           #4                  // class com/example/resignpattern_2/singleton/Mg08
 2: aload_0
 3: invokestatic  #5                  // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String
 ;)Ljava/lang/Enum;
 6: checkcast     #4                  // class com/example/resignpattern_2/singleton/Mg08
 9: areturn
 LineNumberTable:
 line 12: 0
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 0      10     0  name   Ljava/lang/String;
 MethodParameters:
 Name                           Flags
 name                           mandated

 public void M();
 descriptor: ()V
 flags: ACC_PUBLIC
 Code:
 stack=0, locals=1, args_size=1
 0: return
 LineNumberTable:
 line 18: 0
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 0       1     0  this   Lcom/example/resignpattern_2/singleton/Mg08;

 public static void main(java.lang.String[]);
 descriptor: ([Ljava/lang/String;)V
 flags: ACC_PUBLIC, ACC_STATIC
 Code:
 stack=3, locals=2, args_size=1
 0: iconst_0
 1: istore_1
 2: iload_1
 3: sipush        500
 6: if_icmpge     30
 9: new           #7                  // class java/lang/Thread
 12: dup
 13: invokedynamic #8,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
 18: invokespecial #9                  // Method java/lang/Thread."<init>":(Ljava/lang/Runnable;)V
 21: invokevirtual #10                 // Method java/lang/Thread.start:()V
 24: iinc          1, 1
 27: goto          2
 30: return
 LineNumberTable:
 line 22: 0
 line 23: 9
 line 22: 24
 line 25: 30
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 2      28     1     i   I
 0      31     0  args   [Ljava/lang/String;
 StackMapTable: number_of_entries = 2
 frame_type = 252 /* append */
//    offset_delta = 2
//    locals = [ int ]
//    frame_type = 250 /* chop */
//    offset_delta = 27
//    MethodParameters:
//    Name                           Flags
//    args
//
//    static {};
//    descriptor: ()V
//    flags: ACC_STATIC
//    Code:
//    stack=4, locals=0, args_size=0
//            0: new           #4                  // class com/example/resignpattern_2/singleton/Mg08
//            3: dup
//         4: ldc           #15                 // String INSTANCE
//    public static final #96= #95 of #99; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/
//    invoke/MethodHandles
//    BootstrapMethods:
//            0: #60 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava
///lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/i
//    nvoke/MethodType;)Ljava/lang/invoke/CallSite;



