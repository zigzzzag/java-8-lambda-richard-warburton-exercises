package org.zigzzzag.chapter4.other;

interface Child extends Parent {

    @Override
    default String welcome() {
        return "Child welcome";
    }
}
