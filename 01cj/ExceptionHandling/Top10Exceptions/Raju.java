public class Raju {
    public static void main(String[] args) {
        Rani r = new Rani();
    }
}


//JVM requires some .class file but that .class file is not available at runtime


//NoClassDefFoundError:
// Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//         Rani cannot be resolved to a type
//         Rani cannot be resolved to a type

//         at NoClassDefFoundError.main(NoClassDefFoundError.java:3)


// Raju.java
//Exception in thread "main" java.lang.NoClassDefFoundError: Rani
// at Raju.main(Raju.java:3)
// Caused by: java.lang.ClassNotFoundException: Rani
// at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
// at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
// at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:528)
// ... 1 more
