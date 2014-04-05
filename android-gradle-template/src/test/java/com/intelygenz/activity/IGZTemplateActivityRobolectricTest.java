package com.intelygenz.activity;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import com.intelygenz.template.R;
import com.intelygenz.template.screen.HomeScreen;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class IGZTemplateActivityRobolectricTest {

    private HomeScreen activity;

    @Test
    public void testCreation() throws Exception {
        Activity activity = Robolectric.buildActivity(HomeScreen.class).create().get();
        assertTrue(activity != null);
    }

    /*

    @Before
    public void setup()  {
        activity = Robolectric.buildActivity(HomeScreen.class).create().get();
    }

    @Test
    public void shouldCreateActivityWithListView() throws Exception {
        ListView listView = (ListView) activity.findViewById(R.id.listview);

        assertNotNull(activity);
        assertNotNull(listView);
    }

    @Test
    public void shouldCreateActivityWithListAndContent() {
        ListView listView = (ListView) activity.findViewById(R.id.listview);

        assertNotNull(activity);
        assertNotNull(listView);

        assertTrue(listView.getAdapter().getCount() > 0);
    }
            */



}
