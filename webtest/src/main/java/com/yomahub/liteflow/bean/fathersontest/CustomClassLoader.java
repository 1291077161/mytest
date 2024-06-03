//
// public class MyClassLoader extends ClassLoader {
//     @Override
//     protected Class<?> findClass(String name) throws ClassNotFoundException {
//         byte[] b = loadClassData(name);
//         if (b == null) {
//             throw new ClassNotFoundException();
//         } else {
//             return defineClass(name, b, 0, b.length);
//         }
//     }
//
//     private byte[] loadClassData(String className) {
//         // 这里可以根据实际情况从文件、网络等地方读取字节码数据
//         // 为了简化示例，我们直接返回null
//         return null;
//     }
// }
