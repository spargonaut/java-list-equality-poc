package org.spargonaut.listequality;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ListEqualityTest {

    @Test
    public void listsShouldBeEqualWhenContentsAreExactSame() {
        Foo fooOneListOne = new Foo();
        fooOneListOne.setName("one");
        fooOneListOne.setId(123);

        Foo fooTwoListOne = new Foo();
        fooTwoListOne.setName("two");
        fooTwoListOne.setId(234);

        Foo fooThreeListOne = new Foo();
        fooThreeListOne.setName("three");
        fooThreeListOne.setId(345);

        Foo fooFourListOne = new Foo();
        fooFourListOne.setName("two");
        fooFourListOne.setId(456);

        List<Foo> listOne = Lists.newArrayList(fooOneListOne, fooTwoListOne, fooThreeListOne, fooFourListOne);
        List<Foo> listTwo = Lists.newArrayList(fooOneListOne, fooTwoListOne, fooThreeListOne, fooFourListOne);

        assertEquals(listOne, listTwo);
    }

    @Test
    public void listsShouldBeEqualWhenContentValuesAreSameAndEqualsAndHashCodeAreOverridden() {
        Foo fooOneListOne = new Foo();
        fooOneListOne.setName("one");
        fooOneListOne.setId(123);

        Foo fooOneListTwo = new Foo();
        fooOneListTwo.setName("one");
        fooOneListTwo.setId(123);

        Foo fooTwoListOne = new Foo();
        fooTwoListOne.setName("two");
        fooTwoListOne.setId(234);

        Foo fooTwoListTwo = new Foo();
        fooTwoListTwo.setName("two");
        fooTwoListTwo.setId(234);

        Foo fooThreeListOne = new Foo();
        fooThreeListOne.setName("three");
        fooThreeListOne.setId(345);

        Foo fooThreeListTwo = new Foo();
        fooThreeListTwo.setName("three");
        fooThreeListTwo.setId(345);

        Foo fooFourListOne = new Foo();
        fooFourListOne.setName("two");
        fooFourListOne.setId(456);

        Foo fooFourListTwo = new Foo();
        fooFourListTwo.setName("two");
        fooFourListTwo.setId(456);

        List<Foo> listOne = Lists.newArrayList(fooOneListOne, fooTwoListOne, fooThreeListOne, fooFourListOne);
        List<Foo> listTwo = Lists.newArrayList(fooOneListTwo, fooTwoListTwo, fooThreeListTwo, fooFourListTwo);

        assertEquals(listOne, listTwo);
    }

    @Test
    public void listsAreDifferentWhenObjectsAreDifferentAndContentValuesAreSameUsingDefaultEqualsAndHashCode() {
        Bar barOneListOne = new Bar();
        barOneListOne.setName("one");
        barOneListOne.setId(123);

        Bar barOneListTwo = new Bar();
        barOneListTwo.setName("one");
        barOneListTwo.setId(123);

        Bar barTwoListOne = new Bar();
        barTwoListOne.setName("two");
        barTwoListOne.setId(234);

        Bar barTwoListTwo = new Bar();
        barTwoListTwo.setName("two");
        barTwoListTwo.setId(234);

        Bar barThreeListOne = new Bar();
        barThreeListOne.setName("three");
        barThreeListOne.setId(345);

        Bar barThreeListTwo = new Bar();
        barThreeListTwo.setName("three");
        barThreeListTwo.setId(345);

        Bar barFourListOne = new Bar();
        barFourListOne.setName("two");
        barFourListOne.setId(456);

        Bar barFourListTwo = new Bar();
        barFourListTwo.setName("two");
        barFourListTwo.setId(456);

        List<Bar> listOne = Lists.newArrayList(barOneListOne, barTwoListOne, barThreeListOne, barFourListOne);
        List<Bar> listTwo = Lists.newArrayList(barOneListTwo, barTwoListTwo, barThreeListTwo, barFourListTwo);

        assertNotEquals(listOne, listTwo);
    }
}
