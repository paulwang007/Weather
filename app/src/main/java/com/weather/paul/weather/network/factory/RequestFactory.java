package com.weather.paul.weather.network.factory;

/**
 * Created by Paul Wang on 7/5/2015.
 */
public class RequestFactory {

    private final RequestType mRequestType;

    public enum RequestType {
        GET,
        POST,
        DELETE
    }

    public RequestFactory(RequestType type) {

        mRequestType = type;

    }


    public RequestInterface getRequest() {

        switch (mRequestType) {
            case GET:
                new GetRequest();
                break;
            case POST:
                break;
            case DELETE:
                break;
            default:
                break;

        }

        return null;
    }

}
