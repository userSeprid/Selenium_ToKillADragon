package com.seprid.ui.core;

import org.openqa.selenium.WebElement;

public abstract class AbstractTextElement extends AbstractUIElement {


    public AbstractTextElement(String name, String URL) {
        super(name, URL);
    }

    protected abstract WebElement getElement();
}
