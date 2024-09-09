package org.thunder;


/**
 *
 * JVM <- JRE <- JDK
 *
 * JVM - Abstract machine, Platform dependent, runs the platform independent byte code.
 *     - JIT Compiler (does the compilation part inside JVM)
 * JRE - JVM and java API, runtime environment for running java applications.
 *     - Minimum JRE is required to run applications
 * JDK - Core development utilities, compiler, debugger
 *
 * All the above pieces of software are platform dependent. The code which we write is platform independent WORA
 *
 * JSE - Core Java, Java Standard Edition
 * JEE - Web applications, JSP, Servlets, Jakarta Enterprise Edition
 * JME - Java Micro Edition, to run on resource constrained devices
 *
 * 1 file can contain one public class with class name same as file name.
 * This helps JVM in class loading execution. JVM maps class with file name. avoids namespaces and package level conflicts
 */
public class JavaArchitecture {

    public static void main(String args[]){
        System.out.println("Java Architecture");

    }
}

