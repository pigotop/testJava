# Introduction

You have to implement two methods which will be returning the words from the text and reversing them.

# Problem Statement

## 1. Substring

#### Summary
The first method to implement is `substring(String input, int index)`. It should return a specific word from the input text. The words are separated by a space (`' '`).

#### Examples
```java
substring("one two three", 2)
``` 
should return `"two"`

--------


```java
substring("one;two three", 2)
```
should return `"three"`

----------

```java
substring("one", 1)
```

should return `"one"`

#### Be aware of

The `IllegalArgumentException` should be thrown when:
* the input parameter is less than 1,
* the input text does not have enough words (`substring("one", 2)`),
* the input is null.

The method should ignore all spaces at the beginning and at the end of the input text.


## 2. Reverse

#### Summary
The second method to implement in this task is `reverse(String input)`. It should only return a reversed string of the passed input value.
When the input is null, the method should throw an `IllegalArgumentException`.

#### Examples
```java
reverse("one")
```
should return `eno`

--------

```java
reverse("abcd dcba")
```
should return `abcd dcba`

#### Be aware of

The method should return an empty string if an empty string is passed as an input parameter.
