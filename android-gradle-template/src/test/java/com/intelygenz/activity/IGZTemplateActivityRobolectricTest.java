package com.intelygenz.activity;

import android.app.Activity;
import com.intelygenz.template.screen.IGZTemplateActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class IGZTemplateActivityRobolectricTest {

    @Test
    public void testSomething() throws Exception {
        Activity activity = Robolectric.buildActivity(IGZTemplateActivity.class).create().get();
        assertTrue(activity != null);
    }
}
