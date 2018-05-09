package org.zigzzzag.chapter3.ex06_07;

import java.util.List;
import java.util.Optional;

/**
 * <pre>
 * 6. Count the number of lowercase letters in a String (hint: look at the chars method on String)
 * 7. Find the String with the largest number of lowercase letters from a List<String>. You can return an
 *    Optional<String> to account for the empty list case.
 * </pre>
 */
class OperationsCh03Ex06_07 {

    long lowerCaseCount(String str) {
        return str.chars().filter(Character::isLowerCase).count();
    }

    Optional<String> maxLowerCaseCount(List<String> strs) {
        return strs.stream().max((s1, s2) -> (int) (lowerCaseCount(s1) - lowerCaseCount(s2)));
    }
}
