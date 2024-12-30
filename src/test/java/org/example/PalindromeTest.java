package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PalindromeTest {






    @Test
    void isPalindrome_NotPalindrome_True() {
        //given
        final var str = "1Red rum, sir ,is murder1";
        //when
        final var result = Palindrome.isPalindrome(str);
        //then

        Assertions.assertTrue(result);
    }

    @Test
    void isPalindrome_NotPalindrome_False() {

        //given
        final var str = "apple";
        //when
       final var result = Palindrome.isPalindrome(str) ;
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void simplifyString() {
        //given
        final var str = "1Red rum, sir ,is murder1";
        //when
        final var result = Palindrome.simplifyString(str);

        Assertions.assertEquals("1redrumsirismurder1",result);
    }
}