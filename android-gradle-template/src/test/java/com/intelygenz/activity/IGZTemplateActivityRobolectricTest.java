package com.intelygenz.activity;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import com.intelygenz.template.R;
import com.intelygenz.template.model.FakeDatabase;
import com.intelygenz.template.model.Repository;
import com.intelygenz.template.presenter.HomePresenter;
import com.intelygenz.template.presenter.IHomePresenter;
import com.intelygenz.template.screen.HomeScreen;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@Config(manifest = "src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class IGZTemplateActivityRobolectricTest {

    private HomeScreen homeScreen;
    private ActivityController<HomeScreen> homeScreenController;

    /**
     * Basic creation test

    @Test
    public void testCreation() throws Exception {
        Activity activity = Robolectric.buildActivity(HomeScreen.class).create().get();
        assertTrue(activity != null);
    }
    */



    @Before
    public void setup()  {
        homeScreen = Robolectric.buildActivity(HomeScreen.class).create()
                .start()
                .resume()
                .visible()
                .get();
        homeScreenController = Robolectric.buildActivity(HomeScreen.class).create().start();
    }

    @Test
    public void shouldCreateActivityWithListView() throws Exception {
        ListView listView = (ListView) homeScreen.findViewById(R.id.listview);

        assertNotNull(homeScreen);
        assertNotNull(listView);
    }

    @Test
    public void shouldCreateActivityWithListAndContent() {
        ListView listView = (ListView) homeScreen.findViewById(R.id.listview);

        assertNotNull(homeScreen);
        assertNotNull(listView);

        assertTrue(listView.getAdapter().getCount() > 0);
    }


    @After
    public void tearDown() throws Exception {
        homeScreenController = homeScreenController.pause().stop().destroy();
    }

}
