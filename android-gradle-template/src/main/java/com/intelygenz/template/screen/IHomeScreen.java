package com.intelygenz.template.screen;

import com.intelygenz.template.model.NewsElement;

import java.util.List;

/**
 * Created by lgvalle on 05/04/14.
 */
public interface IHomeScreen {

    /**
     * Called from the {@link com.intelygenz.template.presenter.HomePresenter HomePresenter} when it has news to display
     * @param news List of news to display
     */
    public void displayNews(List<NewsElement> news);
}
