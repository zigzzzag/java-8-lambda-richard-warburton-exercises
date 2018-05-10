package org.zigzzzag.chapter4.other;

interface Parent {

    default String welcome() {
        return "Parent welcome";
    }
}
