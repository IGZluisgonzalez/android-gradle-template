package com.intelygenz.template.presenter;

import com.intelygenz.template.model.NewsElement;
import com.intelygenz.template.model.Repository;
import com.intelygenz.template.screen.IHomeScreen;

import java.util.List;

/**
 * Created by lgvalle on 05/04/14.
 */
public class HomePresenter implements IHomePresenter{

    private final IHomeScreen screen;
    private final Repository repo;

    public HomePresenter(IHomeScreen screen, Repository repo) {
        this.screen = screen;
        this.repo = repo;
    }

    @Override
    public void needNews() {
        List<NewsElement> news = repo.getNews();
        screen.displayNews(news);
    }
}
