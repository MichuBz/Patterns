package com.sda.composite;

import com.sda.composite.OurComposite;
import org.junit.Test;
import org.mockito.Mockito;

public class CompositeTest {

    @Test
    public void shouldDrawTree() {
        final OurComposite window = Mockito.spy(new OurWindow());
        final OurLeaf button = Mockito.spy(new OurButton());
        final OurLeaf text = Mockito.spy(new OurText());
        window.add(button);
        window.add(text);

        window.draw();

        Mockito.verify(window).draw();
        Mockito.verify(button).draw();
        Mockito.verify(text).draw();
    }
}
