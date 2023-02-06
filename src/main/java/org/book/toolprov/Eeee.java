package org.book.toolprov;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eeee {
    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        List<String> sources = Arrays.asList(new String[] {"demo/Test2.java", "demo/Test1.java"});
        // set compiler's classpath to be same as the runtime's
        String classpath = System.getProperty("java.class.path");
        List<String> optionList = new ArrayList<>();
        optionList.addAll(Arrays.asList("-classpath", classpath));
        optionList = Arrays.asList("-d", "demo_class");
        try (StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {
            Iterable<? extends JavaFileObject> fileObjects = fileManager.getJavaFileObjectsFromStrings(sources);
            JavaCompiler.CompilationTask task = compiler.getTask(null, null, null, optionList, null, fileObjects);
            Boolean result = task.call();
            if (result == null || !result) {
                throw new RuntimeException(
                        "Compilation failed. class file path:" + fileObjects);
            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
