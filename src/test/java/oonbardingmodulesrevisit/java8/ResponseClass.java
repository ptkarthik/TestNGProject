package oonbardingmodulesrevisit.java8;

public class ResponseClass {
    private String responseBody;
    private int statusCode;

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    private String responseType;

    @Override
    public String toString() {
        return "ResponseClass{" +
                "responseBody='" + responseBody + '\'' +
                ", statusCode=" + statusCode +
                ", responseType='" + responseType + '\'' +
                '}';
    }


    public ResponseClass(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }
}
