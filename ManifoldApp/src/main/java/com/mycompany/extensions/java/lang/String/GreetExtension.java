package com.mycompany.extensions.java.lang.String;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

@Extension
public class GreetExtension {

    public static String assignGreeting(@This String str) {
        return str.equals("Mr") ? "Sir" : "Madam";
    }
}
