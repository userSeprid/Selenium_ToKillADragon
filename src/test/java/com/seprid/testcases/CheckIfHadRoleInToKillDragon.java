package com.seprid.testcases;

import com.seprid.dictionary.FirstCase;
import com.seprid.ui.elements.impl.UnorderedListItemIml;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class CheckIfHadRoleInToKillDragon {
    private final String filmName = "To Kill a Dragon";

    @Test
    public void roleCheckTest() {
        Assert.assertTrue("Aleksandr Abdulov", roleCheck(FirstCase.Aleksandr_Abdulov.getActorLink()));
        Assert.assertTrue("Alexandra Zakharova", roleCheck(FirstCase.Alexandra_Zakharova.getActorLink()));
        Assert.assertTrue("Oleg Yankovsky", roleCheck(FirstCase.Oleg_Yankovsky.getActorLink()));
        Assert.assertTrue("Viktor Rakov", roleCheck(FirstCase.Viktor_Rakov.getActorLink()));
        Assert.assertTrue("Vyacheslav Tikhonov", roleCheck(FirstCase.Vyacheslav_Tikhonov.getActorLink()));
        Assert.assertTrue("Yevgeny Leonov", roleCheck(FirstCase.Yevgeny_Leonov.getActorLink()));
    }

    private boolean roleCheck(String link) {
        boolean result = false;
        try {
            WebElement element = new UnorderedListItemIml(filmName, link).getElement();
            result = true;
        }catch (NoSuchElementException ex) {
            System.out.println("Actor don't had role in film \'To Kill a Dragon\'");
        }
        return result;
    }
}
