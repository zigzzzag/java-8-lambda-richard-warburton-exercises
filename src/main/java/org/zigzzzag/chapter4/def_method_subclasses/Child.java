package org.zigzzzag.chapter4.def_method_subclasses;

interface Child extends Parent {

    @Override
    default String welcome() {
        return "Child welcome";
    }
}
