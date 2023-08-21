package com.mycompany;

public interface Pet {

    String say();

    static Pet create() throws Exception {
        return (Pet) Class.forName("darkj.Cat").newInstance();
    }
}
