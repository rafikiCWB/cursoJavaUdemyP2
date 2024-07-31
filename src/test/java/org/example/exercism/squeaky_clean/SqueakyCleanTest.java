package org.example.exercism.squeaky_clean;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SqueakyCleanTest {

    @Test
    @Tag("task:1")
    @DisplayName("The clean method returns empty string when invoked on empty string")
    public void empty() {
        assertThat(SqueakyClean.clean("")).isEmpty();
    }

    @Test
    @Tag("task:1")
    @DisplayName("The clean method returns the same string when invoked on a single letter string")
    public void single_letter() {
        assertThat(SqueakyClean.clean("A")).isEqualTo("A");
    }

    @Test
    @Tag("task:1")
    @DisplayName("The clean method returns the same string when invoked on a string of three letters")
    public void string() {
        assertThat(SqueakyClean.clean("abc")).isEqualTo("abc");
    }

    @Test
    @Tag("task:1")
    @DisplayName("The clean method replaces whitespaces with underscores in the middle of the string")
    public void spaces() {
        assertThat(SqueakyClean.clean("my   Id")).isEqualTo("my___Id");
    }

    @Test
    @Tag("task:1")
    @DisplayName("The clean method replaces leading and trailing whitespaces with underscores")
    public void leading_and_trailing_spaces() {
        assertThat(SqueakyClean.clean(" myId ")).isEqualTo("_myId_");
    }

    @Test
    @Tag("task:2")
    @DisplayName("The clean method converts kebab to camel case after removing a dash")
    public void kebab_to_camel_case() {
        assertThat(SqueakyClean.clean("a-bc")).isEqualTo("aBc");
    }

    @Test
    @Tag("task:2")
    @DisplayName("")
    public void kebab_to_camel_case_and_number() {
        assertThat(SqueakyClean.clean("a-C ")).isEqualTo("aC_");
    }


    @Test
    @Tag("task:3")
    @DisplayName("The clean method converts leetspeak to normal text with spaces and special characters")
    public void leetspeak_to_normal_text_spaces_and_special_characters() {
        assertThat(SqueakyClean.clean("¡1337sp34k is fun!")).isEqualTo("leetspeak_is_fun");
    }

}