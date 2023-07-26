package com.jad;

import com.jad.test.*;

import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        ArrayList<Foo> myList = new ArrayList<>();
        myList.add(new Corge());
        myList.add(new Bar());

        for(Foo foo : myList) {
            foo.doSomethingElse();
        }

        System.out.println(Test.ID);

        Color color = Color.RED;
        // Color c2 = new Color("Rose");
        Box<Foo> box = new Box();
        box.setContent(new Corge());
        Qux q1 = new Qux();
        Qux q2 = new Qux(35);
        Qux q3 = new Qux(q2);


    }
}
