package com.happytuk.util;

public class ResponseData {

    private Integer uploaded; //1.上傳成功 0:上傳失敗
    private String fileName; //上傳的文件名
    private String url;//圖像上傳後的訪問地址
    private Error error;//上傳失敗的對象[訊息]

    //上傳成功
    public ResponseData(Integer uploaded, String fileName, String url) {
        this.uploaded = uploaded;
        this.fileName = fileName;
        this.url = url;
    }

    //上傳失敗
    public ResponseData(Integer uploaded, Error error) {
        this.uploaded = uploaded;
        this.error = error;
    }

    public Integer getUploaded() {
        return uploaded;
    }

    public void setUploaded(Integer uploaded) {
        this.uploaded = uploaded;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "uploaded=" + uploaded +
                ", fileName='" + fileName + '\'' +
                ", url='" + url + '\'' +
                ", error=" + error +
                '}';
    }
}
