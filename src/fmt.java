import java.lang.reflect.Field;

public class fmt {
    @SafeVarargs
    static public <P> void Println(P... any) {
        Print(any);
        System.out.println();
    }

    @SafeVarargs
    static public <P> void Print(P... any) {
        int count = any.length;
        for (P arg : any) {

            // args is null
            if (arg == null) {
                Print("null");
                count = split(count);
                continue;
            }

            // args is basic type
            if (arg.getClass().isPrimitive() || arg instanceof Integer || arg instanceof String || arg instanceof Boolean || arg instanceof Character || arg instanceof Byte || arg instanceof Short || arg instanceof Long || arg instanceof Float || arg instanceof Double) {
                System.out.print(arg);
                count = split(count);
                continue;
            }

            // args is an array
            if (arg.getClass().isArray()) {
                Print("[ ");
                int length = java.lang.reflect.Array.getLength(arg);
                for (int i = 0; i < length; i++) {
                    Object o = java.lang.reflect.Array.get(arg, i);
                    Print(o);
                    if (i != length - 1) {
                        Print(", ");
                    }
                }
                Print(" ]");
                count = split(count);
                continue;
            }

            // args is a derived class
            if (arg.getClass().getSuperclass() != null) {
                Print("{ ");
                int length = arg.getClass().getDeclaredFields().length;
                for (int i = 0; i < length; i++) {
                    Field field = arg.getClass().getDeclaredFields()[i];
                    field.setAccessible(true);
                    try {
                        Print(field.getName() + ": " + field.get(arg));
                    } catch (IllegalAccessException ignored) {
                    }
                    if (i != length - 1) {
                        Print(", ");
                    }
                }
                Print(" }");
                count = split(count);
                continue;
            }

            //
            System.out.println();
        }
    }

    private static int split(int count) {
        if (count - 1 <= 0) {
            return 0;
        } else {
            System.out.print(", ");
            return count - 1;
        }
    }
}
