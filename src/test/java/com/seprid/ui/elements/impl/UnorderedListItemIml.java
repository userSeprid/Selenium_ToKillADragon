package com.seprid.ui.elements.impl;

import com.seprid.ui.elements.UnorderedListItem;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class UnorderedListItemIml extends UnorderedListItem {


    public UnorderedListItemIml(String filmName, String link) {
        super(filmName, link);
    }

    @Override
    public WebElement getElement() throws NoSuchElementException {
        return waitVisibilityPartialLinkText(name);
    }
}
