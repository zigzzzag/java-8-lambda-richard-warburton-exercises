package org.zigzzzag.chapter4.def_method_subclasses;

interface Parent {

    default String welcome() {
        return "Parent welcome";
    }
}
