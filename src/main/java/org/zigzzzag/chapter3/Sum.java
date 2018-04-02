package org.zigzzzag.chapter3;

import java.util.stream.Stream;

class Sum {

    int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (x, y) -> x + y);
    }
}
