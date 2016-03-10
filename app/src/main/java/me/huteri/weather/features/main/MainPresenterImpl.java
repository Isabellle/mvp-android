package me.huteri.weather.features.main;


import java.util.List;

import me.huteri.weather.model.Weather;
import me.huteri.weather.model.service.WeatherApi;
import me.huteri.weather.model.service.WeatherApiImpl;

/**
 * The implementation of the main presenter interface
 */

public class MainPresenterImpl implements MainPresenter {

    private final MainView mView;

    public MainPresenterImpl(MainView view) {
        mView = view;
    }

    @Override
    public void loadWeatherData() {

        mView.showProgress();
        WeatherApiImpl weatherApi = new WeatherApiImpl();
        weatherApi.getAllWeathers(new WeatherApi.WeatherServiceCallback<List<Weather>>() {

            @Override
            public void onSuccess(List<Weather> weathers) {
                mView.hideProgress();
                mView.showWeathers(weathers);
            }

            @Override
            public void onFailure() {
                mView.showConnectionError();
                mView.hideProgress();
            }
        });
    }

    @Override
    public void clickWeatherItem(Weather item) {
        mView.showWeatherClickedMessage(item);
    }
}
