package com.devskiller.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static com.devskiller.StructureTestUtil.loadClass;
import static com.devskiller.StructureTestUtil.loadMethod;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@TestMethodOrder(OrderAnnotation.class)
class StringHelperStructureTest {

    private static final String STRING_HELPER_CLASS_ENCODED_NAME = "Y29tLmRldnNraWxsZXIudXRpbHMuU3RyaW5nSGVscGVy";
    private static final String STRING_CLASS_ENCODED_NAME = "amF2YS5sYW5nLlN0cmluZw==";
    private static final String INT_CLASS_ENCODED_NAME = "aW50";
    private static final String REVERSE_METHOD_ENCODED_NAME = "cmV2ZXJzZQ==";
    private static final String SUBSTRING_METHOD_ENCODED_NAME = "c3Vic3RyaW5n";

    @Test
    @Order(1)
    @DisplayName("should be named `StringHelper` and be placed under `com.devskiller.utils` package")
    void stringHelperClass() {

        final Class<?> expectedClass = loadClass(STRING_HELPER_CLASS_ENCODED_NAME);

        assertThat(expectedClass)
                .isNotNull()
                .isPublic();
    }

    @Test
    @Order(2)
    @DisplayName("should have `reverse` method with single parameter of type `String`")
    void reverseMethod() {

        final Method expectedMethod = loadMethod(
                STRING_HELPER_CLASS_ENCODED_NAME,
                REVERSE_METHOD_ENCODED_NAME,
                STRING_CLASS_ENCODED_NAME);

        assertAll(
                () -> assertThat(expectedMethod).isNotNull(),
                () -> assertThat(expectedMethod.getGenericReturnType()).isEqualTo(String.class),
                () -> assertThat(expectedMethod.getModifiers()).satisfies(
                        modifier -> {
                            assertThat(Modifier.isStatic(modifier)).isTrue();
                            assertThat(Modifier.isPublic(modifier)).isTrue();
                        }
                )
        );
    }

    @Test
    @Order(3)
    @DisplayName("should have `substring` method with two parameters of type `String` and `int`")
    void substringMethod() {

        final Method expectedMethod = loadMethod(
                STRING_HELPER_CLASS_ENCODED_NAME,
                SUBSTRING_METHOD_ENCODED_NAME,
                STRING_CLASS_ENCODED_NAME,
                INT_CLASS_ENCODED_NAME);

        assertAll(
                () -> assertThat(expectedMethod).isNotNull(),
                () -> assertThat(expectedMethod.getGenericReturnType()).isEqualTo(String.class),
                () -> assertThat(expectedMethod.getModifiers()).satisfies(
                        modifier -> {
                            assertThat(Modifier.isStatic(modifier)).isTrue();
                            assertThat(Modifier.isPublic(modifier)).isTrue();
                        }
                )
        );
    }
}
